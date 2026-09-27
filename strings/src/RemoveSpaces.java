import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        //16.Remove Spaces
        Scanner sc = new Scanner(System.in);
        System.out.println("Remove Spaces");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        String k = s;
        int n = s.length();
        String r="";
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            if(c!=' '){
                r+=c;
            }
        }
        System.out.println("Before Remove Spaces :"+k);
        System.out.println("After Remove Spaces :"+r);

    }
}
