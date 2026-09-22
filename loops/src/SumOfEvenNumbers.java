import  java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //7.Sum of Even Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of Even Numbers");
        System.out.println("Enter the Number :");
         int n = sc.nextInt();
         int sum =0;
         for (int i = 1; i <= n; i++) {
             if(i%2==0){
                  sum+=i;
             }
         }
        System.out.println(sum);
    }
}
