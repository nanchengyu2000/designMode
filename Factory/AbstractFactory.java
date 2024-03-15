package Factory;

import Factory.Product.Phone;
import Factory.Product.Tv;

public interface AbstractFactory {
    Tv getTv();
    Phone getPhone();
}
