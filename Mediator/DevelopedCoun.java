package Mediator;

public class DevelopedCoun extends Country{
    public DevelopedCoun(String name) {
        super(name);
    }

    @Override
    public void sendNegotiate(String to, String message) {
        un.sendMessage(this.name,to,message);
    }
}
