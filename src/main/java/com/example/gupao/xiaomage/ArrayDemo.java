package com.example.gupao.xiaomage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzf
 * @date 2018/5/27 19:49.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        String value = "a" + "b";//since java 7 StringBuilder 1个
        //
    }

    //性能 和 内存
    private static List<String> list() {

        return new ArrayList<>();
    }
}
