import java.util.Scanner;

public class NumberCategory {
    public static void main(String[] args) {
        //Q6. Number Category
        Scanner sc = new Scanner(System.in);
        System.out.println(" Number Category");
        System.out.println("Enter the Number(1-3): ");
        int number = sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Positive ");
                break;
            case 2:
                System.out.println("Negative");
                break;
            case 3:
                System.out.println("Zero");
                break;
            default:
                System.out.println("invalid Number ");
        }

    }

}
