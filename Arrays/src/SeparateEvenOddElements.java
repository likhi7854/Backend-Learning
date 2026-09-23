import java.util.Scanner;

public class SeparateEvenOddElements {
    public static void main(String[] args) {
        //19. Separate Even and Odd Elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Elements :");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print( arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd Elements : ");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print( arr[i]+" ");
            }
        }
    }
}
