package com.example.gupao.xiaomage;

import java.util.Objects;

/**
 * @author zzf
 * @date 2018/5/27 19:40.
 */
public class NullDemo {

    public static void main(String[] args) {

        Object o = null;
        //java 7+
        System.out.println(Objects.isNull(o));
    }

    // before java 7
    private static boolean isNull(Object o) {

        return o == null;
    }
}
