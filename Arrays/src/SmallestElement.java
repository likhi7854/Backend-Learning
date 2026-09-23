import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

        //9. Find Smallest  Element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallestNum = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<smallestNum){
                smallestNum= arr[i];
            }

        }
        System.out.println("Smallest Element:" + smallestNum);

    }

}
