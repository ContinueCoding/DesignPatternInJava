package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * 责任链模式核心接口
 */
public interface Interceptor {
    Result deal(Chain chain);

    //转发请假请求 & 获取请假结果
    interface Chain{
        Request request();
        Result proceed(Request request);
    }
}
