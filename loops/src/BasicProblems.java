import  java.util.Scanner;
public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Print 1 to 10
        int k=1;
        while(k<=10){
            System.out.println(k);
            k++;
        }

        //2. Print 10 to 1
        System.out.println("**  Print 10 to 1 **");
        int j=10;
        while(j>0){
            System.out.println(j);
            j--;
        }


        //3. Print Even Numbers
        System.out.println("Even Numbers");
        for(int i=0;i<=20;i++){
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }

        //4. Print Odd Numbers
        System.out.println("Odd Numbers");
        for(int i=0;i<=20;i++){
            if(i%2!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //5.Print Multiplication Table
        System.out.println("Multiplication table: ");
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }


    }
}
