package com.huoxy.c1_chain_of_responsibility_14.example1;

import java.util.ArrayList;

/**
 * 请假管理者
 */
public class AskForLeaveManager {
    private ArrayList<Interceptor> customInterceptors;

    public AskForLeaveManager() {
        customInterceptors = new ArrayList<>();
    }

    public void addCustomInterceptor(Interceptor custom){
        customInterceptors.add(custom);
    }

    public Result execute(Request request){
        ArrayList<Interceptor> interceptors = new ArrayList<>();
        interceptors.addAll(customInterceptors);
        interceptors.add(new Leader());
        interceptors.add(new Manager());
        interceptors.add(new CEO());

        RealChain chain = new RealChain(interceptors, request, 0);
        return chain.proceed(request);
    }
}
