package Flyweight;

import Flyweight.NetworkDevice;
import Flyweight.Port;

public class Hub extends NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
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
