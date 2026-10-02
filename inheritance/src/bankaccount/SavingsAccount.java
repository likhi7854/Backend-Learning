package bankaccount;

public class SavingsAccount  extends BankAccount{
       float interestRate;
       SavingsAccount(String acNo,double balance,float interestRate){
            this.accountNumber= acNo;
            this.balance =balance;
            this.interestRate = interestRate;
       }
       void amount(){
             double interest = balance*interestRate/100;
           System.out.println("Interest :"+interest);
             double finalBalance = balance+interest;
           System.out.println("Final Balance :"+finalBalance);
             if(finalBalance>=10000){
                 System.out.println("Good Balance ");
             }
             else{
                 System.out.println("Low Balance ");
             }
       }
}
