package bankaccountabstraction;

public  abstract class BankAccount {
     String accountNumber;
     double balance;
     BankAccount(String accountNumber,double balance){
          this.accountNumber= accountNumber;
          this.balance = balance;
     }
    abstract void calculateInterest();
}
