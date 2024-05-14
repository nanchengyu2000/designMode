package ChainOfBlame;

public class LeadershipAssembly extends Staff{

    @Override
    public void handle(PurchaseOrders purchaseOrders) {
            System.out.println("领导大会审批了"+purchaseOrders.getName()+"申请的"+purchaseOrders.getPurchase_capital()+"万元的采购单");
    }
}
