package Decorate;

public class ComplexPhone extends PhoneDecorator {

    public ComplexPhone(Phone phone) {
        super(phone);
    }

    @Override
    void function() {
        setFlicker();
        super.function();
    }

    private void setFlicker(){
        System.out.print("¿¥µÁ…¡À∏");
    }
}
