### 适配器的使用场景：

适配器设计模式通常用于以下场景：

1. **接口转换**：当需要使用一个已有的类，但是它的接口与你所需的不匹配时，可以使用适配器模式。适配器将这个类的接口转换成符合你需求的接口，使得你能够与之交互。

2. **旧系统与新系统的整合**：在系统升级或者重构时，有时候需要将旧系统与新系统进行整合，但是它们的接口不兼容。适配器模式可以用来使得旧系统与新系统能够协同工作。

3. **类库的复用**：当需要使用某个类库中的类，但是这个类库的接口与你当前的系统不兼容时，可以编写适配器来使得这个类库可以被重用。

4. **与外部组件的集成**：当需要与外部组件进行交互，但是它们的接口不匹配时，可以编写适配器来实现与这些外部组件的集成。

5. **功能增强**：适配器模式也可以用来为一个已有的类增加额外的功能，而不需要修改原始类的代码，这种情况下通常被称为装饰器模式的一种应用。

总的来说，适配器模式的主要作用是使得不兼容的接口能够协同工作，同时保持系统的灵活性和可扩展性。

> 1. **目标接口（Target）**：目标接口是客户端所期待的接口。客户端通过目标接口与适配器进行交互，而不需要了解适配器内部的具体实现细节。目标接口定义了客户端所需的操作。
>    1. **被适配者（Adaptee）**：被适配者是已经存在的类或接口，其接口与客户端所期待的接口不兼容。被适配者包含了客户端所需要的功能，但是其接口形式不符合客户端的要求。
> 2. **适配器（Adapter）**：适配器是实现了目标接口的类。它通过包装被适配者，将被适配者的接口转换成目标接口，从而使得客户端能够与被适配者进行交互。适配器内部持有一个被适配者的实例，并且实现了目标接口的所有方法，在方法中调用被适配者的相应方法来完成适配。
> 3. **客户端（Client）**：客户端是使用适配器的类。客户端通过目标接口与适配器进行交互，而不需要知道适配器内部是如何实现的，也不需要直接与被适配者进行交互

被适配者如果是类的形式，我们使用组合的方式将他与适配器进行联系，如果适配者死接口形式，我们使用实现的方式将他与适配器进行联系

### 类适配器

适配器通过继承目标接口的形式来创建适配器

```java
package Adapter;

public interface Robot {
    void cry();

    void move();
}
package Adapter;

public class Dog {
    public void wang() {
        System.out.println("狗叫");
    }

    public void run() {
        System.out.println("狗跑");
    }
}

package Adapter;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.print("机器人在模仿");
        super.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人在模仿");
        super.wang();
    }
}

public class Main {
    public static void main(String[] args) {
        DogAdapter dogAdapter = new DogAdapter();
        dogAdapter.cry();    //机器人在模仿狗叫
        dogAdapter.move();   //机器人在模仿狗跑
    }
}
```



### 对象适配器

通过将目标接口以聚合或组合的方式来创建适配器

```java
package Adapter;

public interface Robot {
    void cry();

    void move();
}

package Adapter;

public class Bird {
    public void call() {
        System.out.println("小鸟叫");
    }

    public void fly() {
        System.out.println("小鸟飞");
    }
}

package Adapter;

public class Dog {
    public void wang() {
        System.out.println("狗叫");
    }

    public void run() {
        System.out.println("狗在跑");
    }
}

package Adapter;

public class MingleAdapter implements Robot {   //采用组合的方式

    private Bird bird = new Bird();
    private Dog dog = new Dog();

    @Override
    public void cry() {
        System.out.print("机器人在模仿");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人在模仿");
        bird.fly();
    }
}

public class Main {
    public static void main(String[] args) {
        MingleAdapter mingleAdapter = new MingleAdapter();
        mingleAdapter.cry();
        mingleAdapter.move();
    }
}
```



### 双向适配器





