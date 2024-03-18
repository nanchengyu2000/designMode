# 工厂模式

## 简单工厂模式

> 简单工厂模式是工厂模式的一种特殊形式，它也是一种创建型设计模式。与工厂模式相比，简单工厂模式更加简单，通常只包含一个工厂类来创建对象，而不涉及到子类的扩展。
>
> 简单工厂模式的特点包括：
>
> 1. **只有一个工厂类：** 简单工厂模式只包含一个工厂类，用于创建对象。工厂类根据不同的条件或参数来实例化不同的对象。
>
> 2. **客户端直接与工厂类交互：** 客户端代码直接调用工厂类的静态方法来获取所需的对象，无需关心具体的实现类。
>
> 3. **工厂类负责创建对象：** 工厂类包含一个或多个方法，用于创建不同类型的对象。
>
> 简单工厂模式适用于以下情况：
>
> 1. **对象创建逻辑简单：** 当对象的创建逻辑比较简单，并且不需要根据运行时条件决定创建哪个对象时，可以使用简单工厂模式。
>
> 2. **客户端只需要知道产品接口：** 当客户端只需要知道产品接口，而不需要关心具体的实现类时，可以使用简单工厂模式。
>
> 3. **少量对象的创建：** 当需要创建的对象较少，并且创建过程相对固定时，可以使用简单工厂模式。
>
> 尽管简单工厂模式具有一定的局限性，但在某些情况下，它仍然是一种简单、方便的对象创建方式。然而，在对象创建过程复杂、需要灵活扩展时，通常更倾向于使用工厂方法模式或抽象工厂模式。



### 按照用户需求实现简单工厂模式

```java
 public static Tv getBean(String name){     //通过用户输入的名称来选择创建的对象类型
        Tv tv=null;
        if (name=="HaiXi"){   
            tv = new HaiXiTv();
        }else if(name=="Haier"){
            tv=new HaierTv();
        }
        return tv;
    }
```

### 通过反射实现简单工厂模式

```java
public static Tv getBean(String name){     //通过用户输入的名称通过反射来创建对象类型
        Tv tv = null;
        try {
            Class aClass = Class.forName(name);
            tv = (Tv) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  tv;
    }
```

> Title :
>
> ​	 在Java程序执行的过程中，`Class.forName(name)`这一步通常发生在程序的运行阶段，也就是运行时阶段。具体来说，这个方法是在类加载阶段中的加载阶段之后，初始化阶段之前被调用的。
>
> 让我们更详细地解释一下：
>
> 1. **类加载阶段：** 在这个阶段，Java虚拟机会查找并加载类的字节码文件，并将其转换为一个Class对象。在这个阶段，还会执行诸如连接（验证、准备和解析）等操作。`Class.forName(name)`方法通常是在类加载阶段的加载阶段之后执行。
>
> 2. **初始化阶段：** 在类的初始化阶段，Java虚拟机会执行类的初始化代码，包括静态变量的赋值和静态初始化块的执行等。`Class.forName(name)`方法执行后，返回的Class对象已经准备好被初始化，但是实际的初始化工作还没有开始。
>
> 因此，`Class.forName(name)`方法通常在程序的运行阶段被调用，它用于在运行时根据类的全限定名（name）获取对应的Class对象。这个过程可以动态地加载和使用类，从而增强了Java程序的灵活性和动态性。

### 通过配置文件+反射实现简单工厂模式

```java
public static Tv getBean(){
        Tv tv=null;
        String name = Util.ReadXML.readName("实现/config.xml","branName");
        try {
            Class aClass = Class.forName(name);
            tv = (Tv) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  tv;
    }
```

```XML
<?xml version="1.0" encoding="UTF-8" ?>
<config>
    <branName>Factory.Product.Imp.HaierTv</branName>
</config>
```



## 工厂模式

> 工厂模式是一种创建型设计模式，它提供了一种创建对象的接口，但允许子类决定实例化哪个类。工厂模式封装了对象的实例化过程，使得客户端代码与具体的类解耦，从而提高了代码的灵活性和可维护性。以下是一些工厂模式的常见使用场景：
>
> 1. **对象创建复杂：** 当对象的创建过程较为复杂，包括多个步骤或条件判断时，可以使用工厂模式将对象的创建过程封装起来，使得客户端代码更加简洁。
>
> 2. **类不确定：** 当需要根据运行时条件决定具体要实例化的类时，可以使用工厂模式。工厂模式将对象的创建逻辑延迟到子类中实现，根据条件选择合适的子类来创建对象。
>
> 3. **对象的创建频繁：** 当需要创建的对象数量较大，并且创建过程相似或重复时，可以使用工厂模式。工厂模式可以避免重复的创建逻辑，提高代码的复用性。
>
> 4. **隐藏创建逻辑：** 当需要隐藏对象的创建细节，防止客户端直接访问具体类时，可以使用工厂模式。工厂模式将对象的实例化过程封装起来，只暴露一个统一的接口供客户端使用。
>
> 5. **遵循开闭原则：** 当需要添加新的产品类时，可以通过扩展工厂类来实现，而无需修改客户端代码，符合开闭原则。
>
> 总的来说，工厂模式适用于需要统一管理对象创建过程、隐藏创建细节、提高代码复用性和可维护性的场景。通过使用工厂模式，可以降低代码的耦合度，增加代码的灵活性，并且更容易扩展和维护。



### 通过抽象工厂+实现工厂+配置文件+反射实现工厂模式

#### 实现工厂类中的创建采用new形式

```java
public static AbstractFoctory getBean(String foctoryname){
        AbstractFoctory foctory=null;
        List<String> beans = Util.ReadXML.readFactorise();
        try {
            for (String bean : beans) {
                Class beanClass = Class.forName(bean);
                String simpleName = beanClass.getSimpleName();
                if (simpleName.equals(foctoryname)){
                    foctory = (AbstractFoctory) beanClass.newInstance();
                    return foctory;
                }

            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return foctory;
    }

public class HaixiFoctory implements AbstractFoctory {
    @Override
    public Tv getTv() {
        return new HaiXiTv();
    }

    @Override
    public Phone getPhone() {
        return new HaiXiPhone();
    }
}

public class XiaomiFoctory implements AbstractFoctory{
    @Override
    public Tv getTv() {
        return new XiaoMiTv();
    }

    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }
}

```

```XML
<?xml version="1.0" encoding="UTF-8" ?>
<config>
    <foctoryBean>Factory.XiaomiFactoryFactory.XiaomiFactory</foctoryBean>
    <foctoryBean>Factory.HaixiFactoryFactory.HaixiFactory</foctoryBean>
</config>
```

#### 实现工厂类中的创建采用配置文件形式



### 通过一个工厂+配置文件+反射实现工厂模式

