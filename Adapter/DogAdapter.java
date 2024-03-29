package Adapter;

//public class DogAdapter extends Dog implements Robot{  //类适配器
public class DogAdapter implements Robot{
    private Dog dog=new Dog();
    @Override
    public void cry() {
        System.out.print("机器人在模仿");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.print("机器人在模仿");
        dog.run();
    }
}
