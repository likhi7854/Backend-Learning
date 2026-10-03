package bankaccount;

import java.util.Scanner;
//6. Bank Account Inheritance
public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number :");
        String acountNum = sc.nextLine();
        System.out.println("Enter the Balance :");
        double balance = sc.nextDouble();
        System.out.println("Enter the Interest rate :");
        float interestRate = sc.nextFloat();
       SavingsAccount sa = new SavingsAccount(acountNum,balance,interestRate);
       sa.amount();

    }
}
