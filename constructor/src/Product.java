//8. Interview-Level Constructor Problem
public class Product {
    public static void main(String[] args) {
        System.out.println("A no-argument constructor that gives default values");
           Products p1 = new Products();
            System.out.println("A parameterized constructor that initializes all four values");

           Products p = new Products(121,"Sareees",234f,98);

    }

}

class Products{
    int productId;
    String productName;
    float price;
    int quantity;

    Products(){
        System.out.println("ID: "+0);
        System.out.println("Name :"+"Unknown");
        System.out.println("Price :"+0);
        System.out.println("Quantity :"+0);
    }
    Products(int productId,String productName,float price,int quantity){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        float totalPrice = price * quantity;
        System.out.println("product Id:"+productId);
        System.out.println("product Name :"+productName);
        System.out.println("Product Price :"+price);
        System.out.println("Product quantity :"+quantity);
        System.out.println("Total Price :"+totalPrice);


    }


}

