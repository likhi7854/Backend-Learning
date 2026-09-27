import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //11.Palindrome String
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome String");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        String temp =s;
        int n = s.length();
        String reverse = "";
        for(int i=n-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(reverse.equals(temp)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("is not a Palindrome String");
        }

    }
}
