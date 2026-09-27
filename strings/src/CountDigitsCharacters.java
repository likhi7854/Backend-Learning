import java.util.Scanner;

public class CountDigitsCharacters {
    public static void main(String[] args) {
        //8.Count Digits and Characters
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Digits and Characters: ");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int digitCount =0;
        int charCount =0;
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            if((c >='a' && c<='z' )){
                charCount++;
            }
            else if((c>='0' && c<='9') ){
                digitCount++;
            }
        }
        System.out.println("Digit Count :"+digitCount);
        System.out.println("Character count :"+charCount);

    }
}
