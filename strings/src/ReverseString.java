import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //10.Reverse a String
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse a String");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        String reverse = "";
        for(int i=n-1;i>=0;i--){
             reverse+=s.charAt(i);
        }
        System.out.println(reverse);

    }
}
