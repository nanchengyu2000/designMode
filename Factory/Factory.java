package Factory;

import java.util.List;

public class Factory {
    /*
    * 第一种方法 按照用户需求实现简单工厂模式
    * */
//    public static Tv getBean(String name){
//        Tv tv=null;
//        if (name=="HaiXi"){
//            tv = new HaiXiTv();
//        }else if(name=="Haier"){
//            tv=new HaierTv();
//        }
//        return tv;
//    }
    /*
    * 第二种方法 通过反射实现简单工厂模式
    * */
//    public static Tv getBean(String name){
//        Tv tv = null;
//        try {
//            Class aClass = Class.forName(name);
//            tv = (Tv) aClass.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return  tv;
//    }
    /*
    * 第三种方法   通过配置文件+反射实现简单工厂模式
    * */
//    public static Tv getBean(){
//        Tv tv=null;
//        String name = ReadXML.readName("实现/config.xml","branName");
//        try {
//            Class aClass = Class.forName(name);
//            tv = (Tv) aClass.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return  tv;
//    }


    /*
    * 第四种方法  通过抽象工厂+配置文件+反射实现工厂模式
    * */
    public static AbstractFactory getBean(String foctoryname){
        AbstractFactory foctory=null;
        List<String> beans = ReadXML.readFactorise();
        try {
            for (String bean : beans) {
                Class beanClass = Class.forName(bean);
                String simpleName = beanClass.getSimpleName();
                if (simpleName.equals(foctoryname)){
                    foctory = (AbstractFactory) beanClass.newInstance();
                    return foctory;
                }

            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return foctory;
    }
}
