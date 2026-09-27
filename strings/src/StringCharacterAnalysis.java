import java.util.Scanner;

public class StringCharacterAnalysis {
    public static void main(String[] args) {
        //20.String Character Analysis
        Scanner sc = new Scanner(System.in);
        System.out.println("String Character Analysis ");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int upperCaseCount=0;
        int lowerCaseCount=0;
        int  digitCount =0;
        int spaceCount= 0;
        int  specialCharCount =0;
        for(int i=0;i<n;i++){
            char  c = s.charAt(i);
            if(c>='A'  && c<='Z'){
                upperCaseCount++;
            }
            else if(c >= 'a' &&  c <= 'z'){
                lowerCaseCount++;
            }
            else if(c>='0' && c<= '9'){
                digitCount++;
            }
            else if(c==' '){
                spaceCount++;
            }
            else{
                specialCharCount++;
            }
        }
        System.out.println("Uppercase letters :"+upperCaseCount);
        System.out.println("Lowercase letters :"+lowerCaseCount);
        System.out.println("Digits :"+digitCount);
        System.out.println("Spaces :"+spaceCount);
        System.out.println("Special characters :"+specialCharCount);

    }
}
