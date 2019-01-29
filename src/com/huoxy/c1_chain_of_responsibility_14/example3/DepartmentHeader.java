package com.huoxy.c1_chain_of_responsibility_14.example3;

public class DepartmentHeader extends Leader {

    public DepartmentHeader(String leaderName) {
        super(leaderName);
    }

    @Override
    public void handleRequest(LeaveNote leaveNote) {
        if(leaveNote.getDayNumber() <= 7) {
            System.out.println("系主任：" + leaderName + "审批"
                    + leaveNote.getPerson() + "同学的请假条,请假天数为" + leaveNote.getDayNumber() + "天。");
        } else {
            if (successor != null) {
                successor.handleRequest(leaveNote);
            }
        }

    }
}
