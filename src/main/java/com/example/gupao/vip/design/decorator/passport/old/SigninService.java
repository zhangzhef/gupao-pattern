package com.example.gupao.vip.design.decorator.passport.old;


/**
 * @author zzf
 * @date 2018/6/23 15:20.
 */
@Deprecated
public class SigninService implements ISigninService{


    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg regist(String username, String password) {

        return new ResultMsg(0, "", "");
    }

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResultMsg login(String username, String password){
        return null;
    }
}
