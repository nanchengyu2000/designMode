package Flyweight;

public class Switch extends NetworkDevice{
    private String type;

    public Switch(String type) {
        this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void Use(Port port) {
        System.out.println("使用"+this.type+",开启"+port.getPort()+"端口");
    }
}
