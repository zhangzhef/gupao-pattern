package com.example.gupao.vip.design.strategy.pay;

/**
 * 支付状态
 * @author zzf
 * @date 2018/6/20 07:08.
 */
public class PayState {

    private int code;
    private String msg;
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
