import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //18. Find Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial ");
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int factorial =1;
        for(int i=num;i>=1;i--){
              factorial*=i;
        }
        System.out.println(factorial);

    }
}
