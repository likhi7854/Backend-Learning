import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q5. Menu Selection
        System.out.println("Menu Selection");
        System.out.println("Enter the Selection  :");

        int selection = sc.nextInt();
        switch (selection){
            case 1:
                System.out.println("You selected Java");
                break;
            case 2:
                System.out.println("You selected SQL");
                break;
            case 3:
                System.out.println("You selected HTML");
                break;
            case 4:
                System.out.println("You selected css");
                break;
            default:
                System.out.println("Invalid selection");

        }

    }

}
