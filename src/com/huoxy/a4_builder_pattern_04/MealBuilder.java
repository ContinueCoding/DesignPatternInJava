package com.huoxy.a4_builder_pattern_04;

/**
 * MealBuilder 类 - 负责创建 Meal 对象。
 *
 *  【建造者模式（Builder Pattern）】 - 使用多个简单的对象一步一步构建成一个复杂的对象。
 *      这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *      一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 *
 *  意图：将一个复杂的[构建]与其[表示]相分离，使得同样的构建过程可以创建不同的表示。
 *
 *  主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
 *          由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 *  何时使用：一些基本部件不会变，而其组合经常变化的时候。
 *
 *  如何解决：将变与不变分离开。
 *
 *  关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系(?)。
 *
 *  应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。 2、JAVA 中的 StringBuilder。
 *
 *  优点： 1、建造者独立，易扩展。 2、便于控制细节风险。
 *
 *  缺点： 1、产品必须有共同点，范围有限制。
 *        2、如内部变化复杂，会有很多的建造类。
 *
 *  使用场景： 1、需要生成的对象具有[复杂的内部结构]。 2、需要生成的对象内部属性本身相互依赖。
 *
 *  注意事项：与工厂模式的区别是：建造者模式[更加关注与零件装配的顺序]。
 *
 *
 * ---------------
 *
 *  建造者模式，又称生成器模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 *  三个角色：建造者、具体的建造者、监工、使用者（严格来说不算）
 *
 *     1、建造者角色：定义生成实例所需要的所有方法；
 *     2、具体的建造者角色：实现生成实例所需要的所有方法，并且定义获取最终生成实例的方法；
 *     3、监工角色：定义使用建造者角色中的方法来生成实例的方法；
 *
 *  注意：定义中“将一个复杂的构建过程与其表示相分离”，表示并不是由建造者负责一切，而是由监工负责控制（定义）
 *       一个复杂的构建过程，由各个不同的建造者分别负责实现构建过程中所用到的所有构建步骤。不然，就无法做
 *       到“使得同样的构建过程可以创建不同的表示”这一目标。
 */
public class MealBuilder {

    /**
     *
     * @return
     */
    public Meal prepareVegetableMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegetableBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     *
     * @return
     */
    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
