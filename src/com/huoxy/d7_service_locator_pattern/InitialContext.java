package com.huoxy.d7_service_locator_pattern;

public class InitialContext {

    public Object lookUp(String jndiName) {
        if(jndiName.equalsIgnoreCase("service1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if(jndiName.equalsIgnoreCase("service2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        } else {
            throw new IllegalArgumentException("Invalid jndi: " + jndiName);
        }
    }
}
