import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        //Q7. Traffic Signal
        System.out.println(" Traffic Signal");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character (R Y G):");
        char c = sc.next().charAt(0);
        switch (c){
            case 'R':
                System.out.println("Stop ");
                break;
            case 'Y':
                System.out.println("Ready ");
                break;
            case 'G':
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal ");
        }
    }

}
