package com.example.gupao.vip.design.strategy.pay.payport;

import com.example.gupao.vip.design.strategy.pay.PayState;

/**
 * @author zzf
 * @date 2018/6/20 07:15.
 */
public class JDPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {

        System.out.println("欢迎使用 京东白条 支付");
//        System.out.println("微信红包 扣款");
        return new PayState(200, "支付成功", amount);
    }
}
