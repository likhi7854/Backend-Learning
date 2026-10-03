package singleingeritanceex3;

public class Result extends Student {

      int mark1 ;
      int mark2;
      int mark3 ;
      Result(String name,int rollNo,int mark1,int mark2,int mark3){
          super(name,rollNo);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3=mark3;

    }
    void result(){
        int total = mark2+mark1+mark3;
        double average = (double) total/3;
        System.out.println("Total Marks :"+total);
        System.out.println("Average Marks :"+average);
        if(average>=40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }




}
