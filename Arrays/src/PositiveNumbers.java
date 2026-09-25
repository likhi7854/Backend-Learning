import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        //12. Print Positive Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
        //13. Print Numbers Greater Than 50
        for(int i=0;i<n;i++){
            if(arr[i]>50){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
