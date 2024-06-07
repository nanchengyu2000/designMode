package Mediator;

public class Test {
    public static void main(String[] args) {
        DevelopingCoun China = new DevelopingCoun("中国");
        DevelopingCoun India = new DevelopingCoun("印度");
        DevelopedCoun America = new DevelopedCoun("美国");
        DevelopedCoun England = new DevelopedCoun("英国");
        WFC wfc = new WFC();
        wfc.register(China);
        wfc.register(America);
        China.sendNegotiate("美国","我日，今天我赢了~！");
        China.sendNegotiate("英国","hello~");
    }
}
