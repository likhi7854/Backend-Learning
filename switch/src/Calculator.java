import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q2. Simple Calculator
        System.out.println("Simple calculation :");
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the number :");
        int b = sc.nextInt();
        String option = sc.next();
        switch (option) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
