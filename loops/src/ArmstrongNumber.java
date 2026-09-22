import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //19. Armstrong Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong Number");
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp =n;
        int armstrongNumber =0;
        int digCount = 0;
        if(temp==0){
            digCount=1;
        }
        for (; temp!= 0; temp = temp/ 10) {
            digCount++;
        }
        temp=n;
        while(n!=0){
             int rem = n%10;
             armstrongNumber+=(int)Math.pow(rem,digCount);
             n/=10;
        }
        if(armstrongNumber==temp){
           System.out.println(temp+" is a Armstrong Number");
        }
        else {
            System.out.println(temp+" is  not a Armstrong Number");

        }

    }
}
