import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        //6. Count Even and Odd Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for(int i =0;i<n;i++){
              arr[i] = sc.nextInt();
        }
        int evenCount =0;
        int oddCount = 0;
        for(int i=0;i<n;i++){
             if(arr[i]%2==0) {
                evenCount++;
             }
             else{
                oddCount++;
             }

        }
        System.out.println("Even Count :"+evenCount);
        System.out.println("Odd Count  :"+oddCount);

    }
}
