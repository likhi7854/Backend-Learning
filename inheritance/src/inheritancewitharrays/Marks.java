package inheritancewitharrays;
public class Marks extends Student {
    int[] marks;
    Marks(String name,int rollNo,int[] n) {
        this.name= name;
        this.rollNo = rollNo;
        this.marks = n;
    }
    void displauResults(){

        int total =0;
        int highest=Integer.MIN_VALUE;
        int lowest =Integer.MAX_VALUE;
        System.out.println("Enter the marks :");
         for(int i=0;i<marks.length;i++){
             System.out.println(marks[i]);
                total +=marks[i];
                if(marks[i]>highest){
                    highest=marks[i];
                }
                if(marks[i]<lowest){
                    lowest=marks[i];
                }
         }
         double avg = (double) total/marks.length;
        System.out.println("Total :" +total);
        System.out.println("Highest :"+highest);
        System.out.println("Lowest "+lowest);
         if(avg>=40){
             System.out.println("Pass ");
         }
         else {
             System.out.println("Fail ");
         }


    }
}
