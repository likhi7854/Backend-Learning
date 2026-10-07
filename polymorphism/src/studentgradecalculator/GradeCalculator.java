package studentgradecalculator;
//2.Student Grade Calculator
public class GradeCalculator {
    public static void main(String[] args) {
        calculateGrade(89);
        calculateGrade(89,78,67);
    }
    static String calculateGrade(int marks){
           if(marks>=90){
               return "A";
           }
           else if(marks>=75 && marks <=89){
               return "B";
           }
           else if(marks>=60 && marks<=74){
               return "C";
           }
           else if(marks>=40 && marks<=59){
               return "D";
           }
           else{
               return "F";
           }
    }
    static String calculateGrade(int mark1, int mark2, int mark3){
        double average = (double) (mark2+mark1+mark3/3);
        if(average>=90){
            return "A";
        }
        else if(average>=75 && average<=89){
            return "B";
        }
        else if(average>=60 && average<=74){
            return "C";
        }
        else if(average>=40 && average<=59){
            return "D";
        }
        else{
            return "F";
        }
    }
}
