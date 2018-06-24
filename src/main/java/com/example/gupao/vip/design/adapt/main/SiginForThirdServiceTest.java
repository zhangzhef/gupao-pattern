package com.example.gupao.vip.design.adapt.main;

import com.example.gupao.vip.design.adapt.passport.SiginForThirdService;

/**
 * @author zzf
 * @date 2018/6/23 15:29.
 */
public class SiginForThirdServiceTest {

    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
        //可以加策略
        service.loginForQQ("123");
    }
}
