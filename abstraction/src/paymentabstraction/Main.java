package paymentabstraction;

public class Main {
    public static void main(String[] args) {
        CardPayment cp = new CardPayment("Venky",61399,"971361351");
        cp.makePayment();
        CashPayment c = new CashPayment("Kavya",198323);
        c.makePayment();
    }
}
