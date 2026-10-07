package vehicleinformation;
//3.Vehicle Information
public class Main {
    public static void main(String[] args) {
        System.out.println("---Bike----");
        Bike bike = new Bike("Honda",100,"Shine","Yes");
        bike.displayInfo();
        System.out.println("---Car---");
        Car car = new Car("Toyota",120,"Glanza",4);
        car.displayInfo();


    }
}
