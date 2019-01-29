package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * 请假结果类
 */
public class Result {
    private boolean agreed;
    private String info;

    public Result() {
    }

    public Result(boolean agreed, String info) {
        this.agreed = agreed;
        this.info = info;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "agreed=" + agreed +
                ", info='" + info + '\'' +
                '}';
    }
}
