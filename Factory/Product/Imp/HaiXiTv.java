package Factory.Product.Imp;

import Factory.Product.Tv;

public class HaiXiTv extends Tv {
    @Override
    public void shut() {
        System.out.println("海信电视机打开");
    }
}
