import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        //6.Count Vowels
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Vowels");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
                   count++;
            }
        }
        System.out.println(count);

    }
}
