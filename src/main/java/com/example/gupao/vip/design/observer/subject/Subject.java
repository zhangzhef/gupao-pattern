package com.example.gupao.vip.design.observer.subject;

import com.example.gupao.vip.design.observer.core.EventListner;

/**
 * @author zzf
 * @date 2018/6/23 20:32.
 */
public class Subject extends EventListner {


    //通常是 通过动态代理来实现解耦合，避免了代码侵入
    public void add() {
        System.out.println("调用添加方法");
        this.trigger(SubjectEventEnum.ON_ADD);
    }

    public void remove() {
        System.out.println("调用remove方法");
        this.trigger(SubjectEventEnum.ON_REMOVE);
    }
}
