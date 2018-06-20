package com.example.gupao.vip.design.proxy.jdk;

import com.example.gupao.vip.design.proxy.statics.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author zzf
 * @date 2018/6/19 07:35.
 */
public class JDKProxyTest {

    public static void main(String[] args) throws Exception {

        Person obj = (Person)new JDK58().getInstance(new XieMu());
        System.out.println(obj.getClass());
        obj.findLove();;
        //原理：
        //1、拿到被代理对象的引用，并且获取它的所有接口，反射获取
        //2、 JDK proxy类重新生成一个新的类，同时新的类要实现被代理类的所有接口
        //3、动态生成java代码，把新加的业务逻辑方法由 一定的逻辑代码去调用（代码中体现）
        //4、编译新生成的java代码.class
        //5、再重新加载到JVM中运行
        // 字节码重组

        //
        //反编译工具，查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("$Proxy0.class");
        os.write(bytes);

        os.close();


    }
}
