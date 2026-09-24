import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        //17. Check Array Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                   found = false;
                   break;
            }
        }
        if(found){
            System.out.println("  palindrome");
        }
        else{
            System.out.println(" Not a palindrome ");
        }

    }
}
