import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        //15. Find Second-smallest Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int secondMin= Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i]<=secondMin && arr[i]!=min){
                secondMin = arr[i];
            }

        }
        System.out.println(secondMin+" is  a Second-Smallest Number");
    }
}
