package com.example.gupao.vip.design.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zzf
 * @date 2018/6/23 20:45.
 */
public class EventListner {

    //相当注册器
    protected Map<Enum, Event> events = new HashMap<>();

    /**
     *
     * @param eventType 事件
     * @param target 观察者
     * @param callback 回调
     */
    public void addListner(Enum eventType, Object target, Method  callback) {

        //注册事件
        //用反射调用这个方法
        events.put(eventType, new Event(target, callback));
    }

    private void trigger(Event e) {
        e.setSource(this);
        e.setTime(System.currentTimeMillis());

        try {
            e.getCallBack().invoke(e.getTarget(), e);
        } catch (Exception e1) {
            e1.printStackTrace();
        }


    }


    protected void trigger(Enum call) {
        if (!this.events.containsKey(call)) {
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));

    }
}
