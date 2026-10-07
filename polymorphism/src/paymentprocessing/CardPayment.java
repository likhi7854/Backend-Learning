package paymentprocessing;

public class CardPayment extends OnlinePayment implements  Payment {
    String cardNumber;
    @Override
    void paymentDetails() {
        super.paymentDetails();
        System.out.println("Card Number :"+cardNumber);
        System.out.println("Payment Successful");

    }
    CardPayment(String customerName,double amount,String  cardNumber){
        super(customerName,amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        super.makePayment();
        System.out.println("Card Payment ");
    }
}
