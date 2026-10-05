package foodorderbilling;

public class Main {
    public static void main(String[] args) {
         FoodOrder foodOrder = new FoodOrder("venky","Biryani",220,4);
         foodOrder.calculateBill();
         foodOrder.displayDetails();
         System.out.println();
         GroceryOrder groceryOrder = new GroceryOrder("kavya","Rice Bag",1650.5,12);
         groceryOrder.calculateBill();
         groceryOrder.displayDetails();

    }
}
