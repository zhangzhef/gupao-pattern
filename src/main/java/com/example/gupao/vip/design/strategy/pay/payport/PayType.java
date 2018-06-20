package com.example.gupao.vip.design.strategy.pay.payport;

/**
 * @author zzf
 * @date 2018/6/20 07:24.
 */
public enum PayType {

    //支付渠道， 当作 常量 维护
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get() {
        return this.payment;
    }
}
