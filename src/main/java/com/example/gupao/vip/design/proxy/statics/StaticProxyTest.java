package com.example.gupao.vip.design.proxy.statics;

/**
 * 静态代理，在代理前，所有东西都是已知。
 *
 * 动态代理，未知
 * @author zzf
 * @date 2018/6/17 22:01.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);

        father.findLove();
    }
}
