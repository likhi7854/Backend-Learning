import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        //11. Count Occurrences
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search :");
        int search = sc.nextInt();
        int count =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==search){
                count++;
            }

        }
        System.out.println(search+" appears "+count+" times ");
    }
}
