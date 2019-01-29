package com.huoxy.c1_chain_of_responsibility_14.example1;

import java.util.List;

/**
 * 实现Chain的真正的包装Request和转发功能
 */
public class RealChain implements Interceptor.Chain{
    public List<Interceptor> interceptorList;
    public Request request;
    public int index;

    /**
     * Constructor
     * @param interceptorList 处理请假请求的人
     * @param request 请假请求
     * @param index 已处理过该请求的人数
     */
    public RealChain(List<Interceptor> interceptorList, Request request, int index) {
        this.interceptorList = interceptorList;
        this.request = request;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result proceed(Request request) {
        Result result = null;

        if(interceptorList.size() > index) {
            RealChain chain = new RealChain(interceptorList, request, index + 1);
            Interceptor interceptor = interceptorList.get(index);
            result = interceptor.deal(chain);
        }

        return result;
    }
}
