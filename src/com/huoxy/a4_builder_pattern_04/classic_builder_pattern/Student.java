package com.huoxy.a4_builder_pattern_04.classic_builder_pattern;

/**
 * Builder模式的链式调用！！！
 */
public class Student {

    private int id;
    private String name;
    private String password;
    private String sex;
    private String address;

    //TODO 0 - 构造器尽量缩小范围
    private Student() {
    }

    //TODO 1 - 提供给Builder用的构造方法！
    private Student(Student origin) {
        this.id = origin.id;
        this.name = origin.name;
        this.password = origin.password;
        this.sex = origin.sex;
        this.address = origin.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    /**
     * Student的创建完全依靠Student.Builder，使用一种方法链的方式来创建 *
     */
    public static class Builder {
        private Student target;

        //TODO 2 - 构造空的Student！
        //在构建时如果有必传参数和可选参数，可以为 Builder 类添加【带参构造函数】来保证必传参数不会遗漏!
        public Builder() {
            target = new Student();
        }

        public Builder address(int id) {
            target.id = id;
            return this;
        }

        public Builder id(int id) {
            target.id = id;
            return this;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder password(String passwd) {
            target.password = passwd;
            return this;
        }

        public Builder sex(String sex) {
            target.sex = sex;
            return this;
        }

        public Builder address(String address) {
            target.address = address;
            return this;
        }

        //TODO 3 - build时创建完整的Student对象 & 返回！
        public Student build() {
            return new Student(target);
        }
    }

}
