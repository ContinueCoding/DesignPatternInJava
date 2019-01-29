package com.huoxy.a5_prototype_pattern_05;

import java.util.HashMap;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。
 *      这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 *      这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
 *      例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在
 *      需要的时候更新数据库，以此来减少数据库调用。
 *
 *      有些对象比较复杂，其创建过程过于复杂，而且我们又需要频繁的利用该对象  ---  clone!
 *
 *      发动创建的对象只需要知道原型对象的类型就可以获得更多的原型实例对象，至于这些原型对象时如何创建的根本不需要关心。
 *
 *  意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 *  主要解决：在运行期建立和删除原型。
 *
 *  何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。
 *           2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *           3、为了避免创建一个与产品类层次平行的工厂类层次时。
 *           4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *
 *  如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。
 *
 *  关键代码： 1、实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()。
 *           2、原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。
 *
 *  应用实例： 1、细胞分裂。 2、JAVA 中的 Object clone() 方法。
 *
 *  优点： 1、性能提高。 2、逃避构造函数的约束。
 *
 *  缺点： 1、配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，
 *          特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
 *        2、必须实现 Cloneable 接口。
 *
 *  使用场景： 1、资源优化场景。
 *           2、类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
 *           3、性能和安全要求的场景。
 *           4、通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
 *           5、一个对象多个修改者的场景。
 *           6、一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用。
 *           7、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone 的方法创建一个对象，
 *              然后由工厂方法提供给调用者。原型模式已经与 Java 融为浑然一体，大家可以随手拿来使用。
 *
 *  注意事项：与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，
 *          深拷贝是通过实现 Serializable 读取二进制流。
 *
 *  It is more convenient to copy an existing instance than to create a new one.
 *
 *  Example:
 *      Suppose we are doing a sales analysis on a set of data from a database. Normally, we would copy the information
 *      from the database, encapsulate it into an object and do the analysis. But if another analysis is needed on the
 *      same set of data, reading the database again and creating a new object is not the best idea. If we are using the
 *      Prototype pattern then the object used in the first analysis will be cloned and used for the other analysis.
 *
 *      The Client is here one of the methods that process an object that encapsulates information from the database.
 *      The ConcretePrototype classes will be classes that, from the object created after extracting data from the
 *      database, will copy it into objects used for analysis.
 *
 *  附：浅拷贝 vs 深拷贝：
 *
 *      *浅拷贝：使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。
 *
 *      *深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为
 *              引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。
 *
 *  *一般而言，clone()方法满足：
 *       (1) 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象。
 *       (2) 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
 *       (3) 如果对象x的equals()方法定义恰当，那么x.clone().equals(x)应该成立。
 */
public class ShapeCache {

    //缓存各个Shape
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    /**
     * 获取Shape
     * @param shapeId shapeId
     * @return
     */
    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        //与Cache中不同的对象，clone的新对象 - 具有相同的属性值！
        return (Shape) shape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadShape() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
