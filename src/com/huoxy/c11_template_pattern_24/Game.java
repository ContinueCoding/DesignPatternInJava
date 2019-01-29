package com.huoxy.c11_template_pattern_24;

/**
 *  在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，
 *  但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。
 *
 *  意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 *       模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 *  主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
 *
 *  何时使用：有一些通用的方法。
 *
 *  如何解决：将这些通用算法抽象出来。
 *
 *  关键代码：在抽象类实现，其他步骤在子类实现。
 *
 *  应用实例： 1、在造房子的时候，地基、走线、水管都一样，只有在建筑的后期才有加壁橱加栅栏等差异。
 *           2、西游记里面菩萨定好的 81 难，这就是一个顶层的逻辑骨架。
 *           3、spring 中对 Hibernate 的支持，将一些已经定好的方法封装起来，比如开启事务、
 *              获取 Session、关闭 Session 等，程序员不重复写那些已经规范好的代码，直接丢一个实体就可以保存。
 *
 *  优点： 1、封装不变部分，扩展可变部分。
 *        2、提取公共代码，便于维护。
 *        3、行为由父类控制，子类实现。
 *
 *  缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 *
 *  使用场景： 1、有多个子类共有的方法，且逻辑相同。
 *           2、重要的、复杂的方法，可以考虑作为模板方法。
 *
 *  注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。
 *
 *  TODO https://www.cnblogs.com/chenssy/p/3226744.html
 *
 *      模板方法模式是基于继承的代码复用技术的。在模板方法模式中，我们可以将相同部分的代码放在父类中，而将不同的代码放入不同的子类中。
 *      也就是说我们需要声明一个抽象的父类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法让子类来实现剩余的逻辑，
 *      不同的子类可以以不同的方式来实现这些逻辑。
 *
 *      所谓钩子就是一种被声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在可以使子类能够对算法的不同点进行挂钩，即让子类能
 *      够对模板方法中某些即将发生变化的步骤做出相应的反应。当然要不要挂钩，由子类决定。
 *
 *       1、  模板方法模式定义了算法的步骤，将这些步骤的实现延迟到了子类。
 *       2、  模板方法模式为我们提供了一种代码复用的重要技巧。
 *       3、  模板方法模式的抽象类可以定义抽象方法、具体方法和钩子。
 *       4、  为了防止子类改变算法的实现步骤，我们可以将模板方法声明为final。
 */
public abstract class Game {

    //模板方法中的各个步骤 - 用public、protected？
    protected abstract void initialize();

    protected abstract void startGame();

    protected abstract void endGame();

    //模板方法 - final方法 - 定义好游戏流程
    public final void play() {
        initialize();
        startGame();
        endGame();
    }
}