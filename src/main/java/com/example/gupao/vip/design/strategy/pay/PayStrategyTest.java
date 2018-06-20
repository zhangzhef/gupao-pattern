package com.example.gupao.vip.design.strategy.pay;

import com.example.gupao.vip.design.strategy.pay.payport.PayType;

/**
 * @author zzf
 * @date 2018/6/20 07:13.
 */
public class PayStrategyTest {

    public static void main(String[] args) {

        Order order = new Order("1", "20180619333", 20.5);

        //支付渠道：支付宝、微信。。。
        //每个渠道它支付的具体算法是不一样的。

        //这个值是支付的时候才决定的
        System.out.println(order.pay(PayType.WECHAT_PAY));


        /*new ArrayList().sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });*/

        //根据url去自动选择
        //爬取 百度数据  BaiduParser
        //             SinaParser
    }
}
