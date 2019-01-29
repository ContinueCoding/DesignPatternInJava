package com.huoxy.d4_data_access_object_pattern;

import java.util.List;

//创建数据访问对象接口
public interface StudentDao {

    List<Student> getAllStudents();

    Student getStudentByRollNo(String rollNo);

    boolean addStudent(Student student);

    boolean removeStudent(Student student);
}
