package com.example.gupao.vip.design.proxy.cglib;

/**
 * @author zzf
 * @date 2018/6/18 22:10.
 */
public class CGLIBTest {

    public static void main(String[] args) {

        ZhangSan obj = (ZhangSan)new CGLIBMeipo().getInstance(ZhangSan.class);
        obj.findLove();
        System.out.println("----------");
        System.out.println(obj.getClass());
    }
}
