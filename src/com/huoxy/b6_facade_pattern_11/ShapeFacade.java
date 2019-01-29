package com.huoxy.b6_facade_pattern_11;

/**
 *  【外观模式（Facade Pattern）】隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 *   这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 *
 *  这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 *
 *  意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 *
 *  主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 *
 *  何时使用： 1、客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。
 *           2、定义系统的入口。
 *
 *  如何解决：客户端不与系统耦合，外观类与系统耦合。
 *
 *  关键代码：在客户端和复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好。
 *
 *  应用实例： 1、去医院看病，可能要去挂号、门诊、划价、取药，让患者或患者家属觉得很复杂，如果有提供接待人员，只让接待人员来处理，就很方便。
 *           2、JAVA 的三层开发模式。
 *
 *  优点： 1、减少系统相互依赖。 2、提高灵活性。 3、提高了安全性。
 *
 *  缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
 *
 *  使用场景： 1、为复杂的模块或子系统提供外界访问的模块。 2、子系统相对独立。 3、预防低水平人员带来的风险。
 *
 *  注意事项：在层次化结构中，可以使用外观模式定义系统中每一层的入口。
 *
 *
 *  TODO https://www.cnblogs.com/chenssy/p/3209451.html
 *
 *
 *  P.S.感觉电脑的例子更形象：
 *  电脑整机是 CPU、内存、硬盘的外观。有了外观以后，启动电脑和关闭电脑都简化了。
 *  直接 new 一个电脑。
 *      *在 new 电脑的同时把 cpu、内存、硬盘都初始化好并且接好线。
 *  对外暴露方法（启动电脑，关闭电脑）。
 *      *启动电脑（按一下电源键）：启动CPU、启动内存、启动硬盘
 *      *关闭电脑（按一下电源键）：关闭硬盘、关闭内存、关闭CPU
 */
public class ShapeFacade {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectange();
        this.square = new Square();
    }

    public void drawCircle(){
        //do some complicate operations
        circle.draw();
    }

    public void drawRectangle() {
        //do some complicate operations
        rectangle.draw();
    }

    public void drawSquare() {
        //do some complicate operations
        square.draw();
    }
}
