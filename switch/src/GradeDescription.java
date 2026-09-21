import java.util.Scanner;

public class GradeDescription{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q8. Grade Description
        System.out.println("Grade Description: ");
        System.out.println("Enter the Grade(A,B,C,D,F) ");
        char grade = sc.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good ");
                break;
            case 'C':
                System.out.println("Average ");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");

        }

    }

}
