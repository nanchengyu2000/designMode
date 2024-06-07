package Mediator;

public abstract class UN {
    protected abstract void register(Country country);
    protected abstract void sendMessage(String from,String to,String message);
}
