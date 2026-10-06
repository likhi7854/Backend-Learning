package miniproject;

public class Cab implements Transport{
    String passengerName;
    float distance;
    float totalCharge ;
    float discountAmount;
    public Cab(String passengerName, float distance) {
        this.passengerName = passengerName;
        this.distance = distance;
    }
    void displayDetails(){
        System.out.println("Passenger Name :"+passengerName);
        System.out.println("Distance travelled :"+distance);
    }
    @Override
    public float calculateFare(){
        totalCharge = distance*25;
        if(distance>30){
            System.out.println("15% Discount applied");
            discountAmount= totalCharge*15/100;
        }
        else if(distance>15){
            System.out.println("8% Discount applied");
            discountAmount= totalCharge*8/100;
        }
        else{
            System.out.println("No Discount applied");
            discountAmount = 0;
        }
        totalCharge-=discountAmount;
        System.out.println("Total Fare :"+totalCharge);
        return  totalCharge;
    }
}
