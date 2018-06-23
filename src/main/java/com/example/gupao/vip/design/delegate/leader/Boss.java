package com.example.gupao.vip.design.delegate.leader;

/**
 * @author zzf
 * @date 2018/6/23 10:37.
 */
public class Boss {

    public static void main(String[] args) {

        //客户请求（Boss）、委派者（Leader）、被委派者
        //委派者：要持有被委派者的引用
        //代理模式注重的是过程， 委派模式 注重的是结果
        //策略模式注重的是可扩展（外部扩展）， 委派模式 注重 内部的灵活和复用

        //委派模式：是 静态代理和策略模式的一种特殊组合。



        new Leader().doing("加密");
    }
}
