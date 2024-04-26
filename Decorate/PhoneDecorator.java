package Decorate;

public class PhoneDecorator extends Phone{
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    void function() {
        phone.function();
    }
}
