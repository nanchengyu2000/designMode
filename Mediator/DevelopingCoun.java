package Mediator;

public class DevelopingCoun extends Country{

    public DevelopingCoun(String name) {
        super(name);
    }

    @Override
    public void sendNegotiate(String to, String message) {
        un.sendMessage(this.name,to,message);
    }
}
