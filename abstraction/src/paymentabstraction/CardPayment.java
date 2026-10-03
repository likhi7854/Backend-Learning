package paymentabstraction;

public class CardPayment extends Payment{
    String cardNumber;

    public CardPayment(String customerName, double amount, String cardNumber) {
        super(customerName, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment() {
        System.out.println("Customer Name"+customerName);
        System.out.println("Amount :"+amount);
        System.out.println("Payment Mode : Card");
        System.out.println("Card Number :"+cardNumber);
    }
}
