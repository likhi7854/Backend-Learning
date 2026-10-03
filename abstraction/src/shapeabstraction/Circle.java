package shapeabstraction;

public class Circle  extends Shape{

    float radius;
    Circle(float  radius){
         this.radius = radius;
    }
    @Override
    void calculateArea(){
          float area = 3.14f*radius*radius;
          System.out.println("Area :"+area);
    }

}
