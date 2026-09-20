import  java.util.Scanner;
class Main{
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               //Q1. Positive, Negative or Zero
               System.out.println("Enter the number :");
               int number  = sc.nextInt();
               if(number>0) System.out.println("Positive");
               else if(number<0) System.out.println("Negative");
               else System.out.println("Zero");
               //Q2. Even or Odd
                System.out.println("Enter the number :");
                int num = sc.nextInt();
                if(num%2==0) System.out.println("Even Number");
                else System.out.println("Odd Number");
                //Q3. Greater Number
                System.out.println("Enter the first Number :");
                int num1 = sc.nextInt();
                System.out.println("Enter the second Number :");
                int num2  = sc.nextInt();
                if(num1>num2) System.out.println(num1+" is greater");
                else if(num2>num1) System.out.println(num2 + " is greater");
                else System.out.println("Both are equal");
                //Q4. Equal or Not
                  System.out.println("Enter the first Number :");
                  int a = sc.nextInt();
                  System.out.println("Enter the second Number :");
                  int b = sc.nextInt();
                  if(a==b) System.out.println("numbers are equal");
                  else System.out.println("Number are not equal");
              //Q5. Voting Eligibility
              System.out.println("Enter the Age :");
              int age = sc.nextInt();
              if(age>=18) System.out.println("Eligible to vote");
              else System.out.println("Not eligible to vote");
              //Q6. Largest of Two Numbers
              System.out.println("Enter the first Number :");
              int n1 = sc.nextInt();
              System.out.println("Enter the second Number :");
              int n2 = sc.nextInt();
              if(n1>n2) System.out.println(n1+" is Larger");
              else if(n2>n1) System.out.println(n2 + " is Larger");
              else System.out.println("Both are equal");
              //Q7. Divisible by 5
              System.out.println("Enter the Number: ");
              int n = sc.nextInt();
              if(n%5==0) System.out.println("Divisible by 5");
              else System.out.println("Not Divisible by 5");
              //Q8. Divisible by Both 3 and 5
              System.out.println("Enter the Number: ");
              int k = sc.nextInt();
              if(k%3==0 && k%5==0) System.out.println(k+ "  is divisible by both 3 and 5.");
              else if(k%3==0 && k%5!=0) System.out.println(k+"is divisible by 3.");
              else if(k%3!=0 && k%5==0) System.out.println(k+"is divisible by 5.");
              else System.out.println(k+" is not divisible by both 3 and 5");
              //Q9. Pass or Fail
              System.out.println("Enter the Marks :");
              int marks = sc.nextInt();
              if(marks>=40) System.out.println("Pass");
              else System.out.println("Fail");
              //Q10. Student Grade
              System.out.println("Enter the Marks :");
              int mark = sc.nextInt();
              if(mark>=90 && mark<=100) System.out.println("A");
              else if(mark>=75 && mark<=89) System.out.println("B");
              else if(mark>=60 && mark<=74) System.out.println("C");
              else if(mark>=40 && mark<=59) System.out.println("D");
              else System.out.println("Fail");
              //Q11. Largest of Three Numbers
              System.out.println("Enter the number1 :");
              int number1 = sc.nextInt();
              System.out.println("Enter the number2 :");
              int number2 = sc.nextInt();
              System.out.println("Enter the number3 :");
              int number3 = sc.nextInt();
              if(number1>=number2 && number1>=number3) System.out.println(number1+" is largest");
              else if(number2>=number1 && number2>=number3) System.out.println(number2+" is largest");
              else System.out.println(number3+" is largest");
              //Q12. Smallest of Three Numbers
              System.out.println("Enter the number1 :");
              int val1 = sc.nextInt();
              System.out.println("Enter the number2 :");
              int val2 = sc.nextInt();
              System.out.println("Enter the number3 :");
              int val3 = sc.nextInt();
              if(val1<=val2 && val1<=val3) System.out.println(val1+" is Smallest");
              else if(val2<=val1 && val2<=val3) System.out.println(val2+" is Smallest");
              else System.out.println(val3+" is Smallest");
              //Q13. Number Range
              System.out.println("Enter the number :");
              int l = sc.nextInt();
              if(l>=1 && l<=10 ) System.out.println("Between 1 and 10");
              else System.out.println("Outside the range");
              //Q14. Leap Year
              System.out.println("Enter the Year :");
              int year = sc.nextInt();
              if(year%400==0 || (year%4==0 && year%100!=0)) System.out.println(year+" is Leap Year");
              else System.out.println(year+" is Not a leap year");
              //Q15. Electricity Bill Category
              System.out.println("Enter the Units :");
              int units = sc.nextInt();
              if(units>=0 && units<=100) System.out.println("Low usage");
              else if(units>=101 && units<=300) System.out.println("Medium usage");
              else System.out.println("High Usage");
              //Q16. Student Eligibility
              System.out.println("Enter the Attendance percentage :");
              int percantage = sc.nextInt();
              System.out.println("Enter the marks :");
              int m = sc.nextInt();
              if(m>=40 && percantage>=75) System.out.println("student is eligible");
              else System.out.println("student is Not eligible");
              //Q17. Login Validation
              String username = "admin";
              String password = "1234";
              System.out.println("Enter the user name :");
              String userName = sc.nextLine();
              System.out.println("Enter the password :");
              String passWord = sc.nextLine();
              if(!username.equals(userName) ) System.out.println("Invalid username");
              else if( !password.equals(passWord)) System.out.println("Wrong password");
              else System.out.println("Login successful");
              //Q18. Hospital Appointment Eligibility
              System.out.println("Enter the patient Age :");
              int patientAge = sc.nextInt();
              boolean appointmentRequested = true;
              if(patientAge>=18 && appointmentRequested) System.out.println("A patient can book an appointment");
              else System.out.println("A patient can't book an appointment");
              //Q19. Student Result
              System.out.println("Enter the Java marks :");
              int java = sc.nextInt();
              System.out.println("Enter the Sql marks :");
              int sql = sc.nextInt();
              System.out.println("Enter the JDBC marks :");
              int jdbc = sc.nextInt();
              System.out.println("Total marks of the student :");
              int total = java+sql+jdbc;
              System.out.println("Average of the student :");
              double avg = total/3.0;
              boolean pass = (java>=40 && jdbc>=40 && sql >=40);
              if(avg>=75 && pass) System.out.println("Distinction");
              else if(avg>=60 && pass) System.out.println("First Class");
              else if(avg>=50 && pass) System.out.println("second Class");
              else if(avg>=40 && pass) System.out.println(" pass");
              else System.out.println("Fail");
              //Q20. Hospital Billing Discount
              System.out.println("Enter the Consultation Fee: ");
              double ConsultationFee =  sc.nextDouble();
              System.out.println("Medicine Fee");
              double MedicineFee = sc.nextDouble();
              System.out.println("Enter the Test Fee: ");
              double TestFee= sc.nextDouble();
              double totalAmount = ConsultationFee+MedicineFee+TestFee;
              if(totalAmount>=5000) {
                  double disAmount = totalAmount*(20)/100;
                  System.out.println("Total bill: "+totalAmount);
                  System.out.println("Discount Amount :"+disAmount);
                  System.out.println("Final Ammount :"+(totalAmount-disAmount));
              }
              else if(totalAmount>=3000) {
                  double disAmount = totalAmount*(10)/100;
                  System.out.println("Total bill: "+totalAmount);
                  System.out.println("Discount Amount :"+disAmount);
                  System.out.println("Final Ammount :"+(totalAmount-disAmount));
              }
              else if(totalAmount>=1000 ) {
                  double disAmount = totalAmount*(5)/100;
                  System.out.println("Total bill: "+totalAmount);
                  System.out.println("Discount Amount :"+disAmount);
                  System.out.println("Final Ammount :"+(totalAmount-disAmount));
              }
              else {
                  System.out.println("No Discount");
                  System.out.println("Total Amount :"+totalAmount);

              }
  }
}