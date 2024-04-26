package Flyweight;

import Flyweight.NetworkDevice;
import Flyweight.Switch;

import java.util.ArrayList;
import java.util.HashMap;

public class DeviceFactory {
    private ArrayList<NetworkDevice> devices=new ArrayList<>();
    private static DeviceFactory instance=new DeviceFactory();
    private int totalTerminal=0;
    public DeviceFactory() {

    }
    public static DeviceFactory getInstance(){
        return instance;
    }
    public NetworkDevice getNetworkDevice(String type){
        for (NetworkDevice device : devices) {
            if (device.getType()==type)
                return device;
        }
        return null;
    }
    public int getTotalDevice(){
        return devices.size();
    }
    public void addDevice(NetworkDevice device){
        devices.add(device);
    }
    public int getTotalTerminal(){
        for (NetworkDevice device : devices) {
            if (device instanceof Switch) {
                totalTerminal++;
            }
        }
        return totalTerminal;
    }

}
