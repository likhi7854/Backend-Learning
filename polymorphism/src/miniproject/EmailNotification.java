package miniproject;

public class EmailNotification extends NotificationDetails implements Notification {

    public EmailNotification(String recipientName, String message, String email) {
        super(recipientName, message);
        this.email = email;
    }

    String email;

    @Override
    void displayDetails() {
        System.out.println("--- Email Notification ---");
        super.displayDetails();
        System.out.println(" Email: " + email);
        System.out.println("Email notification sent successfully");
    }
    @Override
    public void sendNotification() {
        super.sendNotification();

    }
}
