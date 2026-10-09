package paymentprocessing;

import java.util.Scanner;

public class OnlinePayment  implements  Payment{
    Scanner sc = new Scanner(System.in);
    String customerName;
    double amount;
    OnlinePayment(String customerName,double amount){
        this.customerName = customerName;
        this.amount = amount;
    }
    @Override
    public void makePayment() {
        System.out.println("Online  Payment Method :");
   }
    void paymentDetails(){
        System.out.println("Customer Name :"+customerName);
        System.out.println("Amount Paid :"+amount);
    }

}
