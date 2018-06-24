package com.example.gupao.vip.design.decorator.passport.upgrade;

import com.example.gupao.vip.design.decorator.passport.old.ISigninService;
import com.example.gupao.vip.design.decorator.passport.old.ResultMsg;

/**
 * @author zzf
 * @date 2018/6/23 19:56.
 */
public class SigninForThirdService implements ISigninForThirdService {

    private ISigninService service;
    public SigninForThirdService(ISigninService service) {
        this.service = service;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当作是一个用户名
        //2、密码默认为null
        //3、注册，（在原有系统里面创建一个用户）
        ResultMsg msg = this.regist(openId, null);
        //4、调用原来的登陆方法
        ResultMsg login = this.login(openId, null);
        return login;
    }

    @Override
    public ResultMsg loginForWechat(String id) {

        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {

        //通过token 拿到用户信息，再重新登录一次

        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {

        return null;
    }

    @Override
    public ResultMsg loginForRegister(String username, String  password) {

        return null;
    }
}
