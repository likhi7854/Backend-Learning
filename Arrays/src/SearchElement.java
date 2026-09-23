import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        //10. Search an Element
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
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if(arr[i]==search){
                 found = true;
                 break;
            }

        }
        if(found){
            System.out.println(search+" Found ");
        }
        else {
            System.out.println(search+"Not found ");
        }


    }

}
