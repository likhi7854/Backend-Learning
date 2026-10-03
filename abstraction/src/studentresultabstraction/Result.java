package studentresultabstraction;

public class Result extends Student{
    int mark1;
    int mark2;
    int mark3;
    public Result(String name, int rollNo, int mark1, int mark2, int mark3) {
        super(name, rollNo);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    void calculateResult(){
        int totalMarks = mark1+mark2+mark3;
        double average = (double) totalMarks/3;
        System.out.println("Student Name :"+name);
        System.out.println("Roll No :"+rollNo);
        System.out.println("Total Marks :"+totalMarks);
        System.out.println("Average :"+average);
          if(mark1>=40 && mark2>=40 && mark3>=40){
              System.out.println("Pass ");
          }
          else{
              System.out.println("Fail ");
          }

    }



}
