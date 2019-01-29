package com.huoxy.c9_null_object_pattern_22;

/**
 *  在空对象模式（Null Object Pattern）中，一个空对象取代 null 对象实例的检查。
 *  Null 对象不是检查空值，而是反应一个不做任何动作的关系。
 *  这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
 *
 *  在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，
 *  该空对象类将无缝地使用在需要检查空值的地方。
 *
 *
 *  我们将创建一个定义操作（在这里，是客户的名称）的 AbstractCustomer 抽象类，和扩展了 AbstractCustomer 类的实体类。
 *  工厂类 CustomerFactory 基于客户传递的名字来返回 RealCustomer 或 NullCustomer 对象。
 */
public class CustomerFactory {

    private static final String[] names = {"Rob", "Joe", "Julia"};

    public static AbstractCustomer getCustomer(String name) {
        for(int i = 0; i<names.length;i++) {
            if(names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }

}
