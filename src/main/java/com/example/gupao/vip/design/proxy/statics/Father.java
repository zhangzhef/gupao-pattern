package com.example.gupao.vip.design.proxy.statics;

/**
 * @author zzf
 * @date 2018/6/15 10:57.
 */
public class Father {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("look for");
        son.findLove();
        System.out.println("over");
    }
}
