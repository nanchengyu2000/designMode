package Foctory.test;

import Foctory.Foctory;
import Foctory.Product.Phone;
import Foctory.Product.Tv;
import Foctory.XiaomiFoctory;

public class Test {
    public static  void main(String[] args) {
        //简单工厂模式
//        Tv tv = Foctory.getBean();
//        tv.shut();

        //工厂模式
        /*
        * 这部分测试我只是对工厂使用了xml,而工厂里面的创建产品我使用的是new
        *
        * */
        XiaomiFoctory foctory=(XiaomiFoctory)Foctory.getBean("XiaomiFoctory");
        Phone phone = foctory.getPhone();
        phone.Call();

    }
}
