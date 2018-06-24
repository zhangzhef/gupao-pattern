package com.example.gupao.vip.design.observer.mouse;

import com.example.gupao.vip.design.observer.core.EventListner;

/**
 * @author zzf
 * @date 2018/6/23 21:05.
 */
public class Mouse extends EventListner {

    public void click() {
        System.out.println("单机");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick() {
        System.out.println("双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up() {
        System.out.println("谈起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down() {
        System.out.println("按下");
        this.trigger(MouseEventType.ON_DOWN);
    }

    public void wheel() {
        System.out.println("滚动");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void move() {
        System.out.println("移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void over() {
        System.out.println("悬停");
        this.trigger(MouseEventType.ON_OVER);
    }
}
