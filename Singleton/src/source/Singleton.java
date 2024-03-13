package source;

/*
* 单例模式
* */
//public class Singleton {
//    private static Singleton instance;
//    private Singleton(){};
//    这种设计对于线程不安全
//    public static Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
    //这种设计效率较低，因为加锁，后续线程需要等待前面线程解锁，等待阶段不会进入函数
//    public static synchronized Singleton getInstance(){
//        if(instance==null){
//            instance=new Singleton();
//        }
//        return instance;
//    }
//}
/*
* 比较正确的单例模式，饿汉式，
*   优点：写法简单
*   缺点：当对象比较大，增加内存空间
* */
//public class Singleton {
//    private static Singleton instance=new Singleton();  //
//    private Singleton(){};
//    public static Singleton getInstance(){
//        return instance;
//    }
//}
/*
* 比较高效的单例模式 【双重检测锁】
* */
//public class Singleton {
//    private volatile static Singleton instance;
//    private Singleton(){};
//    public static Singleton getInstance(){
//        if (instance==null){
//            synchronized (Singleton.class){  //两个线程到这时一个线程加锁
//                if (instance==null)
//                    instance=new Singleton();
//            }
//        }
//        return instance;
//    }
//}
/*
* 另一种较好的单列模式实现 【内部类】
*
* */
public class Singleton {
    private Singleton(){};
    private static class  SingletonHolder {         //静态类只有在调用的时候才会被加载
        private static final Singleton instance=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
