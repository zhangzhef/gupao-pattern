package com.example.gupao.vip.design.delegate.leader;

/**
 * @author zzf
 * @date 2018/6/23 10:37.
 */
public class TargetB implements ITarget{
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，开始工作：" + command);
    }
}
