package foodorderbilling;

public class FoodOrder implements  Order{
    String customerName;
    String itemName;
    double  price;
    int quantity;
    double totalPrice;
    double discount;
    public FoodOrder(String customerName, String itemName, double price, int quantity) {
        this.customerName = customerName;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public void calculateBill(){
         totalPrice= price*quantity;

    }
    void displayDetails(){
        System.out.println("Customer name :"+customerName);
        System.out.println("Item :"+itemName);
        System.out.println("Total Amount :"+totalPrice);
        if(totalPrice>=1000){
            System.out.println("10% discount applied ");
             discount = totalPrice*10/100;
        }
        else if(totalPrice>=500){
            System.out.println("5% discount applied ");
            discount = totalPrice*5/100;
        }
        else{
            System.out.println("No Discount applied");
            discount =0;
        }
        double finalAmount = totalPrice-discount;
        System.out.println("Final Amount :"+finalAmount);
    }
}

