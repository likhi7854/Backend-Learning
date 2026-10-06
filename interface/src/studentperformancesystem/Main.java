package studentperformancesystem;
//4.Student Performance System
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no.of Subjects ");
            int n = sc.nextInt();
            int[] marks = new int[n];
            System.out.println("Enter the marks :");
            for(int i=0;i<n;i++){
                marks[i] = sc.nextInt();
            }
            Student s = new Student("Likhitha",223,marks);
            s.displayDetails();
            s.calculatePerformance();
    }
}
