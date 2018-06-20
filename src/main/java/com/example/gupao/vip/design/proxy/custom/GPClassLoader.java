package com.example.gupao.vip.design.proxy.custom;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author zzf
 * @date 2018/6/18 22:49.
 */
public class GPClassLoader extends ClassLoader {
    
    private File classPathFile;
    
    public GPClassLoader() {
        String path = GPClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = GPClassLoader.class.getPackage().getName() + "." + name;

        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteOutputStream out = null;

                try {
                    in = new FileInputStream(classPathFile);
                    out = new ByteOutputStream();

                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) != -1) {
                        out.write(buf, 0, buf.length);
                    }

                    return defineClass(className, out.toByteArray(), 0, out.size());


                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    if (out != null) {
                        try {
                            out.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}
