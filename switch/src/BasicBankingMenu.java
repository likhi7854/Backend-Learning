import java.util.Scanner;

public class BasicBankingMenu{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Q9. Basic Banking Menu
        System.out.println("Basic Banking Menu");
        double balance = 10000;
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw ");
        System.out.println("Enter the Choice  :");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(balance);
                break;
            case 2:
                double deposit  = sc.nextDouble();
                double newBalance = balance + deposit;
                System.out.println(newBalance);
                break;
            case 3:
                double withDraw  = sc.nextDouble();
                if(withDraw<=balance) {
                    double withDrawBalance = balance - withDraw;
                    System.out.println(withDrawBalance);
                }
                else{
                    System.out.println("Insufficient balance ");
                }
                break;
            default:
                System.out.println("Invalid Choice :");


        }
    }

}

