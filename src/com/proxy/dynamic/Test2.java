package com.proxy.dynamic;

import com.proxy.state.OrgProxy;
import com.proxy.state.StudentLearnImpl;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 9:27 2020/11/10
 **/
public class Test2 {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        userService = (UserService)ServiceProxy.newProxyInstance(userService);
        userService.testUserService();
        userService.testUserService2();
        System.out.println("***************************");
        OrderService orderService=new OrderServiceImpl();
        orderService = (OrderService)ServiceProxy.newProxyInstance(orderService);
        orderService.testOrderService();
    }
}
