package Adapter;

public class BirdAdapter implements Robot {

    private Bird bird=new Bird();
    @Override
    public void cry() {
        System.out.print("机器人在模仿");
        bird.call();
    }

    @Override
    public void move() {
        System.out.print("机器人在模仿");
        bird.fly();
    }
}
