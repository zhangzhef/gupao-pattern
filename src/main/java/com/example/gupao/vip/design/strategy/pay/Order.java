package com.example.gupao.vip.design.strategy.pay;

import com.example.gupao.vip.design.strategy.pay.payport.PayType;

/**
 * @author zzf
 * @date 2018/6/20 07:05.
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }


    //这个餐素好，完全可以用 Payment 这个接口代替
    //why？
    // 完美地解决了 switch 地过程，不需要在代码逻辑中写switch了
    //更不需要写 if else
    public PayState pay(PayType payType) {

//        return payment.pay(uid, amount);
        return payType.get().pay(uid, amount);
    }
}
