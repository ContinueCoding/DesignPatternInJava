package com.huoxy.d1_mvc_pattern;

//View（视图） - 视图代表模型包含的数据的可视化。
public class StudentView {

    public void printStudentDetail(String name, String rollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

}
