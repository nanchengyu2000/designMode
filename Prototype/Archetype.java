package Prototype;

import Prototype.TestModel.Student;
import Prototype.TestModel.Teacher;

import java.io.IOException;

/*
* 原型设计模式是一种创建型设计模式，其主要思想是通过复制现有对象来创建新对象，而不是通过实例化新对象的方式。这种方式可以在不暴露对象创建逻辑的情况下生成新对象，同时也可以在对象创建过程中避免不必要的复杂性。以下是一些原型设计模式的使用场景：

1. 减少对象初始化开销： 当对象的创建、初始化或配置过程非常复杂且耗时时，使用原型模式可以避免重复执行这些操作。通过复制现有对象，可以快速创建新对象，从而减少初始化开销。

2. 动态配置对象： 原型模式允许在运行时动态地配置对象。通过创建一个原型对象，然后根据需要复制并根据需要修改其副本，可以轻松地创建多个具有不同配置的对象。

3. 保护对象的创建过程： 有时候，对象的创建过程可能涉及敏感信息或复杂的初始化逻辑。使用原型模式可以将对象的创建过程封装在原型对象中，而不必将这些细节暴露给客户端。

4. 实现对象的快速克隆： 当需要在运行时创建对象的副本，并且这些副本可能与原始对象有所不同时，原型模式是一个很好的选择。通过复制原型对象，可以快速创建新对象并根据需要修改其状态。

5. 动态加载类： 在某些情况下，例如在某些框架或库中，可能需要根据配置或条件动态加载类。原型模式可以作为实现此类动态加载的一种方式，因为它允许在运行时创建新对象，而无需硬编码类的类型。

总的来说，原型设计模式在需要动态创建对象、减少对象初始化开销、保护对象创建过程或实现对象的快速克隆等情况下都是很有用的。
*
* */
public class Archetype {
    public static void main(String[] args) {
        /*
            原型模式第一种实现,但是缺点是在更多的引用类型嵌套将会很复杂
        */
//        Student student = new Student("张三", 20, "man",new Teacher("张禹", 50, "man"));
//        System.out.println(student.toString());
//        Student student1 = student.deepClone();
//        student1.setName("李四");
//        student1.getTeacher().setName("王五");
//        System.out.println(student1.toString());
        /*
            原型模式第二种实现,使用序列化和反序列化
         */
        Student student = new Student("张三", 20, "man",new Teacher("张禹", 50, "man"));
        System.out.println(student.toString());
        Student student1 = null;
        try {
            student1 = student.deepClone1();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        student1.setName("李四");
        student1.getTeacher().setName("王五");
        System.out.println(student1.toString());
    }
}
