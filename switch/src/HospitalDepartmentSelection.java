import java.util.Scanner;

public class HospitalDepartmentSelection {
    public static void main(String[] args) {
        //Q10. Hospital Department Selection
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hospital Department Selection");
        System.out.println("1.Cardiology");
        System.out.println("2. Neurology");
        System.out.println("3. Orthopedics");
        System.out.println("4.General Medicine");
        System.out.println("Enter the choice :");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("consultation fee for Cardiology is ₹1000");
                break;
            case 2:
                System.out.println("consultation fee for Neurology is ₹900");
                break;
            case 3:
                System.out.println("consultation fee for Orthopedics is  ₹800 ");
                break;
            case 4:
                System.out.println("consultation fee for General Medicine is ₹500");
                break;
            default:
                System.out.println("Invalid department");

        }

    }

}
