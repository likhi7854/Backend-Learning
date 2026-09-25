import java.util.Scanner;
public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Print Array Elements
        int[] a = {12,34,56,221,23};
        System.out.println("printing  all array elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        //2.Take Array Input
        System.out.println("Enter 5 Array Elements");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
        }
        System.out.println("printing  all elements");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        //3. Print Array in Reverse
        System.out.println("Enter the size of the  Array: ");
        int n = sc.nextInt();
        int[] rev = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
                rev[i] = sc.nextInt();
        }
        System.out.println("Reverse of the Array elements :");
        for(int i=rev.length-1;i>=0;i--){
            System.out.println(rev[i]);
        }
        //4. Sum of Array Elements
        int sum =0;
        for(int i=0;i<rev.length;i++){
              sum+=rev[i];
        }
        System.out.println("Sum :"+sum);
        //5.Find Average
        double avg = (double) sum/n;
        System.out.println("Avaerage "+ avg);

    }
}
