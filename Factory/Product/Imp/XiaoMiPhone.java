package Factory.Product.Imp;

import Factory.Product.Phone;

public class XiaoMiPhone extends Phone {
    @Override
    public void Call() {
        System.out.println("小米手机打电话");
    }
}
