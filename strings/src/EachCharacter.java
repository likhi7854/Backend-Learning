import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {
        //14.Print Each Character
        Scanner sc = new Scanner(System.in);
        System.out.println("Print Each Character");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<n;i++){
            System.out.println(s.charAt(i));
        }


    }
}
