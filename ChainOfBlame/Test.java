package ChainOfBlame;

public class Test {
    public static void main(String[] args) {
        PurchaseOrders order = new PurchaseOrders(27.5, "张三");
        Director director = new Director();
        director.setName("李四");
        DepartManager departManager = new DepartManager();
        departManager.setName("王五");
        VicePresident vicePresident = new VicePresident();
        vicePresident.setName("刘七");
        President president = new President();
        president.setName("莉莉");
        LeadershipAssembly leadershipAssembly = new LeadershipAssembly();
        director.setNext(departManager);
        departManager.setNext(vicePresident);
        vicePresident.setNext(president);
        president.setNext(leadershipAssembly);
        director.handle(order);
    }
}
