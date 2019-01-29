package com.huoxy.d4_data_access_object_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来。
 *
 * 以下是数据访问对象模式的参与者。
 *
 *     数据访问对象接口（Data Access Object Interface） - 该接口定义了在一个模型对象上要执行的标准操作。
 *     数据访问对象实体类（Data Access Object concrete class） - 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。
 *     模型对象/数值对象（Model Object/Value Object） - 该对象是简单的 POJO，包含了 get/set 方法来存储通过使用 DAO 类检索到的数据。
 *
 */
public class StudentDaoImpl implements StudentDao {
    //列表模拟数据库
    private List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student("Tom", "001"));
        students.add(new Student("Jim", "002"));
        students.add(new Student("Green", "003"));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentByRollNo(String rollNo) {
        for(Student student : students) {
            if(student.getRollNo().equalsIgnoreCase(rollNo)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    @Override
    public boolean removeStudent(Student student) {
        return students.remove(student);
    }
}
