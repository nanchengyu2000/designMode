package Factory;

import Factory.Product.Imp.HaiXiPhone;
import Factory.Product.Imp.HaiXiTv;
import Factory.Product.Phone;
import Factory.Product.Tv;

public class HaixiFactory implements AbstractFactory {
    @Override
    public Tv getTv() {
        return new HaiXiTv();
    }

    @Override
    public Phone getPhone() {
        return new HaiXiPhone();
    }
}
