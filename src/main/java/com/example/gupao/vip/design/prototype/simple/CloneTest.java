package com.example.gupao.vip.design.prototype.simple;

/**
 * @author zzf
 * @date 2018/6/10 19:36.
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype();
        p.name = "Tom";
        p.list.add("1");

        try {
            Prototype clone = (Prototype) p.clone();

            System.out.println(clone.name);
            System.out.println(clone.list);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
