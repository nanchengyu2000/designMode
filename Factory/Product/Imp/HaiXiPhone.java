package Factory.Product.Imp;

import Factory.Product.Phone;

public class HaiXiPhone extends Phone {
    @Override
    public void Call() {
        System.out.println("海信手机打电话了");
    }
}
