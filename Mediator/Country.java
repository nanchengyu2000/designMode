package Mediator;

public abstract class Country {
    protected UN un;
    protected String name;

    public Country(String name) {
        this.name = name;
    }

    public UN getUn() {
        return un;
    }

    public void setUn(UN un) {
        this.un = un;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void sendNegotiate(String to,String message);
    public void receiveNegotiate(String from,String message){
        System.out.println(this.name+"Ω” ’µΩ"+from+":"+message);
    }
}
