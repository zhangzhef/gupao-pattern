package com.example.gupao.vip.design.proxy.custom;

import com.example.gupao.vip.design.proxy.statics.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zzf
 * @date 2018/6/19 07:47.
 */
public class CustomMeipo implements GPInvocatianHandler {

    //被代理对象
    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;

        Class<?> clazz = target.getClass();

        //下半截，老师深入底层来给大家讲解字节码是如何重组的
        //用来生成一个新的对象（字节码重组来实现）
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");

        method.invoke(this.target,args);

        System.out.println("如果合适的话，就准备办事");

        return  null;

    }
}
