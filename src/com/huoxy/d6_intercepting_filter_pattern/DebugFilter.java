package com.huoxy.d6_intercepting_filter_pattern;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
