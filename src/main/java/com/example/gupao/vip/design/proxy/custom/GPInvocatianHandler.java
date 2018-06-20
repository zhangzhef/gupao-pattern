package com.example.gupao.vip.design.proxy.custom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zzf
 * @date 2018/6/18 22:49.
 */
public interface GPInvocatianHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;
}
