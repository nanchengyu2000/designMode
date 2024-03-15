package Foctory;

import Foctory.Product.Phone;
import Foctory.Product.Tv;

public interface AbstractFoctory {
    Tv getTv();
    Phone getPhone();
}
