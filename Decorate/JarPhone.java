package Decorate;

public class JarPhone extends PhoneDecorator{
    public JarPhone(Phone phone)  {
        super(phone);
    }

    public void function(){
        setVibrate();
        super.function();
    }

    private void setVibrate(){
        System.out.print("¿¥µÁ’Ò∂Ø");
    }

}
