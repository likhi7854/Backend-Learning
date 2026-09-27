import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        //9.Count Spaces
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Spaces");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
           if(s.charAt(i)==' '){
               count++;
           }
        }
        System.out.println("Count Spaces :" +count);

    }
}
