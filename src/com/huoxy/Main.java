package com.huoxy;

import com.huoxy.a2_abstract_factory_pattern_02.AbstractFactory;
import com.huoxy.a2_abstract_factory_pattern_02.Color;
import com.huoxy.a2_abstract_factory_pattern_02.ColorFactory;
import com.huoxy.a2_abstract_factory_pattern_02.FactoryProducer;
import com.huoxy.b1_adapter_pattern_06.AudioPlayer;
import com.huoxy.b2_bridge_pattern_07.GreenCircle;
import com.huoxy.b2_bridge_pattern_07.RedCircle;
import com.huoxy.a4_builder_pattern_04.Meal;
import com.huoxy.a4_builder_pattern_04.MealBuilder;
import com.huoxy.a4_builder_pattern_04.classic_builder_pattern.Student;
import com.huoxy.c1_chain_of_responsibility_14.example1.AskForLeaveManager;
import com.huoxy.c1_chain_of_responsibility_14.example1.Request;
import com.huoxy.c1_chain_of_responsibility_14.example1.Result;
import com.huoxy.c1_chain_of_responsibility_14.example2.AbstractLogger;
import com.huoxy.c1_chain_of_responsibility_14.example2.ConsoleLogger;
import com.huoxy.c1_chain_of_responsibility_14.example2.ErrorLogger;
import com.huoxy.c1_chain_of_responsibility_14.example2.FileLogger;
import com.huoxy.c2_command_pattern_15.BuyStock;
import com.huoxy.c2_command_pattern_15.SellStock;
import com.huoxy.c2_command_pattern_15.Stock;
import com.huoxy.c2_command_pattern_15.StockBroker;
import com.huoxy.b4_composite_pattern_09.Employee;
import com.huoxy.b5_decorator_pattern_10.Circle;
import com.huoxy.b5_decorator_pattern_10.Rectangle;
import com.huoxy.b5_decorator_pattern_10.RedShapeDecorator;
import com.huoxy.b6_facade_pattern_11.ShapeFacade;
import com.huoxy.a1_factory_pattern_01.Shape;
import com.huoxy.a1_factory_pattern_01.ShapeFactory;
import com.huoxy.b3_filter_criteria_pattern_08.*;
import com.huoxy.c3_interpreter_pattern_16.Expression;
import com.huoxy.c3_interpreter_pattern_16.ExpressionFactory;
import com.huoxy.c4_iterator_pattern_17.Iterator;
import com.huoxy.c4_iterator_pattern_17.NameRepository;
import com.huoxy.c5_mediator_pattern_18.User;
import com.huoxy.c6_memento_pattern_19.CareTaker;
import com.huoxy.c6_memento_pattern_19.Originator;
import com.huoxy.d1_mvc_pattern.StudentController;
import com.huoxy.d1_mvc_pattern.StudentView;
import com.huoxy.c9_null_object_pattern_22.AbstractCustomer;
import com.huoxy.c9_null_object_pattern_22.CustomerFactory;
import com.huoxy.c7_observer_pattern_20.*;
import com.huoxy.a5_prototype_pattern_05.ShapeCache;
import com.huoxy.b8_proxy_pattern_13.Image;
import com.huoxy.b8_proxy_pattern_13.ProxyImage;
import com.huoxy.a3_singleton_pattern_03.Singleton5;
import com.huoxy.a3_singleton_pattern_03.Singleton6;
import com.huoxy.c8_state_pattern_21.Context;
import com.huoxy.c8_state_pattern_21.StartState;
import com.huoxy.c8_state_pattern_21.StopState;
import com.huoxy.c10_strategy_pattern_23.OperationAdd;
import com.huoxy.c10_strategy_pattern_23.OperationMultiply;
import com.huoxy.c11_template_pattern_24.BasketBallGame;
import com.huoxy.c11_template_pattern_24.FootballGame;
import com.huoxy.c11_template_pattern_24.Game;
import com.huoxy.c12_visitor_pattern_25.Computer;
import com.huoxy.c12_visitor_pattern_25.ComputerDisplayVisitor;
import com.huoxy.c12_visitor_pattern_25.example2.*;
import com.huoxy.d2_business_delegate_pattern.BusinessDelegate;
import com.huoxy.d2_business_delegate_pattern.BusinessLookUp;
import com.huoxy.d2_business_delegate_pattern.Client;
import com.huoxy.d4_data_access_object_pattern.StudentDao;
import com.huoxy.d4_data_access_object_pattern.StudentDaoImpl;
import com.huoxy.d5_front_controller_pattern.Dispatcher;
import com.huoxy.d5_front_controller_pattern.FrontController;
import com.huoxy.d6_intercepting_filter_pattern.AuthenticatorFilter;
import com.huoxy.d6_intercepting_filter_pattern.DebugFilter;
import com.huoxy.d6_intercepting_filter_pattern.FilterManager;
import com.huoxy.d6_intercepting_filter_pattern.Target;
import com.huoxy.d7_service_locator_pattern.Service;
import com.huoxy.d7_service_locator_pattern.ServiceLocator;
import com.huoxy.d8_transfer_object_pattern.StudentBO;
import com.huoxy.d8_transfer_object_pattern.StudentVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 设计模式Demo - http://www.runoob.com/design-pattern/design-pattern-tutorial.html
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 1 - 创建型模式 Creational Patterns
         *  这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。
         *  这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
         */

        //1-1 工厂模式 Factory Pattern
        //factoryPattern();

        //1-2 抽象工厂模式 Abstract Factory Pattern
        //abstractFactoryPattern();

        //1-3 单例模式 Singleton Pattern
        //singletonPattern();

        //1-4 建造者模式 Builder Pattern
        //builderPattern();

        //1-5 原型模式 Prototype Pattern
        //prototypePattern();


        /**
         * 2 - 结构型模式 Structural Patterns
         *  这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
         */

        //2-1 适配器模式 Adapter Pattern
        //adapterPattern();

        //2-2 桥接模式 Bridge Pattern
        //bridgePattern();

        //2-3 过滤器or标准模式 Filter Pattern、Criteria Pattern（非GOF 23种之一）
        //filterOrCriteriaPattern();

        //2-4 组合模式 Composite Pattern
        //compositePattern();

        //2-5 装饰模式 Decorator Pattern
        //decoratorPattern();

        //2-6 外观模式 Facade Pattern
        //facadePattern();

        //2-7 享元模式 Flyweight Pattern
        //flyweightPattern();

        //2-8 代理模式 Proxy Pattern
        //proxyPattern();

        /**
         * 3 - 行为型模式 Behavioral Patterns
         *  这些设计模式特别关注对象之间的通信。
         */

        //3-1 责任链模式 Chain of Responsibility Pattern
        //chainOfResponsibility();
        //chainOfResponsibility2();

        //3-2 命令模式 Command Pattern
        //commandPattern();

        //3-3 解释器模式 Interpreter Pattern
        //interpreterPattern();

        //3-4 迭代器模式 Iterator Pattern
        //iteratorPattern();

        //3-5 中介者模式 Mediator Pattern
        //mediatorPattern();

        //3-6 备忘录模式 Memento Pattern
        //mementoPattern();

        //3-7 观察者模式 Observer Pattern
        //observerPattern();

        //3-8 状态模式 State Pattern
        //statePattern();

        //3-9 空对象模式 Null Object Pattern (非GOF 23种模式之一)
        //nullObjectPattern();

        //3-10 策略模式 Strategy Pattern
        //strategyPattern();

        //3-11 模板模式 Template Pattern
        //templatePattern();

        //3-12 访问者模式 Visitor Pattern
        //visitorPattern();

        /**
         * 4 - J2EE 模式
         * 这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的
         */
        //4-1 MVC模式
        //mvcPattern();

        //4-2 业务代理模式 Business Delegate Pattern
        //businessDelegatePattern();

        //4-3 组合实体模式 Composite Entity Pattern
        //compositeEntityPattern();

        //4-4 数据访问对象模式 Data Access Object Pattern
        //dataAccessObjectPattern();

        //4-5 前端控制器模式 Front Controller Pattern
        //frontControllerPattern();

        //4-6 拦截控制器模式 Intercepting Filter Pattern
        //interceptingFilterPattern();

        //4-7 服务定位器模式 Service Locator Pattern
        //serviceLocatorPattern();

        //4-8 传输对象模式 Transfer Object Pattern
        transferObjectPattern();

    }

    //region 创建型模式 Creational Patterns
    //1-1 工厂模式
    private static void factoryPattern() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(ShapeFactory.SHAPE_CIRCLE);
        Shape shape2 = shapeFactory.getShape(ShapeFactory.SHAPE_RECTANGLE);
        Shape shape3 = shapeFactory.getShape(ShapeFactory.SHAPE_SQUARE);

        shape1.draw();
        shape2.draw();
        shape3.draw();

        /*
            Circle: draw circle!
            Rectangle: draw Rectangle!
            Square: draw square!
         */
    }

    //1-2 抽象工厂模式
    private static void abstractFactoryPattern() {
        //shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_SHAPE);
        Shape shape1 = shapeFactory.getShape(com.huoxy.a2_abstract_factory_pattern_02.ShapeFactory.SHAPE_CIRCLE);
        Shape shape2 = shapeFactory.getShape(com.huoxy.a2_abstract_factory_pattern_02.ShapeFactory.SHAPE_RECTANGLE);
        Shape shape3 = shapeFactory.getShape(com.huoxy.a2_abstract_factory_pattern_02.ShapeFactory.SHAPE_SQUARE);
        shape1.draw();
        shape2.draw();
        shape3.draw();

        //color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.FACTORY_COLOR);
        Color color1 = colorFactory.getColor(ColorFactory.COLOR_RED);
        Color color2 = colorFactory.getColor(ColorFactory.COLOR_GREEN);
        Color color3 = colorFactory.getColor(ColorFactory.COLOR_BLUE);
        color1.fill();
        color2.fill();
        color3.fill();

        /*
            Circle: draw circle!
            Rectangle: draw Rectangle!
            Square: draw square!

            Red: fill red color!
            Green: fill green color!
            Blue: fill blue color!
         */
    }

    //1-3 单例模式
    private static void singletonPattern() {
        /*
            经验之谈：
                一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。

                只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。

                如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。

                如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。

            *注意：反射 & 反序列化都可以破解单例模式，其解决方法分别为：
            *   *反射 - 在构造方法里判断instance是否不为空即可：如果已经创建instance，则抛出异常or直接返回instance；
            *   *反序列化 - 重写readResolve - 直接return getInstance()！
         */

        //静态内部类
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);

        //枚举
        Singleton6 instance3 = Singleton6.INSTANCE;
        Singleton6 instance4 = Singleton6.INSTANCE;
        System.out.println(instance3.hashCode());
        System.out.println(instance4.hashCode());

        //com.huoxy.a3_singleton_pattern_03.Singleton5@2503dbd3
        //com.huoxy.a3_singleton_pattern_03.Singleton5@2503dbd3
        //1265094477
        //1265094477
    }

    //1-4 建造者模式
    private static void builderPattern() {
        MealBuilder builder = new MealBuilder();

        Meal vegetableMeal = builder.prepareVegetableMeal();
        System.out.println("Vegetable Meal: ");
        vegetableMeal.showItems();
        System.out.println("totalCost: " + vegetableMeal.getPrice());

        Meal chickenMeal = builder.prepareChickenMeal();
        System.out.println("Chicken Meal: ");
        chickenMeal.showItems();
        System.out.println("totalCost: " + chickenMeal.getPrice());

        /*
        Vegetable Meal:
            Item: name = Vegetable Burger, packing = Wrapper - 包装汉堡!, price = 12.0
            Item: name = Coke Cola, packing = Bottle - 装饮料！, price = 6.0
            totalCost: 18.0

        Chicken Meal:
            Item: name = Chicken Burger, packing = Wrapper - 包装汉堡!, price = 25.0
            Item: name = Pepsi Cola, packing = Bottle - 装饮料！, price = 5.0
            totalCost: 30.0
         */

        Student student = new Student.Builder().name("Brady")
                .id(199).sex("male").address("Boston")
                .build();
        System.out.println(student);
        //Student{id=199, name='Brady', password='null', sex='male', address='Boston'}
    }

    //1-5 原型模式
    private static void prototypePattern() {
        ShapeCache.loadShape();

        com.huoxy.a5_prototype_pattern_05.Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape1 = " + clonedShape1.getType());

        com.huoxy.a5_prototype_pattern_05.Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape2 = " + clonedShape2.getType());

        com.huoxy.a5_prototype_pattern_05.Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape3 = " + clonedShape3.getType());

        /*
            Shape1 = Circle
            Shape2 = Square
            Shape3 = Rectangle
         */
    }

    //endregion 创建型模式 Creational Patterns

    //region 结构型模式 Structural Patterns

    //2-1 适配器模式
    private static void adapterPattern() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Haha.mp3");
        audioPlayer.play("mp4", "Haha.mp4");
        audioPlayer.play("vlc", "Haha.vlc");
        audioPlayer.play("avi", "Haha.avi");

        /*
            Playing Mp3... fileName = Haha.mp3
            Playing Mp4... fileName = Haha.mp4
            Playing Vlc... fileName = Haha.vlc
            Invalid audioType: avi
         */
    }

    //2-2 桥接模式
    private static void bridgePattern() {
        com.huoxy.b2_bridge_pattern_07.Shape redCircle = new com.huoxy.b2_bridge_pattern_07.Circle(10, 10, 8, new RedCircle());
        com.huoxy.b2_bridge_pattern_07.Shape greenCircle = new com.huoxy.b2_bridge_pattern_07.Circle(10, 10, 8, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        /*
        Drawing Circle: center = [10, 10], radius = 8, color = Red
        Drawing Circle: center = [10, 10], radius = 8, color = Green
         */
    }

    //2-3 过滤器or标准模式
    private static void filterOrCriteriaPattern() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob1", "male", "single"));
        personList.add(new Person("Bob2", "female", "single"));
        personList.add(new Person("Bob3", "male", "single"));
        personList.add(new Person("Bob4", "female", "married"));
        personList.add(new Person("Bob5", "male", "married"));
        personList.add(new Person("Bob6", "female", "married"));

        Criteria malePersons = new CriteriaMale();
        Criteria singlePersons = new CriteriaSingle();
        Criteria maleSinglePersons = new AndCriteria(malePersons, singlePersons);
        Criteria maleOrSinglePersons = new OrCriteria(malePersons, singlePersons);

        System.out.println("Male Person= ");
        printPersons(malePersons.meetCriteria(personList));

        System.out.println("Single Person = ");
        printPersons(singlePersons.meetCriteria(personList));

        System.out.println("Male And Single Person = ");
        printPersons(maleSinglePersons.meetCriteria(personList));

        System.out.println("Male Or Single Person = ");
        printPersons(maleOrSinglePersons.meetCriteria(personList));

        /*
            Male Person=
            Person{name='Bob1', gender='male', maritalStatus='single'}
            Person{name='Bob3', gender='male', maritalStatus='single'}
            Person{name='Bob5', gender='male', maritalStatus='married'}

            Single Person =
            Person{name='Bob1', gender='male', maritalStatus='single'}
            Person{name='Bob2', gender='female', maritalStatus='single'}
            Person{name='Bob3', gender='male', maritalStatus='single'}

            Male And Single Person =
            Person{name='Bob1', gender='male', maritalStatus='single'}
            Person{name='Bob3', gender='male', maritalStatus='single'}

            Male Or Single Person =
            Person{name='Bob1', gender='male', maritalStatus='single'}
            Person{name='Bob3', gender='male', maritalStatus='single'}
            Person{name='Bob5', gender='male', maritalStatus='married'}
            Person{name='Bob2', gender='female', maritalStatus='single'}
         */
    }

    private static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    //2-4 组合模式
    private static void compositePattern() {
        Employee ceo = new Employee("Jobs", "CEO Office", 10000);
        Employee manager1 = new Employee("Manager1", "RD Office", 5000);
        Employee manager2 = new Employee("Manager2", "PM Office", 5000);
        Employee staff1 = new Employee("Staff1", "RD Office", 1000);
        Employee staff2 = new Employee("Staff2", "RD Office", 1000);
        Employee staff3 = new Employee("Staff3", "PM Office", 1000);
        Employee staff4 = new Employee("Staff4", "PM Office", 1000);

        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);

        manager1.addSubordinate(staff1);
        manager1.addSubordinate(staff2);

        manager2.addSubordinate(staff3);
        manager2.addSubordinate(staff4);

        System.out.println(ceo);
        for (Employee employee : ceo.getSubordinates()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getSubordinates()) {
                System.out.println(employee1);
            }
        }

        /*
            Employee{name='Jobs', department='CEO Office', salary=10000}

            Employee{name='Manager1', department='RD Office', salary=5000}
            Employee{name='Staff1', department='RD Office', salary=1000}
            Employee{name='Staff2', department='RD Office', salary=1000}

            Employee{name='Manager2', department='PM Office', salary=5000}
            Employee{name='Staff3', department='PM Office', salary=1000}
            Employee{name='Staff4', department='PM Office', salary=1000}
         */
    }

    //2-5 装饰模式
    private static void decoratorPattern() {

        com.huoxy.b5_decorator_pattern_10.Shape circle = new Circle();

        com.huoxy.b5_decorator_pattern_10.Shape redCircle = new RedShapeDecorator(new Circle());
        com.huoxy.b5_decorator_pattern_10.Shape redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();

        /*
        Shape: Circle - draw()

        Shape: Circle - draw()
        Add Red Border!

        Shape: Rectangle - draw()
        Add Red Border!
         */
    }

    //2-6 外观模式
    private static void facadePattern() {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();

        /*
            Circle - draw()
            Rectangle - draw()
            Square - draw()
         */
    }

    //2-7 享元模式
    private static void flyweightPattern() {
        String[] colors = new String[]{"Red", "Green", "Blue", "White", "Black"};
        for (int i = 0; i < 20; i++) {
            com.huoxy.b7_flyweight_pattern_12.Circle circle = com.huoxy.b7_flyweight_pattern_12.ShapeFactory.getCircle(colors[(int) (Math.random() * colors.length)]);
            circle.setCenterX((int) (Math.random() * 100));
            circle.setCenterY((int) (Math.random() * 100));
            circle.setRadius(100);
            circle.draw();
        }

        /*
            Creating new circle - color = Green
            Draw Circle - center = [64, 91], radius = 100, color = Green

            Creating new circle - color = Red
            Draw Circle - center = [76, 39], radius = 100, color = Red

            Creating new circle - color = Blue
            Draw Circle - center = [64, 4], radius = 100, color = Blue

            Creating new circle - color = White
            Draw Circle - center = [79, 29], radius = 100, color = White

            Draw Circle - center = [44, 95], radius = 100, color = Red
            Draw Circle - center = [21, 82], radius = 100, color = Red
            Draw Circle - center = [20, 39], radius = 100, color = Blue
            Draw Circle - center = [31, 98], radius = 100, color = Red
            Draw Circle - center = [34, 97], radius = 100, color = Blue
            Draw Circle - center = [55, 70], radius = 100, color = Red
            Draw Circle - center = [53, 89], radius = 100, color = Red
            Draw Circle - center = [63, 1], radius = 100, color = Red
            Draw Circle - center = [48, 39], radius = 100, color = Red
            Draw Circle - center = [17, 65], radius = 100, color = Green
            Draw Circle - center = [20, 43], radius = 100, color = White
            Draw Circle - center = [76, 48], radius = 100, color = Red
            Draw Circle - center = [4, 86], radius = 100, color = Blue

            Creating new circle - color = Black
            Draw Circle - center = [15, 27], radius = 100, color = Black

            Draw Circle - center = [24, 57], radius = 100, color = Green
            Draw Circle - center = [32, 26], radius = 100, color = Green
         */
    }

    //2-8 代理模式
    private static void proxyPattern() {
        Image image = new ProxyImage("haha.jpg");

        //第一次显示：先加载再显示！
        image.display();
        System.out.println("");
        //第二次显示：直接加载！
        image.display();

        /*
            Loading haha.jpg...
            Display haha.jpg!

            Display haha.jpg!
         */
    }

    //endregion 结构型模式 Structural Patterns

    //region 行为型模式 Behavioral Patterns

    //3-1 责任链模式1
    private static void chainOfResponsibility() {
        Request request = new Request.Builder()
                .name("Tom")
                .id(12345)
                .days(4)
                .reason("Go home!")
                .build();

        AskForLeaveManager manager = new AskForLeaveManager();
        Result result = manager.execute(request);
        System.out.println("\n" + result);
    }

    //3-1 责任链模式2
    private static void chainOfResponsibility2() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        errorLogger.logMessage(AbstractLogger.INFO, "this is a info log");
        System.out.println("-----------------");
        errorLogger.logMessage(AbstractLogger.DEBUG, "this is a debug log");
        System.out.println("-----------------");
        errorLogger.logMessage(AbstractLogger.ERROR, "this is a error log");

        /*
            ConsoleLogger write log: this is a info log
            -----------------
            FileLogger write log: this is a debug log
            ConsoleLogger write log: this is a debug log
            -----------------
            ErrorLogger write log: this is a error log
            FileLogger write log: this is a error log
            ConsoleLogger write log: this is a error log
         */
    }

    //3-2 命令模式
    private static void commandPattern() {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        StockBroker broker = new StockBroker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();

        /*
            Stock [name:APPLE, quantity:10] bought!
            Stock [name:APPLE, quantity:10] sold!
         */
    }

    //3-3 解释器模式
    private static void interpreterPattern() {
        Expression isMale = ExpressionFactory.getMaleExpression();
        Expression isMarriedWomen = ExpressionFactory.getMarriedWomenExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julia is married? " + isMarriedWomen.interpret("Julia Married"));

        /*
            John is male? true
            Julia is married? true
         */
    }

    //3-4 迭代器模式
    private static void iteratorPattern() {
        NameRepository repository = new NameRepository();
        for (Iterator iterator = repository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("name: " + name);
        }

        /*
            name: Robert
            name: John
            name: Julia
            name: Lora
         */
    }

    //3-5 中介者模式
    private static void mediatorPattern() {
        User Jack = new User("Jack");
        User Rose = new User("Rose");

        Jack.sendMessage("Hi, Rose! You jump, I jump!");
        Rose.sendMessage("Hi, Jack, No!");

        /*
            Thu Jan 24 15:18:22 CST 2019 [Jack] : Hi, Rose! You jump, I jump!
            Thu Jan 24 15:18:22 CST 2019 [Rose] : Hi, Jack, No!
         */
    }

    //3-6 备忘录模式
    private static void mementoPattern() {
        Originator originator = new Originator("");
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());//保存State #2到List0

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());//保存State #3到List1
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.getMemento(0));
        System.out.println("First saved State: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());

        /*
            Current State: State #4
            First saved State: State #2
            Second saved State: State #3
         */
    }

    //3-7 观察者模式
    private static void observerPattern() {
        Subject subject = new Subject();
        Observer observer1 = new BinaryObserver(subject);
        Observer observer2 = new OctalObserver(subject);
        Observer observer3 = new HexaObserver(subject);

        System.out.println("First state change: 17");
        subject.setState(17);
        System.out.println("First state change: 25");
        subject.setState(25);

        /*
            First state change: 17
            Binary String: 10001
            Octal String: 21
            Hexa String: 11

            First state change: 25
            Binary String: 11001
            Octal String: 31
            Hexa String: 19
         */

        //TODO Java 内置的观察者
        java.util.Observer observer;
        Observable observable;
    }

    //3-8 状态模式
    private static void statePattern() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

        /*
            Player is in Start state
            Start state!
            Player is in Stop state!
            Stop State!
         */
    }

    //3-9 空对象模式
    private static void nullObjectPattern() {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julia");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers: ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

        /*
        Customers:
            Rob
            Not available in Customer database
            Julia
            Not available in Customer database
         */
    }

    //3-10 策略模式
    private static void strategyPattern() {
        OperationAdd add = new OperationAdd();
        OperationMultiply multiply = new OperationMultiply();
        com.huoxy.c10_strategy_pattern_23.Context context = new com.huoxy.c10_strategy_pattern_23.Context(add);

        System.out.println("Add: 3 + 5 = " + context.executeStrategy(3, 5));

        context.setStrategy(multiply);
        System.out.println("Multiply: 3 * 5 = " + context.executeStrategy(3, 5));

        /*
            Add: 3 + 5 = 8
            Multiply: 3 * 5 = 15
        */
    }

    //3-11 模板模式
    private static void templatePattern() {
        Game basketball = new BasketBallGame();
        Game football = new FootballGame();

        basketball.play();
        System.out.println();
        football.play();

        /*
            准备篮球游戏...
            开始篮球游戏...
            结束篮球游戏...

            准备足球游戏
            开始足球游戏
            结束足球游戏
         */
    }

    //3-12 访问者模式
    private static void visitorPattern() {
        Computer computer = new Computer();
        computer.accept(new ComputerDisplayVisitor());

        /*
            Displaying mouse.
            Displaying keyboard.
            Displaying monitor.
            Displaying computer.
         */

        //------------------example2-------------------

        Medicine a = new MedicineA("板蓝根", 11.0);
        Medicine b = new MedicineB("感康", 14.3);

        Prescription prescription = new Prescription();
        prescription.addMedicine(a);
        prescription.addMedicine(b);

        Visitor charger = new Charger("张三");
        Visitor workerOfPharmacy = new WorkerOfPharmacy("李四");

        prescription.accept(charger);
        System.out.println("-------------------------------------");
        prescription.accept(workerOfPharmacy);
        /*
            划价员：张三给药板蓝根划价:11.0
            划价员：张三给药感康划价:14.3
            -------------------------------------
            药房工作者：李四拿药 ：板蓝根
            药房工作者：李四拿药 ：感康
         */
    }
    //endregion 行为型模式 Behavioral Patterns

    //region J2EE模式

    //4-1 MVC模式
    private static void mvcPattern() {
        com.huoxy.d1_mvc_pattern.Student student = getStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);
        controller.updateView();

        controller.setStudentName("Green");
        controller.setStudentRollNo("12345");
        controller.updateView();

        /*
            Student:
            Name: Jim
            Roll No: 111

            Student:
            Name: Green
            Roll No: 12345
         */
    }

    private static com.huoxy.d1_mvc_pattern.Student getStudentFromDatabase() {
        com.huoxy.d1_mvc_pattern.Student student = new com.huoxy.d1_mvc_pattern.Student("111", "Jim");

        return student;
    }

    //4-2 业务代理模式
    private static void businessDelegatePattern() {
        BusinessDelegate delegate = new BusinessDelegate(BusinessLookUp.BUSINESS_TYPE_EJB);

        Client client = new Client(delegate);
        client.doTask();

        delegate.setServiceType(BusinessLookUp.BUSINESS_TYPE_JMS);
        client.doTask();

        /*
            Processing task by invoking EJB Service
            Processing task by invoking JMS Service
         */
    }

    //4-3 组合实体模式
    private static void compositeEntityPattern() {
        com.huoxy.d3_composite_entity_pattern.Client client = new com.huoxy.d3_composite_entity_pattern.Client();

        client.setData("Test1: ", "Brady");
        client.printData();

        client.setData("Test2 ", "Gronkowski");
        client.printData();

        /*
            Data: Test1:
            Data: Brady
            Data: Test2
            Data: Gronkowski
         */
    }

    //4-4 数据访问对象模式 DAO
    private static void dataAccessObjectPattern() {
        StudentDao studentDao = new StudentDaoImpl();

        List<com.huoxy.d4_data_access_object_pattern.Student> students = studentDao.getAllStudents();

        studentDao.addStudent(new com.huoxy.d4_data_access_object_pattern.Student("Haha", "004"));

        com.huoxy.d4_data_access_object_pattern.Student no2Student = studentDao.getStudentByRollNo("002");

        studentDao.removeStudent(no2Student);
    }

    //4-5 前端控制器模式
    private static void frontControllerPattern() {
        FrontController controller = new FrontController();
        controller.dispatchRequest(Dispatcher.HOME_VIEW);
        controller.dispatchRequest(Dispatcher.STUDENT_VIEW);

        /*
            Page requested: home_view
            User is authenticated successfully.
            Displaying Home Page

            Page requested: student_view
            User is authenticated successfully.
            Displaying Student Page
         */
    }

    //4-6 拦截控制器模式
    private static void interceptingFilterPattern() {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthenticatorFilter());
        filterManager.addFilter(new DebugFilter());

        com.huoxy.d6_intercepting_filter_pattern.Client client = new com.huoxy.d6_intercepting_filter_pattern.Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");

        /*
            Authenticating request: HOME
            request log: HOME
            Executing request: HOME
         */
    }

    //4-7 服务定位器模式
    private static void serviceLocatorPattern() {
        Service service1 = ServiceLocator.getService("service1");
        service1.execute();
        Service service2 = ServiceLocator.getService("service2");
        service2.execute();
        Service service3 = ServiceLocator.getService("service1");
        service3.execute();
        Service service4 = ServiceLocator.getService("service2");
        service4.execute();
        /*
            Looking up and creating a new Service1 object
            add Service1 service to cache!
            Service1 executing...

            Looking up and creating a new Service2 object
            add Service2 service to cache!
            Service2 executing...

            Returning cached  service1 service!
            Service1 executing...

            Returning cached  service2 service!
            Service2 executing...
         */
    }

    //4-8 传输对象模式
    private static void transferObjectPattern() {
        StudentBO studentBO = new StudentBO();

        //print
        for (StudentVO student : studentBO.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        //update
        StudentVO student = studentBO.getStudent(0);
        student.setName("Micheal");
        studentBO.updateStudent(student);

        //get
        StudentVO student1 = studentBO.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student1.getRollNo() + ", Name : " + student1.getName() + " ]");

        /*
            Student: [RollNo : 0, Name : Jim ]
            Student: [RollNo : 1, Name : Tom ]
            Student: [RollNo : 2, Name : Green ]

            Student: Roll No 0, updated in the database

            Student: [RollNo : 0, Name : Micheal ]
         */
    }

    //endregion
}
