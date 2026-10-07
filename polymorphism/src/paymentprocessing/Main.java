package paymentprocessing;

public class Main {
    public static void main(String[] args) {
        OnlinePayment payment1 = new UPIPayment("Likhitha",10000,"034736534mzy");
        payment1.makePayment();
        payment1.paymentDetails();
        OnlinePayment payment2 = new CardPayment("Venkateshwar Reddy",25000,"DG52351691j");
        payment2.makePayment();
        payment2.paymentDetails();
    }
}
