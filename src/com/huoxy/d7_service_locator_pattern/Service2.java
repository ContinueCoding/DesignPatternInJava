package com.huoxy.d7_service_locator_pattern;

public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Service2 executing...");
    }
}
