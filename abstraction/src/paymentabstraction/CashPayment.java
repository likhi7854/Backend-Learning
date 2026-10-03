package paymentabstraction;

public class CashPayment extends Payment{

    public CashPayment(String customerName, double amount) {
        super(customerName, amount);
    }
    @Override
    void makePayment(){
        System.out.println("Customer Name"+customerName);
        System.out.println("Amount :"+amount);
        System.out.println("Payment Mode :Cash");
    }
}
