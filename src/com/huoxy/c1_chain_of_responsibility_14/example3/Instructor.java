package com.huoxy.c1_chain_of_responsibility_14.example3;

//辅导员
public class Instructor extends Leader {

    public Instructor(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveNote leaveNote) {
        if(leaveNote.getDayNumber() < 3) {
            System.out.println("辅导员：" + leaderName + "审批"
                    + leaveNote.getPerson() + "同学的请假条,请假天数为" + leaveNote.getDayNumber() + "天。");
        } else {
            if(successor != null) {
                successor.handleRequest(leaveNote);
            }
        }
    }
}
