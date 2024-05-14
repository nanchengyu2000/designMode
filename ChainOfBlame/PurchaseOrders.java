package ChainOfBlame;

public  class PurchaseOrders {
    private double purchase_capital=0;
    private String name;

    public double getPurchase_capital() {
        return purchase_capital;
    }

    public void setPurchase_capital(double purchase_capital) {
        this.purchase_capital = purchase_capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PurchaseOrders(double purchase_capital, String name) {
        this.purchase_capital = purchase_capital;
        this.name = name;
    }
}
