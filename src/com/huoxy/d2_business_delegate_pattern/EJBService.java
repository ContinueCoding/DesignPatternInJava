package com.huoxy.d2_business_delegate_pattern;

/**
 * 创建实体服务类 - EJB(Enterprise JavaBean)是J2EE服务器端的组件模型,
 *               EJB包括会话Bean(Session Bean)、实体Bean(Entity Bean)、消息驱动Bean(Message Driven Bean)
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
