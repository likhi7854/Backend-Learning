import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //16. Check Prime Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime Number");
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n<=1) System.out.println("Not a Prime Number ");
        else {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number ");
            }
        }
        //17. Print Prime Numbers in a Range
        System.out.println("Prime Numbers in a Range");
        System.out.println("Enter the Start Number :");
        int start = sc.nextInt();
        System.out.println("Enter the ENd  Number :");
        int end  = sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i<=1) continue;
            boolean prime = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }



    }
}
