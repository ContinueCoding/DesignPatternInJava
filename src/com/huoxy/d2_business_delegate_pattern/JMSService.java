package com.huoxy.d2_business_delegate_pattern;

/**
 * Java消息服务（Java Message Service）
 *
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
