package com.huoxy.c12_visitor_pattern_25;

/**
 *  在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。
 *
 *  这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 *
 *
 *  意图：主要将数据结构与数据操作分离。
 *
 *  主要解决：稳定的数据结构和易变的操作耦合问题。
 *
 *  何时使用：需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。
 *
 *  如何解决：在被访问的类里面加一个对外提供接待访问者的接口！！！
 *
 *  关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者！！！
 *
 *  应用实例：您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，
 *          然后对朋友的描述做出一个判断，这就是访问者模式。
 *
 *  优点： 1、符合单一职责原则。
 *        2、优秀的扩展性。
 *        3、灵活性。
 *
 *  缺点： 1、具体元素对访问者公布细节，违反了迪米特原则。
 *        2、具体元素变更比较困难。
 *        3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
 *
 *  使用场景： 1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 *           2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 *
 *  注意事项：访问者可以对功能进行统一，可以做报表、UI、拦截器与过滤器。
 *
 *
 *  TODO https://www.cnblogs.com/chenssy/p/3339756.html
 *
 *      *明确一点就是访问者模式适用于数据结构相对稳定的系统。它是将数据的操作与数据结构进行分离了，如果某个系统的数据结构相对稳定，
 *       但是操作算法易于变化的话，就比较适用适用访问者模式，因为访问者模式使得算法操作的增加变得比较简单了。
 *
 *      *同时在访问者模式用到了一种双分派的技术，所谓双分派技术就是在选择一个方法的时候，不仅仅
 *       要根据消息接收者（receiver）的运行时区别（Run time type），还要根据参数的运行时区别。
 *       在访问者模式中，客户端将具体状态当做参数传递给具体访问者，这里完成第一次分派，
 *       然后具体访问者作为参数的“具体状态”中的方法，同时也将自己this作为参数传递进去，
 *       这里就完成了第二次分派。双分派意味着得到的执行操作决定于请求的种类和接受者的类型。
 *
 *      *
 *
 */
public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        for(ComputerPart part : parts) {
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}
