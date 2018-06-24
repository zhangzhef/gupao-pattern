package com.example.gupao.vip.design.adapt.passport;

import com.example.gupao.vip.design.adapt.ResultMsg;

/**
 * 稳定的方法不去动，直接集成
 * @author zzf
 * @date 2018/6/23 15:25.
 */
public class SiginForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当作是一个用户名
        //2、密码默认为null
        //3、注册，（在原有系统里面创建一个用户）
        ResultMsg msg = super.regist(openId, null);
        //4、调用原来的登陆方法
        ResultMsg login = super.login(openId, null);
        return login;
    }

    public ResultMsg loginForWechat(String id) {

        return null;
    }

    public ResultMsg loginForToken(String token) {

        //通过token 拿到用户信息，再重新登录一次

        return null;
    }

    public ResultMsg loginForTelphone(String telphone, String code) {

        return null;
    }

    public ResultMsg loginForRegister(String username, String  password) {

        return null;
    }
}
