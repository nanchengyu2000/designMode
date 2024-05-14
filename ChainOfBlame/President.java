package ChainOfBlame;

public class President extends Staff{

    @Override
    public void handle(PurchaseOrders purchaseOrders) {
        if (purchaseOrders.getPurchase_capital()<=20) {
            System.out.println(this.name+"总经理审批了"+purchaseOrders.getName()+"申请的"+purchaseOrders.getPurchase_capital()+"万元的采购单");
        }else {
            this.next.handle(purchaseOrders);
        }
    }
}
