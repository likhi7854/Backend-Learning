import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        //9. Count Positive, Negative and Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Positive, Negative and Zero");
        System.out.println("Enter the Number of elements  :");
        int n = sc.nextInt();
        int posCount =0;
        int negCount =0;
        int zeroCount =0;

        for (int i = 0; i <n; i++) {
              int k = sc.nextInt();
              if(k>0){
                  posCount++;
              }
              else if(k<0){
                  negCount++;
              }
              else{
                  zeroCount++;
              }
        }
        System.out.println(posCount+" "+negCount+" "+zeroCount);

    }
}
