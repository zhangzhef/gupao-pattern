package com.example.gupao.vip.design.observer.subject;

import com.example.gupao.vip.design.observer.core.Event;

/**
 * @author zzf
 * @date 2018/6/23 20:33.
 */
public class Observer {

    public void advice(Event e) {
        System.out.println("======触发事件，打印日志:" + e);
    }
}
