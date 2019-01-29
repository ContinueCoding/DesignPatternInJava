package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * 组长
 */
public class Leader implements Interceptor {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("\nLeader.deal() --- request = " + request);

        if(request.getDays() > 1) {
            Request newRequest = new Request.Builder().newRequest(request)
                    .leaderInfo(request.getName() + "平时表现不错，而且现在项目也不忙。")
                    .build();
            return chain.proceed(newRequest);
        }

        return new Result(true, "Leader: 早去早回");
    }
}
