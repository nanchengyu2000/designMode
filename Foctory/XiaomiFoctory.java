package Foctory;

import Foctory.Product.Phone;
import Foctory.Product.Tv;
import Foctory.Product.Imp.XiaoMiPhone;
import Foctory.Product.Imp.XiaoMiTv;

public class XiaomiFoctory implements AbstractFoctory{
    @Override
    public Tv getTv() {
        return new XiaoMiTv();
    }

    @Override
    public Phone getPhone() {
        return new XiaoMiPhone();
    }
}
