package com.example.gupao.vip.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zzf
 * @date 2018/6/17 22:14.
 */
public class JDKMeipo implements InvocationHandler{

    private XieMu target;

    public Object getInstance(XieMu target) {

        this.target = target;

        Class<?> clazz = target.getClass();

        //生成一个新的对象（字节码重组）
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是媒婆");
        System.out.println("开始物色");

        method.invoke(proxy);
        return null;
    }
}
