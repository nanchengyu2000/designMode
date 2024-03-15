package Factory.Product.Imp;

import Factory.Product.Tv;

public class HaierTv extends Tv {
    @Override
    public void shut() {
        System.out.println("海尔电视机打开");
    }
}
