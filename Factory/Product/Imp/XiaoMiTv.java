package Factory.Product.Imp;

import Factory.Product.Tv;

public class XiaoMiTv extends Tv {
    @Override
    public void shut() {
        System.out.println("小米电视机打开");
    }
}
