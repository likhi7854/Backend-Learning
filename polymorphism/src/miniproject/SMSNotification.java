package miniproject;

public class SMSNotification extends NotificationDetails implements Notification {

    String phoneNumber;

    public SMSNotification(String recipientName, String message, String phoneNumber) {
        super(recipientName, message);
        this.phoneNumber= phoneNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("--- SMS Notification ---");
        super.displayDetails();
        System.out.println("Phone: "+phoneNumber);
        System.out.println("  SMS notification sent successfully ");

    }

    @Override
    public void sendNotification() {
        super.sendNotification();
    }


}
