import java.util.Scanner;

public class CountFromRange {
    public static void main(String[] args) {
        //8. Count from a Range
        Scanner sc = new Scanner(System.in);
        System.out.println(" Count from a Range");
        System.out.println("Enter the start Number :");
        int start= sc.nextInt();
        System.out.println("Enter the End Number :");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

    }
}
