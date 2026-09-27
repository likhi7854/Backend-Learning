import java.util.Scanner;

public class CountConsonants {
    public static void main(String[] args) {
        //7.Count Consonants
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Consonants");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            if(((c != 'a') && (c != 'e') && (c != 'o') && (c != 'i') && (c != 'u')) && (c >='a' && c<='z' )){
                count++;
            }
        }
        System.out.println(count);

    }
}
