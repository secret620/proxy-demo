package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 9:29 2020/11/10
 **/
public class ServiceProxy {
    public static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态增强功能1:登录权限认证");
                System.out.println("动态增强功能2:黑名单验证");
                System.out.println("=====================");
                Object invoke = method.invoke(target, args);//执行被代理的核心业务功能
                System.out.println("=====================");
                System.out.println("动态增强功能3:进入订单中心");
                return invoke;
            }
        });
    }

}
