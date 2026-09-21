import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q4. Vowel or Not
        System.out.println("Vowel or Not");
        System.out.println("Enter the vowel: ");
        char vowel = sc.next().toLowerCase().charAt(0);
        switch (vowel){
            case 'a':
                System.out.println("a is Vowel");
                break;
            case 'e':
                System.out.println("e is Vowel");
                break;
            case 'i':
                System.out.println("i is Vowel");
                break;
            case 'o':
                System.out.println("o is Vowel");
                break;
            case 'u':
                System.out.println("u is Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }

}
