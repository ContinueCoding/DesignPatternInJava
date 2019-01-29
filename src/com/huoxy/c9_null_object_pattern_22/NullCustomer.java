package com.huoxy.c9_null_object_pattern_22;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not available in Customer database";
    }
}
