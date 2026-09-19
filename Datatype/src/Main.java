class Main{
     public static void main(String[] args) {

         //Q2. Declare Variables
         // Print Different Data Types
          short age = 21;
          double salary = 250000.98;
          char initial = 'A';
          boolean Student= true;
          long population = 1352990720L;
          float percentage = 87.6F;
          String name = "Likhitha";
         System.out.println(age+"\n"+salary+"\n"+initial+"\n"+Student+"\n"+population+"\n"+percentage+"\n"+name);
         //Q5. Sum of Two Numbers
         int a = 10;
         int b = 13;
         System.out.println("sum :"+(a+b));
         System.out.println("Difference :"+(a-b));
         System.out.println("Product :"+a*b);
         System.out.println("Quotient :"+(a/b));
         System.out.println("Remainder :"+(a%b));

         //Q6. Student Information

         String Stud_name = "Likhitha";
         int StuAge = 21;
         String Gender = "Female";
         double Percentage = 89.2;
         char grade ='A';
         boolean status = (Percentage>40);
         System.out.println(Stud_name+"\n"+StuAge+"\n"+Gender+"\n"+Percentage+"\n"+grade+"\n"+status);
         //Q7. Calculate Area
         float r =5.5f;
         System.out.println(3.14*r*r);
         //Q8. Temperature Conversion
         double c = 37.0;
         double fl = (c * 9.0/5.0) + 32.0;
         System.out.println(c+" "+fl);
         //Q9. Large Number
         long n = 9876543210L;
         System.out.println(n);
         //10 Widening Casting
          byte be  = 23;
          short s = be;
          int i = s;
          long l =i;
          float f = l;
          double d = f;
         System.out.println(be+" "+s+" "+i+" "+l+" "+f+" "+d);
         //Q11. Narrowing Casting
         double value = 125.75;
         int Intval = (int)  value;
         long LoVal = (long) value;
         float floVal = (float) value;
         System.out.println(Intval+" "+LoVal+" "+floVal);
         //Q12. Character Conversion
         char ch = 'A';
         int num = (int) ch;
         int let = 66;
         char Cha = (char) let;
         System.out.println(ch+" "+num+" "+Cha);






     }
}