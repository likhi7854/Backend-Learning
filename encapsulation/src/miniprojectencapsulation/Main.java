package miniprojectencapsulation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of subjects :");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks :");
        for(int i=0;i<marks.length;i++){
              marks[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++) {
            ScholarshipStudent[] scholarshipStudent = {new ScholarshipStudent(201, "Ananya", marks),
                    new ScholarshipStudent(202,"Likhitha",marks),
                    new ScholarshipStudent(203,"Ramya",marks)
            };
        }
    }
}
