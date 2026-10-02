package inheritancewitharrays;
//7. Inheritance with Arrays
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the roll No: ");
        int rollNo = sc.nextInt();
        System.out.println("Enter the Subjects :");
        int n = sc.nextInt();
        System.out.println("Enter the Marks: ");
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
              marks[i] = sc.nextInt();
        }
        Marks m = new Marks(name,rollNo,marks);
        m.displauResults();

    }

}
