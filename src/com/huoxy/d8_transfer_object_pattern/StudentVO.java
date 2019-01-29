package com.huoxy.d8_transfer_object_pattern;

import java.util.Objects;

//创建传输对象
public class StudentVO {

    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentVO)) return false;
        StudentVO studentVO = (StudentVO) o;
        return getRollNo() == studentVO.getRollNo() &&
                Objects.equals(getName(), studentVO.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getRollNo());
    }
}
