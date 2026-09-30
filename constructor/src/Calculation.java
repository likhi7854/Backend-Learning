//6. Constructor with Calculation
public class Calculation {
    public static void main(String[] args) {
              Cal c= new Cal(10,20);

    }
}
class Cal{
     Cal(int length,int width){
         int area = length*width;
         System.out.println("Area of the Rectangle :"+area);
         int parimeter = 2*(length+width);
         System.out.println("Perimeter of the Rectangle :"+parimeter);
     }
}
