package com.proxy.state;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 9:27 2020/11/10
 **/
public class Test {
    public static void main(String[] args) {
        OrgProxy orgProxy = new OrgProxy(new StudentLearnImpl());
        orgProxy.learn("数学");
    }
}
