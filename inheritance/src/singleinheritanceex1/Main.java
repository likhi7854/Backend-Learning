package singleinheritanceex1;

public class Main {

        public static void main(String[] args) {
            Employee e = new Employee();
            e.name= "Likhitha";
            e.age = 21;
            e.employeeId=123;
            e.salary=100000f;
            System.out.println(e.name+"\n"+e.age+"\n"+e.employeeId+"\n"+e.salary);
        }

}
