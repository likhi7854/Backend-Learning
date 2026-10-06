package employeeworktracker;

public class FullTimeEmployee implements Work {
    String name;
    int workingDays;
    int hoursPerDay;

    public FullTimeEmployee(String name, int workingDays, int hoursPerDay) {
        this.name = name;
        this.workingDays = workingDays;
        this.hoursPerDay = hoursPerDay;
    }
    @Override
    public void calculateWorkHours(){
        System.out.println("Employee :"+name);
         int totalHours= workingDays*hoursPerDay;
        System.out.println("Total working Hours :"+totalHours);
        if(totalHours >= 40){
            System.out.println("Regular Workload");
        }
        else{
            System.out.println("Part-Time Workload");
        }
    }
}
