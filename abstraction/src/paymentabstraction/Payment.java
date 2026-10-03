package paymentabstraction;

public abstract class Payment {
    abstract void makePayment();
    String customerName;
    double amount;

    public Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

}
