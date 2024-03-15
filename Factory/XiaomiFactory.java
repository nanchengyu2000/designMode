package Factory;

import Factory.Product.Phone;
import Factory.Product.Tv;
import Factory.Product.Imp.XiaoMiPhone;
import Factory.Product.Imp.XiaoMiTv;

public class XiaomiFactory implements AbstractFactory {
    @Override
    public Tv getTv() {
        return new XiaoMiTv();
    }

    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }
}
