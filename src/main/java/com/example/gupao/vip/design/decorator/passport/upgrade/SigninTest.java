package com.example.gupao.vip.design.decorator.passport.upgrade;

import com.example.gupao.vip.design.decorator.passport.old.SigninService;

/**
 * @author zzf
 * @date 2018/6/23 19:59.
 */
public class SigninTest {

    public static void main(String[] args) {

        //原来的功能依然对外开放，依旧保留
        //新的功能同样 也可以使用

        ISigninForThirdService service = new SigninForThirdService(new SigninService());
        service.loginForQQ("加密");

        /**

         ==========================================================
          装饰者模式                          适配器模式
         ------------------------------------------------------------
         是一种非常特别的适配器模式           可以不保留层级关系
         -------------------------------------------------------------
         装饰者和被装饰者都要实现统一个接口     适配者和被适配者没有必然的联系
         主要目的是为了扩展，依旧保留OOP关系    通常采用代理或继承的形式进行包装
         -------------------------------------------------------------
          满足is-a的关系                     满足 has-a
         ------------------------------------------------------------
         注重的是覆盖和扩展                   注重的是兼容和转换
         */

    }


}
