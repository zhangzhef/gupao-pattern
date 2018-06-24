package com.example.gupao.vip.design.decorator.passport.old;

/**
 * @author zzf
 * @date 2018/6/23 15:20.
 */
public interface ISigninService {


    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password);

    /**
     * 登陆方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password);
}
