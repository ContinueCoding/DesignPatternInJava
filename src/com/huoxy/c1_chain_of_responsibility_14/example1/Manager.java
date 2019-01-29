package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * 经理
 */
public class Manager implements Interceptor {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("\nManager.deal() --- request = " + request);

        if(request.getDays() > 3) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .managerInfo(request.getName() + "KPI考核优秀，可以批准。")
                    .build();
            return chain.proceed(newRequest);
        }

        return new Result(true, "Manager: 快去快回，项目需要你。");
    }
}
