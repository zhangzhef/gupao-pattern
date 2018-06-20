package com.example.gupao.vip.design.prototype.simple;

import java.util.ArrayList;

/**
 * @author zzf
 * @date 2018/6/10 19:35.
 */
public class Prototype {

    public String name;

    public ArrayList<String> list = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
