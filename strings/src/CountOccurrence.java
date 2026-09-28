import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        //13.Count Occurrence of a Character
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Occurrence of a Character");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println("Enter the character ");
        char l = sc.next().charAt(0);
        int count =0;
        for (int i = 0;i<n;i++) {
            char c = s.toLowerCase().charAt(i);
            if(c==l){
                count++;
            }
        }
        System.out.println(count);
    }
}
