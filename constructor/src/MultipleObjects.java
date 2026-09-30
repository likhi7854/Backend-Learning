public class MultipleObjects {
  //5. Constructor and Multiple Objects
    public static void main(String[] args) {
        Employee e1 = new Employee(101 ,"Ravi ",25000);
        Employee e2 = new Employee(102 ,"Priya",30000);
        Employee e3 = new Employee(103 ,"Arjun",28000);


    }
}
class Employee{
     int id ;
     String name;
     double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee :"+ id+" "+name+" "+salary);
    }
}
