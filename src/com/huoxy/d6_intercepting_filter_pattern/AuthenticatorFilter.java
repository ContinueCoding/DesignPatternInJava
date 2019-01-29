package com.huoxy.d6_intercepting_filter_pattern;

public class AuthenticatorFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
