package com.example.gupao.vip.design.observer.mouse;

import com.example.gupao.vip.design.observer.core.Event;

/**
 * 回调 响应的逻辑
 * @author zzf
 * @date 2018/6/23 21:07.
 */
public class MouseEventCallback {

    public void onClick(Event e) {
        System.out.println("==触发了鼠标单击事件==:" + e);
    }

    public void onDoubleClick(Event e) {
        System.out.println("==触发了鼠标双击事件==:" + e);
    }

    public void onUpk(Event e) {
        System.out.println("==触发了鼠标弹起事件==:" + e);
    }

    public void onDown(Event e) {
        System.out.println("==触发了鼠标按下事件==:" + e);
    }

    public void onMove(Event e) {
        System.out.println("==触发了鼠标移动事件==:" + e);
    }

    public void onOver(Event e) {
        System.out.println("==触发了鼠标悬停事件==:" + e);
    }
}
