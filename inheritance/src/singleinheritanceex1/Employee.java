package singleinheritanceex1;

public class Employee extends Person {
    int employeeId ;
    float salary;
    Employee(String name,int age,int employeeId,float salary){
         this.name=name;
         this.age = age;
         this.employeeId = employeeId;
         this.salary = salary;
        System.out.println(name+"\n"+age+"\n"+employeeId+"\n"+salary);

    }
}
