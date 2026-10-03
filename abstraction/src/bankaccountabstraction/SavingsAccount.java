package bankaccountabstraction;

public class SavingsAccount extends BankAccount{
    float interestRate;
    SavingsAccount(String accountNumber,double balance, float interestRate){
         super(accountNumber,balance);
         this.interestRate=interestRate;
    }
    @Override
    void calculateInterest(){
        double interest = balance * (double) interestRate / 100;
        double finalBalance = balance+interest;
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balnce :"+balance);
        System.out.println("Interest Rate  :"+interestRate);
        System.out.println("Interest "+interest);
        System.out.println("Final Balance :"+finalBalance);
        if(finalBalance>=10000) System.out.println("Good Balance");
        else System.out.println("Low Balance ");
    }
}
