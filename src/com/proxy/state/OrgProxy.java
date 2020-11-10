package com.proxy.state;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 9:25 2020/11/10
 **/
public class OrgProxy implements StudentLearn {
    //调用核心功能的接口实现类
    private StudentLearn studentLearn;
    //构造器传参
    public OrgProxy(StudentLearnImpl studentLearn){
        this.studentLearn=studentLearn;
    }
    @Override
    public void learn(String type) {
        System.out.println("增强功能:你好,"+type+",我来帮你收集报名需要提交哪些资料");
        System.out.println("===========================");
        studentLearn.learn(type);
        System.out.println("===========================");
        System.out.println("增强功能:你好,"+type+",报名成功后,我帮你把报考所需身份资料的原件取回,帮你节省时间");
    }
}
