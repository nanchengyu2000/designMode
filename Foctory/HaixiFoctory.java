package Foctory;

import Foctory.AbstractFoctory;
import Foctory.Product.Imp.HaiXiPhone;
import Foctory.Product.Imp.HaiXiTv;
import Foctory.Product.Phone;
import Foctory.Product.Tv;

public class HaixiFoctory implements AbstractFoctory {
    @Override
    public Tv getTv() {
        return new HaiXiTv();
    }

    @Override
    public Phone getPhone() {
        return new HaiXiPhone();
    }
}
