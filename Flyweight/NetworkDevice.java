package Flyweight;

import Flyweight.Port;

public abstract class NetworkDevice {
    public abstract String getType();
    public abstract void Use(Port port);
}
