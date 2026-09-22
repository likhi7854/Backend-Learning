import java.util.Scanner;
public class LargestNumber {
     public static void main(String[] args) {
         //10. Find the Largest Number
         Scanner sc = new Scanner(System.in);
         System.out.println("The Largest Number ");
         System.out.println("Enter the  number of elements :");
         int n = sc.nextInt();
         System.out.println("Enter the 1st number ");
         int firstNum = sc.nextInt();
         int largerNum = firstNum;
         for (int i = 2; i <=n; i++) {
              int k = sc.nextInt();
              if(k>largerNum){
                  largerNum = k;
              }
         }
         System.out.println(largerNum);
     }
}
