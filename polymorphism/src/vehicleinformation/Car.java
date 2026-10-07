package vehicleinformation;

public class Car extends Vehicle {
    String model;
    int numberOfDoors;
    Car(String brand,double speed,String model,int numberOfDoors){
       super(brand,speed);
       this.model = model;
       this.numberOfDoors = numberOfDoors;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Model of the Car :"+this.model);
        System.out.println("Number of Doors :"+this.numberOfDoors);
    }
}
