package com.huoxy.c1_chain_of_responsibility_14.example3;

/**
 * 责任链模式实例 - 请假条，逐级上报！
 *
 */
public abstract class Leader {

    protected String leaderName;
    protected Leader successor;

    public Leader(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNote leaveNote);
}
