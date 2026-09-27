import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        //12.Compare Two Strings
        Scanner sc = new Scanner(System.in);
        System.out.println("Comparing Two Strings");
        System.out.println("Enter the String ");
        String s1 = sc.nextLine();
        System.out.println("Enter the String ");
        String s2 = sc.nextLine();
        int m = s2.length();
        int  n = s1.length();
        boolean flag = false;
       if(n==m) {
           for (int i = 0;i<n;i++) {
               if(s1.charAt(i)!=s2.charAt(i)){
                    flag = true;
                    break;
               }
           }
           if(flag) {
               System.out.println("Not Equal");
           }
           else{
               System.out.println("equal");
           }
       }
       else{
           System.out.println("Not Equal");
       }

    }

}
