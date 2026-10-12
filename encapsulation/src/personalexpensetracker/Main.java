package personalexpensetracker;

public class Main {
    public static void main(String[] args) {
           Expense e = new Expense("Food",250,"Lunch");
        System.out.println("Original expense:");
        e.displayExpense();

        System.out.println("Updating amount:");
        e.setAmount(350);
        e.displayExpense();

        System.out.println("Trying an invalid amount:");
        System.out.println("Original expense:");
        e.displayExpense();

        System.out.println("Updating amount:");
        e.setAmount(350);
        e.displayExpense();

        System.out.println("Trying an invalid amount:");
        e.setAmount(-100);
        e.displayExpense();


    }
}
