package com.huoxy.c1_chain_of_responsibility_14.example3;

//请假条 - 请假人、天数
public class LeaveNote {
    private String person;
    private int dayNumber;

    public LeaveNote(String person, int dayNumber) {
        this.person = person;
        this.dayNumber = dayNumber;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
}
