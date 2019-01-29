package com.huoxy.a3_singleton_pattern_03;

/**
 * 6 - 枚举（最佳方法）
 *
 * JDK 版本：JDK1.5 起
 *
 * 是否 Lazy 初始化：否
 *
 * 是否多线程安全：是
 *
 * 实现难度：易
 *
 * 描述：这种实现方式还没有被广泛采用，但这是实现单例模式的【最佳方法】。【它更简洁，自动支持序列化机制，绝对防止多次实例化】。
 *
 *      这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，
 *      防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人
 *      感觉生疏，在实际工作中，也很少用。
 *
 *      不能通过 reflection attack 来调用私有构造方法。
 *
 * 解析：在用enum实现Singleton时具有三个特性，【自由序列化，线程安全，保证单例】。这里我们就要探讨一下why的问题。
 *
 *      首先，我们都知道enum是由class实现的，换言之，enum可以实现很多class的内容，包括可以有member和member function，
 *           这也是我们可以用enum作为一个类来实现单例的基础。另外，由于enum是通过继承了Enum类实现的，enum结构不能够作为
 *           子类继承其他类，但是可以用来实现接口。此外，enum类也不能够被继承，在反编译中，我们会发现该类是final的。
 *
 *      其次，【enum有且仅有private的构造器，防止外部的额外构造】，这恰好和单例模式吻合，也为保证单例性做了一个铺垫。
 *           这里展开说下这个private构造器，如果我们不去手写构造器，则会有一个默认的空参构造器，我们也可以通过给枚举变量参量来实现类的初始化。
 *
 * 【关于 非lazy 初始化的分析】：
 *      想要了解enum是如何工作的，就要对其进行反编译。反编译后就会发现，使用枚举其实和使用静态类内部加载方法原理类似。枚举会被编译成如下形式：
 *
 *      public final class T extends Enum{
 *          ...
 *      }
 *
 *      其中，Enum是Java提供给编译器的一个用于继承的类。
 *      枚举量的实现其实是public static final T 类型的未初始化变量，之后，会【在静态代码中对枚举量进行初始化】。
 *      所以，如果用枚举去实现一个单例，这样的加载时间其实有点类似于饿汉模式，并没有起到lazy-loading的作用。
 *
 *  【对于序列化和反序列化】：
 *      因为每一个枚举类型和枚举变量在JVM中都是唯一的，即Java在序列化和反序列化枚举时做了特殊的规定，枚举的writeObject、readObject、
 *      readObjectNoData、writeReplace和readResolve等方法是被编译器禁用的，因此也不存在实现序列化接口后调用readObject会破坏单例的问题。
 *
 *  【对于线程安全方面】：
 *      类似于普通的饿汉模式，通过在第一次调用时的静态初始化创建的对象是线程安全的。
 */
public enum  Singleton6 {

    //枚举中的各个枚举项默认是通过static来定义的！
    INSTANCE(1);

    private int param;

    //枚举的构造方法是private的！！！
    Singleton6(int param) {
        this.param = param;
    }

    public void otherMethod() {
        System.out.println("枚举单例对象的成员方法。。。");
    }

    public int getParam(){
        return param;
    }
}
