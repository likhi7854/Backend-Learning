import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //14. Palindrome Number
        Scanner sc= new Scanner(System.in);
        System.out.println(" Palindrome Number ");
        System.out.println("Enter the number : ");
        int numb = sc.nextInt();
        int temp = numb;
        int rev =0;
        while(numb!=0){
            int rem =  numb%10;
            rev = rev*10+rem;
            numb/=10;
        }
        if(temp==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }


    }
}
