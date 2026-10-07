package paymentprocessing;

public class UPIPayment extends OnlinePayment implements Payment{
    String upiId;
    @Override
    public void makePayment() {
        System.out.println("UPI Payment ");
    }

    UPIPayment(String customerName,double amount,String upiId){
         super(customerName,amount);
         this.upiId = upiId;
    }

    @Override
    void paymentDetails() {
        super.paymentDetails();
        System.out.println("UPI ID :"+upiId);
        System.out.println("Payment Successful");
    }
}

