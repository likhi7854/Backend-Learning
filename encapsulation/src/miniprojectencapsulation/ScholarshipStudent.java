package miniprojectencapsulation;

public class ScholarshipStudent {
     private int studentId;
     private String name;
     private int[] marks;
     private double familyIncome;
     private double scholarshipAmount;

    public ScholarshipStudent(int studentId, String name, int[] marks) {

        boolean valid = true;
        if (marks == null || marks.length == 0) {
            valid = false;
            System.out.println("At least one subject mark is required!");
        }
        else {
            for (int i = 0; i < marks.length; i++) {
                if (marks[i] < 0 || marks[i] > 100) {
                    valid = false;
                    System.out.println("Invalid marks!");
                    break;
                }
            }
        }
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.familyIncome = familyIncome;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getFamilyIncome() {
        return familyIncome;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public void setFamilyIncome(double familyIncome){
        if(familyIncome>0) {
            this.familyIncome = familyIncome;
            System.out.println("Family Income :"+familyIncome);
        }
        else{
            System.out.println("Insufficient Income ");
        }


    }

    public void calculateAverage(){
          int total =0;
          for(int i=0;i<marks.length;i++){
               total+=marks[i];
          }
          System.out.println("Total Marks :"+total);
          double average = (double) total/marks.length;
          System.out.println("Average of the all subjects :"+average);
          calculateScholarship(average);
    }

    public void calculateScholarship(double average){
          if(average >= 90 && familyIncome <= 200000){
              System.out.println("Scholarship is : ₹50,000");
          }
          else if(average >= 80 && familyIncome <= 300000){
            System.out.println("Scholarship is : ₹30,000");
          }
          else if(average >= 70 && familyIncome <= 200000){
              System.out.println("Scholarship is : ₹15,000");
          }
          else{
              System.out.println("Scholarship is : 0");
          }
    }



}
