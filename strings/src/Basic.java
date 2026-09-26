import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Basic {
    public static void main() {
        //1.Print a String

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println("String "+s);


        //2.String Length

        int n = s.length();
        System.out.println( "Length of the String "+n);


        //3.First and Last Character

        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(n-1);
        System.out.println("First character of the String "+firstLetter);
        System.out.println("Last character of the String "+lastLetter);


        //4.Count Characters
        int count =0;
        for (int i = 0; i < n; i++) {
             s.charAt(i);
             count++;
        }
        System.out.println("Count "+ count);

        //5.Convert Uppercase/Lowercase

        String h = s.toLowerCase();
        String j = s.toUpperCase();
        System.out.println("Lower case "+h);
        System.out.println("Uppercase "+j);




    }
}
