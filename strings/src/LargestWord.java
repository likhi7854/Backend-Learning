import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        //18.Find the Largest Word
        Scanner sc = new Scanner(System.in);
        System.out.println("the Largest Word");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int maxLength = Integer.MIN_VALUE;
        for(String i:arr){
            int n = i.length();
            if(n>=maxLength){
                maxLength = n;
            }
        }


    }
}
