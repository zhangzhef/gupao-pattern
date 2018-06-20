package com.example.gupao.vip.design.strategy.pay.payport;

import com.example.gupao.vip.design.strategy.pay.PayState;

/**
 * 支付方式
 * @author zzf
 * @date 2018/6/20 07:08.
 */
public interface Payment {

    //每次增加一个支付渠道，需要维护,看 PayType
//    public final static Payment ALI_PAY = new AliPay();
//    public final static Payment WE_CHAT = new WechatPay();
//    public final static Payment UNION_PAY = new UnionPay();
//    public final static Payment JD_PAY = new JDPay();

    PayState pay(String uid, double amount);
}
