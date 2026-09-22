import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        //11. Count Digits
        Scanner sc= new Scanner(System.in);
        System.out.println(" Count Digits ");
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int DigCount = 0;
        if(number==0){
            DigCount=1;
        }
        for (; number != 0; number = number / 10) {
            DigCount++;
        }
        System.out.println(DigCount);
    }
}
