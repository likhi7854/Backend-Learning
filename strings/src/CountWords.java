import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        //17.Count Words
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Words");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        int n = s.length();
        int count =1;
        for(int i=0;i<n;i++){
            char  c = s.toLowerCase().charAt(i);
            if(c==' '){
               count++;
            }
        }
        System.out.println("Count Words :"+count);


    }
}
