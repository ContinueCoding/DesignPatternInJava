package com.huoxy.d7_service_locator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ServiceCache {

    private List<Service> serviceCache;

    public ServiceCache() {
        serviceCache = new ArrayList<>();
    }

    /**
     * 获取缓存的Service
     * @param serviceName serviceName
     * @return
     */
    public Service getService(String serviceName) {
        for(Service service : serviceCache) {
            if(service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  "+ serviceName + " service!");
                return service;
            }
        }

        return null;
    }

    /**
     * 添加新的缓存Service
     * @param newService 新service
     */
    public void addService(Service newService) {
        boolean exist = false;
        for (Service service : serviceCache) {
            if(service.getName().equalsIgnoreCase(newService.getName())) {
                exist = true;
            }
        }
        if(!exist) {
            System.out.println("add "+ newService.getName() + " service to cache!");
            serviceCache.add(newService);
        }
    }
}
