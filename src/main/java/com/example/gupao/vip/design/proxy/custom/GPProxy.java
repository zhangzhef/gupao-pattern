package com.example.gupao.vip.design.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zzf
 * @date 2018/6/18 22:48.
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class[] interfaces, GPInvocatianHandler handler) throws IOException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //1、动态生成源代码  .java文件
        String src = generateSrc(interfaces);

        //2、java文件输出到磁盘
        String filePath = GPProxy.class.getResource("").getPath();
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(src);
        fw.flush();
        fw.close();
        //3、把生成的   .java文件编译成 .clss文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null,null);
        Iterable iterable = manager.getJavaFileObjects(f);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, null);
        task.call();
        manager.close();
        //4、编译生成的.class文件加载到 JVM中

        Class<?> proxyClass = classLoader.findClass("$Proxy0");
        Constructor<?> c = proxyClass.getConstructor(GPInvocatianHandler.class);

        //5、返回字节码重组以后的新的代理对象
        return c.newInstance(handler);
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.vip.pattern.proxy.custom;" + ln);
        sb.append("import com.gupaoedu.vip.pattern.proxy.staticed.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("GPInvocationHandler h;" + ln);

        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);


        return sb.toString();
    }
}
