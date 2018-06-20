package com.example.gupao.vip.design.prototype.deep;

import java.io.Serializable;

/**
 * @author zzf
 * @date 2018/6/10 19:48.
 */
public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
