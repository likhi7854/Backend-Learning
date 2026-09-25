import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        //14. Find Second-Largest Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
             if(arr[i]>max){
                 secondMax = max;
                  max = arr[i];

             }
             else if(arr[i]>=secondMax && arr[i]!=max){
                        secondMax = arr[i];
             }

        }
        System.out.println(secondMax+" is  a Second-Largest Number");
    }
}
