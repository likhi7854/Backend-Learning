import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        //7. Count Positive, Negative and Zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int positiveCount  = 0;
        int negativeCount  = 0;
        int zeroCount  =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
            else if (arr[i]<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }

        }
        System.out.println("Positive Count  :" + positiveCount);
        System.out.println("Negative Count : " + negativeCount);
        System.out.println("Zero Count :"+zeroCount);

    }
}
