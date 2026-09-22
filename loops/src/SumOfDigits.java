import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //12. Sum of Digits
        Scanner sc= new Scanner(System.in);
        System.out.println("Sum of Digits ");
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        while(number!=0){
            int rem =  number%10;
            sum+=rem;
            number/=10;
        }
        System.out.println(sum);
    }
}
