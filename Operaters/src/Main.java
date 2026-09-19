class Main{
    public static void main(String[] args) {
          //Q1. Arithmetic Operations
          int a =10;
          int b = 6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //Q2. Positive or Negative
        int va1 = 25;
        if(va1>0) System.out.println("Positive");
        else if(va1<0) System.out.println("Negative");
        else System.out.println("Zero");
        //Q3. Compare Two Numbers
        int a1 = 25;
        int b1 = 30;
        System.out.println(a1>b1);
        System.out.println(a1<b1);
        System.out.println(a1==b1);
        System.out.println(a1!=b1);
        System.out.println(a1>=b1);
        System.out.println(a1<=b1);
        //Q4. Even or Odd
        int val = 24;
        int vl2 = 17;
        if(val%2==0) System.out.println("Even");
        else System.out.println("Odd");
        if(vl2%2==0) System.out.println("Even");
        else System.out.println("Odd");
        // Q5. Simple Calculator

        int v1 = 20;
        int v2 = 5;
        char operator ='*';
        switch (operator){
            case '+':
                System.out.println(v1+v2);
                break;
            case '-':
                System.out.println(v1-v2);
                break;
            case '*':
                System.out.println(v1*v2);
                break;
            case '/':
                System.out.println(v1/v2);
                break;
            case '%':
                System.out.println(v1%v2);
                break;
            default:
                System.out.println("Not valid");


        }
        // Q6 Increment and Decrement
        // 10  first operation then inc
        // 11
        // 12  first inc then operation
        // 12   first operation then dec
        // 10   first dec then operation
        //Q7. Compound Assignment
        int z = 10;
        System.out.println("Z  "+(z+=10));
        System.out.println("Z  "+(z-=20));
        System.out.println("Z  "+(z*=20));
        System.out.println("Z  "+(z/=30));
        System.out.println("Z  "+(z%=50));
        //Q8. Largest of Two Numbers
        int x = 45;
        int y = 72;
        if(x>y) System.out.println(x);
        else System.out.println(y);
        int ans = (x>y)? x:y;
        System.out.println(ans);
        int age = 22;
        boolean graduated = true;
        String res = (age >=18 && graduated) ? "graduation is completed":"graduation is not completed";
        System.out.println(res);
        //Q10. Three Conditions
        int Perage = 25;
        boolean hasDegree = true;
        boolean hasExperience = false;
        String result  = (Perage>=21 && hasDegree && (hasExperience || Perage>=25))?"Eligible":"Not Eligible";
        System.out.println(result);
        //Q11. Operator Precedence
        //20 30  bodmas rule
        //Q12. Mixed Arithmetic
        //3 3.3333  1  16  26
        //Q13. Ternary Operator
        int marks = 72;
        String PF = (marks>=40)?"Pass":"Fail";
        System.out.println(PF);
        //Q14 Debug the Expression
        //
//        int a = 10;
//        int b = 20;
//
//        boolean result1 = a < b && b == 20;
//
//        System.out.println(result1);

        int a2 = 10;
        int b2 = 0;

        boolean result2 = (b2 != 0) && (a2 / b2 > 2);

        System.out.println(result2);
        //& gives the ArithmeticException Error because & is an bitwise operation
        // Q16. Complex Expression
        int a3 = 5;
        int b3= 10;
        int c3 = 15;

        int result3 = a3++ + ++b3 * 2 - --c3;
        System.out.println(result3);
        // 5+(11*2)-14
        //6 11 14
        //Q17. Hospital Billing Calculation
        double consultationFee = 500;
        double medicineFee = 1200;
        double testFee = 800;
        double discount = 10;
       double total  = (consultationFee+medicineFee+testFee);
        int dis = 10;

        double disAmo = total*10/100;
        double FinaAmo = total-disAmo;
        System.out.println(dis+" "+disAmo+" "+FinaAmo);
        //Q18. Backend Validation Condition
        String username = "admin";
        String password = "java123";
        boolean accountActive = true;
        String answer = (username.equals("admin") && password.equals("java123") && accountActive)?"eligible":"Not eligible";
        String answer1 = (username.equals("Admin") && password.equals("java1@23") && accountActive)?"eligible":"Not eligible";
        String answer2 = (username.equals("Admin") && password.equals("java123") && !accountActive)?"eligible":"Not eligible";
        String answer3 = (username.equals("Admin") && password.equals("java123") && accountActive)?"eligible":"Not eligible";
        System.out.println(answer2+" "+answer+" "+answer3+" "+answer1);
        //Q19. Find the Output — Operators
        //result = 14  x=5
        //x++ 5 6
        //++x 7 7
        //x-- 7 6
        //--x 5 5

        //Q20. Real-World Operator Challenge
        String StuName = "Likhitha Reddy ";
        int  A = 89,B = 98, C = 78,D = 65,E = 56;
        System.out.println("Total :"+(A+B+C+D+E));
        double avg = (A+B+C+D+E)/5;
        System.out.println("Average :"+((A+B+C+D+E)/5));
        System.out.println("Percentage :"+(((A+B+C+D+E)/500))*100);
        if(avg>=90 && avg<=100) System.out.println("A");
        else if(avg>=75 && avg<=89) System.out.println("B");
        else if(avg>=60 && avg<=74) System.out.println("c");
        else if(avg>=40 && avg<=59) System.out.println("d");
        else System.out.println("F");


















    }
}