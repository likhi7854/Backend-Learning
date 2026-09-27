import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        //19.Reverse Each Word
        Scanner sc = new Scanner(System.in);
        System.out.println(" Reverse Each Word");
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        String[] arr = s.split(" ");

       for(String i:arr){
           String r ="";
            for(int j=i.length()-1;j>=0;j--){
                 char  c = i.charAt(j);
                  r+=c;
            }
           System.out.print(r+" ");
       }


    }
}
