package miniproject;

public class WhatsAppNotification extends NotificationDetails implements Notification{

    String phoneNumber;

    public WhatsAppNotification(String recipientName, String message, String phoneNumber) {
        super(recipientName, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Phone: "+phoneNumber);
        System.out.println(" Message: "+message);
        System.out.println(" WhatsApp  notification sent successfully ");

    }

    @Override
    public void sendNotification() {
        super.sendNotification();
    }
}
