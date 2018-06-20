package com.example.gupao.vip.design.proxy.custom;

import com.example.gupao.vip.design.proxy.jdk.XieMu;
import com.example.gupao.vip.design.proxy.statics.Person;

/**
 * @author zzf
 * @date 2018/6/19 07:50.
 */
public class CustomProxyTest {

    public static void main(String[] args) {

        try {
            Person obj = (Person)new CustomMeipo().getInstance(new XieMu());
            System.out.println(obj.getClass());
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
