package miniproject;

public class Auto implements Transport{

    String passengerName;
    float distance;
    float totalCharge ;
    float discountAmount;
    public Auto(String passengerName, float distance) {
        this.passengerName = passengerName;
        this.distance = distance;
    }
    void displayDetails(){
        System.out.println("Passenger Name :"+passengerName);
        System.out.println("Distance travelled :"+distance);
    }
    @Override
    public float calculateFare(){
        totalCharge = distance*15;
        if(distance>10){
            System.out.println("5%  Discount applied");
            discountAmount= totalCharge*5/100;
            totalCharge-=discountAmount;
            System.out.println("After discount applied ");
            System.out.println("Total Fair :"+totalCharge);
        }
        else{
            System.out.println("No discount applied ");
            System.out.println("Total Fair :"+totalCharge);
        }
        return  totalCharge;

    }
}
