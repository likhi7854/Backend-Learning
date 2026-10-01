package singleingeritanceex4;

public class Car extends Vehicle {
      String model;
      Car(String brand,double speed,String model){
          this.brand = brand;
          this.speed = speed;
          this.model = model;
          System.out.println("Brand of the vehicle :"+brand);
          System.out.println("Speed of the vehicle :"+speed);
          System.out.println("model of the vehicle :"+model);
      }
}
