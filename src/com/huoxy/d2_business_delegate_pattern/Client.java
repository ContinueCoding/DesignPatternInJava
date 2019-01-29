package com.huoxy.d2_business_delegate_pattern;

/**
 * 创建客户端
 */
public class Client {
    private BusinessDelegate businessService;

    public Client(BusinessDelegate delegate) {
        this.businessService = delegate;
    }

    public void doTask() {
        businessService.doTask();
    }
}
