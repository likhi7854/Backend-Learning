package personalexpensetracker;

public class Expense {
    private String category;
    private double amount;
    private String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if(amount<0){
             this.amount = amount;
            System.out.println("Amount updated successfully\"");
        }
        else{
            System.out.println("Invalid expense amount");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void displayExpense(){
        System.out.println("Category :"+getCategory());
        System.out.println("Amount :"+getAmount());
        System.out.println("Description :"+getDescription());
    }
}
