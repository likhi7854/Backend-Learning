import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //16. Reverse an Array
        System.out.println("Enter the size of the  Array: ");
        int n = sc.nextInt();
        int[] rev = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            rev[i] = sc.nextInt();
        }
        System.out.println("Reverse of the Array elements :");
        for(int i=rev.length-1;i>=0;i--){
            System.out.println(rev[i]);
        }
    }
}
