package Adapter;

public class MingleAdapter implements Robot{

    private Bird bird=new Bird();
    private Dog dog=new Dog();
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
