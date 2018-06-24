package com.example.gupao.vip.design.observer.mouse;

import com.example.gupao.vip.design.observer.core.Event;

import java.lang.reflect.Method;

/**
 * 事件的注册和监听
 * @author zzf
 * @date 2018/6/23 21:09.
 */
public class MouseTest {

    public static void main(String[] args) {


        //观察者和被观察者没有必然联系
        //注册的时候，才产生联系

        //解耦合

        MouseEventCallback callback = new MouseEventCallback();
        Method onClick = null;
        try {
            onClick = MouseEventCallback.class.getMethod("onClick", new Class[]{Event.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Mouse mouse = new Mouse();

        mouse.addListner(MouseEventType.ON_CLICK, callback, onClick);
        mouse.click();
    }
}
