package com.example.gupao.vip.design.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zzf
 * @date 2018/6/18 21:56.
 */
public class CGLIBMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {

        Enhancer enhancer = new Enhancer();
        // 要把哪个类 设置为 即将 生成的新类 的父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务代码

        System.out.println("我是媒婆：我要给你找对象。");
        System.out.println("开始物色");
        methodProxy.invokeSuper(o, objects);

        System.out.println("如果合适的话，就准备约会");
        return null;
    }
}
