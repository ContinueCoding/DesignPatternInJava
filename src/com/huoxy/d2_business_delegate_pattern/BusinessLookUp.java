package com.huoxy.d2_business_delegate_pattern;

/**
 * 创建业务查询服务
 */
public class BusinessLookUp {

    public static final String BUSINESS_TYPE_EJB = "EJB";
    public static final String BUSINESS_TYPE_JMS = "JMS";

    /**
     * 获取相应的BusinessService
     * @param serviceType EJB、JMS
     * @return
     */
    public BusinessService getBusinessService(String serviceType) {
        if (BUSINESS_TYPE_EJB.equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else if (BUSINESS_TYPE_JMS.equalsIgnoreCase(serviceType)) {
            return new JMSService();
        } else {
            throw new IllegalArgumentException("Invalid serviceType: " + serviceType);
        }
    }

}
