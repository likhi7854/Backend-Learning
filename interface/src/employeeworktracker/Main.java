package employeeworktracker;
//2.Employee Work Tracker
public class Main {
    public static void main(String[] args) {
       Work fullTimeEmployee = new FullTimeEmployee("Likhitha",20,6);
       fullTimeEmployee.calculateWorkHours();
       Work partTimeEmployee = new PartTimeEmployee("Karthik",24,8);
       partTimeEmployee.calculateWorkHours();

    }
}
