package com.example.gupao.vip.design.observer.subject;

import com.example.gupao.vip.design.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @author zzf
 * @date 2018/6/24 08:16.
 */
public class SubjectTest {

    public static void main(String[] args) {
        
        Observer observer = new Observer();

        Method advice = null;
        try {
            advice = Observer.class.getMethod("advice", Event.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        Subject subject = new Subject();
        
        subject.addListner(SubjectEventEnum.ON_ADD, observer, advice);

        subject.add();
    }
}
