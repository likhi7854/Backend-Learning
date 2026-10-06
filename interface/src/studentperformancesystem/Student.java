package studentperformancesystem;

public class Student implements Performance {
    String name;
    int rollNo;
    int[] marks;
    double avg;
    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Roll No :"+rollNo);
    }

    @Override
    public void calculatePerformance() {
        System.out.println("Marks of the Student  :");
        int total  =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            total+=marks[i];
            if(marks[i]>max){
                max = marks[i];
            }
            if(marks[i]<min){
                min = marks[i];
            }
        }
        boolean pass = true;
        avg = (double) total/marks.length;
        for(int i=0;i<marks.length;i++){
              if(marks[i]<40){
                  pass = false;
                  break;
              }
        }
        if(pass){
            System.out.println("Pass ");
        }
        else{
            System.out.println("Fail ");
        }
        System.out.println("Minimum marks :"+min);
        System.out.println("Maximum marks :"+max);
        System.out.println("Total  marks  :"+total);
        System.out.println("Average marks :"+avg);
        performanceGuide(avg);
    }
    void performanceGuide(double avg){
           if(avg>=80){
               System.out.println("Performance is Excellent ");
           }
           else if(avg >=60){
               System.out.println("Performance is Good ");
           }
           else if(avg>=40){
            System.out.println("Performance is Average ");
           }
           else{
               System.out.println("Performance is Poor ");
           }
    }
}
