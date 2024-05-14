package ChainOfBlame;

public abstract class Staff {
    protected Staff next;
    protected String name;

    public void setNext(Staff next) {
        this.next = next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void handle(PurchaseOrders purchaseOrders);
}
