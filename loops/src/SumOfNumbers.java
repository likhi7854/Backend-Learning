import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        //6.Sum of Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of Numbers");
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

}
