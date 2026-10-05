package foodorderbilling;

public class GroceryOrder implements Order {
    String customerName;
    String itemName;
    double  price;
    int quantity;
    double totalPrice;
    double discount;
    public GroceryOrder(String customerName, String itemName, double price, int quantity) {
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
        if(totalPrice>=2000){
            System.out.println("15% discount applied ");
            discount = totalPrice*15/100;
        }
        else if(totalPrice>=1000){
            System.out.println("8% discount applied ");
            discount = totalPrice*8/100;
        }
        else{
            System.out.println("No Discount applied");
            discount =0;
        }
        double finalAmount = totalPrice-discount;
        System.out.println("Final Amount :"+finalAmount);
    }
}
