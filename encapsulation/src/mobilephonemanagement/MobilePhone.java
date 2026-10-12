package mobilephonemanagement;

public class MobilePhone {
    private String brand;
    private String model;
    private int batteryPercentage;
    private double price;

    public MobilePhone(String brand, String model, int batteryPercentage, double price) {
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        if(batteryPercentage>=0 && batteryPercentage<=100) {
            this.batteryPercentage = batteryPercentage;
            System.out.println("Vali");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
            System.out.println("Valid amount ");
        }
    }
    public void displayPhoneDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("Battery Percentage :"+batteryPercentage);
        System.out.println("Price :"+price);
    }
}
