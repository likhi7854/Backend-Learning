import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        //15.Find Duplicate Characters
        Scanner sc = new Scanner(System.in);
        System.out.println("Duplicate Characters");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                char d = s.toLowerCase().charAt(k);
                if (c==d) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            // Check whether this element appears again
            for (int j = i + 1; j < n; j++) {
                char l = s.toLowerCase().charAt(j);
                if (l==c) {
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}
