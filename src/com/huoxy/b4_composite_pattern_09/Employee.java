package com.huoxy.b4_composite_pattern_09;

import java.util.ArrayList;
import java.util.List;

/**
 * 【组合模式（Composite Pattern）】，又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 *  组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 *  这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 *
 *  这种模式创建了一个【包含自己对象组的类。该类提供了修改相同对象组的方式。】
 *
 *  组合模式定义了如何将容器对象和叶子对象进行递归组合，使得客户在使用的过程中无须进行区分，可以对他们进行一致的处理。
 *
 *
 *  意图：将对象组合成树形结构以表示"部分-整体"的层次结构。
 *       组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *
 *  主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
 *
 *  何时使用： 1、您想表示对象的部分-整体层次结构（树形结构）。
 *           2、您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 *
 *  如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
 *
 *  关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
 *
 *  应用实例： 1、算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作数、操作符和另一个操作数。
 *           2、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。
 *
 *  优点： 1、高层模块调用简单。 2、节点自由增加。
 *
 *  缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 *
 *  使用场景：部分、整体场景，如树形菜单，【文件、文件夹的管理】。
 *
 *  注意事项：定义时为具体类。
 *
 *  TODO https://www.cnblogs.com/chenssy/p/3299719.html
 *
 *  总结：
 *      1、 组合模式用于将多个对象组合成树形结构以表示“整体-部分”的结构层次。
 *          组合模式对单个对象（叶子对象）和组合对象（容器对象）的使用具有一致性。
 *
 *      2、 组合对象的关键在于它定义了一个抽象构建类，它既可表示叶子对象，也可表示容器对象，
 *          客户仅仅需要针对这个抽象构建进行编程，无须知道他是叶子对象还是容器对象，都是一致对待。
 *
 *      3、 组合模式虽然能够非常好地处理层次结构，也使得客户端程序变得简单，但是它也使得设计变得更加抽象，
 *          而且也很难对容器中的构件类型进行限制，这会导致在增加新的构件时会产生一些问题。
 */
public class Employee {
    private String name;
    private String department;
    private int salary;
    //下属
    private List<Employee> subordinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
