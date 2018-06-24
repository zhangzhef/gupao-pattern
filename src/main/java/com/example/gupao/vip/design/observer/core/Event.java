package com.example.gupao.vip.design.observer.core;

import java.lang.reflect.Method;

/**
 * 事件
 * @author zzf
 * @date 2018/6/23 20:35.
 */
public class Event {

    //事件源
    private Object source;
    //通知目标
    private Object target;
    //回调
    private Method callBack;
    //触发
    private String trigger;

    private long time;

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }

    public Object getSource() {
        return source;
    }

    void setSource(Object source) {
        this.source = source;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    public String getTrigger() {
        return trigger;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return  this;
    }


    @Override
    public String toString() {
        return "Event{" +
                "\nsource=" + source +
                ", \ntarget=" + target +
                ", \ncallBack=" + callBack +
                ", \ntrigger='" + trigger + '\'' +
                ", \ntime=" + time +
                '}';
    }
}
