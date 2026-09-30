//7. Constructor Overloading
public class ConstructorOverloading {
    public static void main(String[] args) {
            StudentS s1 = new StudentS();
            StudentS s2 = new StudentS("Likhitha");
            StudentS s3 = new StudentS("Kavya",18);
    }
}
class StudentS{
      StudentS(){
          System.out.println("Students are in class ");
      }
      StudentS(String name){
          System.out.println("Student Name :"+name );
      }
      StudentS(String name,int age){
          System.out.println("Student Name :"+name+"\nStudent Age :"+age);
      }
}
