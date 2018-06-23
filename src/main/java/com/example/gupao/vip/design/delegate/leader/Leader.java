package com.example.gupao.vip.design.delegate.leader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzf
 * @date 2018/6/23 10:37.
 */
public class Leader implements ITarget {

    private Map<String, ITarget> target = new HashMap<>();

    public Leader() {
        target.put("加密", new TargetA());
        target.put("登陆", new TargetB());
    }

    @Override
    public void doing(String command) {

        //项目经理 自己不干活
        System.out.println("接收任务：" + command);
        target.get(command).doing(command);
    }
}
