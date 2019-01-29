package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * ceo
 */
public class CEO implements Interceptor {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("\nCEO.deal() --- request = " + request);

        if(request.getDays() > 7) {
            return new Result(false, "CEO: 请假时间太长，项目需求紧急，不予批准。");
        }

        return new Result(true, "CEO: 不要着急，处理事情重要。");
    }
}
