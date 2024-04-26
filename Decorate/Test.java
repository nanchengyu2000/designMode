package Decorate;

public class Test {
    public static void main(String[] args) {
        Phone phone;
        phone=new SimplePhone();
        JarPhone jarPhone = new JarPhone(phone);
        ComplexPhone complexPhone = new ComplexPhone(jarPhone);
        complexPhone.function();
    }
}
