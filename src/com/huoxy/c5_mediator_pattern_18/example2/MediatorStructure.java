package com.huoxy.c5_mediator_pattern_18.example2;

public class MediatorStructure extends Mediator {

    private Person houseOwner;
    private Person tenant;

    public Person getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(Person houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if(houseOwner.equals(person)) {
            tenant.getMessage(message);
        } else if(tenant.equals(person)) {
            houseOwner.getMessage(message);
        }
    }
}
