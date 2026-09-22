import java.util.Scanner;

public class NumberGuessCategory {
    public static void main(String[] args) {
        //20. Number Guess Category
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number Guess Category");
        int n = sc.nextInt();
        while(true){
            System.out.println("Enter the number :");

            int k= sc.nextInt();
             if(k>0){
                 System.out.println(k+" is a Positive Number ");
             }
             else if(k<0){
                 System.out.println(k+"is a Negative Number ");
             }
             else {
                 System.out.println("Program stopped");
                 break;
             }
        }

    }
}
