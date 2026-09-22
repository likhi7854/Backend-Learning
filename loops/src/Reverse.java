import  java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        //13. Reverse a Number
         Scanner sc= new Scanner(System.in);
        System.out.println(" Reverse the number ");
        System.out.println("Enter the number : ");
        int numb = sc.nextInt();
        int rev =0;
        while(numb!=0){
            int rem =  numb%10;
            rev = rev*10+rem;
            numb/=10;
        }
        System.out.println("Reverse "+rev);

    }
}
