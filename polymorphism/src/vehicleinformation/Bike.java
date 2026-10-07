package vehicleinformation;

public class Bike extends Vehicle {
    String model;
    String hasGear;
    Bike(String brand,double speed,String model,String hasGear){
        super(brand,speed);
        this.model = model;
        this.hasGear = hasGear;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Model of the Bike :"+this.model);
        System.out.println("Does bike has  gear :"+this.hasGear);

    }
}
