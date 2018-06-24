package com.example.gupao.vip.design.decorator.passport.upgrade;

import com.example.gupao.vip.design.decorator.passport.old.ISigninService;
import com.example.gupao.vip.design.decorator.passport.old.ResultMsg;

/**
 * @author zzf
 * @date 2018/6/23 19:55.
 */
public interface ISigninForThirdService extends ISigninService {

    //扩展
    public ResultMsg loginForQQ(String openId);
    public ResultMsg loginForWechat(String id);

    public ResultMsg loginForToken(String token);
    public ResultMsg loginForTelphone(String telphone, String code) ;

    public ResultMsg loginForRegister(String username, String  password);
}
