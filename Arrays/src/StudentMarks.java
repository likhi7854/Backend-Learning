import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // 20. Student Marks Analysis
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks of the students :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totalMarks =0;
        for (int i = 0; i < n; i++) {
            totalMarks+=arr[i];
        }
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Average marks: "+(totalMarks/n));
        int maxMarks =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
             if(arr[i]>maxMarks){
                 maxMarks = arr[i];
             }
        }
        System.out.println("Highest mark: "+maxMarks);
        int minMarks =Integer.MAX_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]<minMarks){
                minMarks = arr[i];
            }
        }
        System.out.println("Lowest mark: "+minMarks);
        

    }
}
