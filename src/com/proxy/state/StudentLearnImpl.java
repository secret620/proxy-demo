package com.proxy.state;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 9:21 2020/11/10
 **/
public class StudentLearnImpl implements StudentLearn {
    @Override
    public void learn(String type) {
        System.out.println("学习类别:"+type);
    }
}
