package test;

import source.Singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            Singleton instance = Singleton.getInstance();
            System.out.println(instance.hashCode());
        }).start();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
    }
}
