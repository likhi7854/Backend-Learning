package vehicleinformation;

public class Vehicle {
    String brand;
    double speed;
    Vehicle(String brand,double speed){
        this.brand=brand;
        this.speed=speed;
    }
    void displayInfo(){
        System.out.println("Brand of the vehicle :"+this.brand);
        System.out.println("speed of the vehicle :"+this.speed);
    }

}
