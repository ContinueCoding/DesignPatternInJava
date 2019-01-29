package com.huoxy.c1_chain_of_responsibility_14.example3;

public class President extends Leader {

    public President(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveNote leaveNote) {
        if(leaveNote.getDayNumber() <= 15) {
            System.out.println("校长：" + leaderName + "审批"
                    + leaveNote.getPerson() + "同学的请假条,请假天数为" + leaveNote.getDayNumber() + "天。");
        } else {
            System.out.println("请假时间超过15天，不批准！");
        }
    }
}
