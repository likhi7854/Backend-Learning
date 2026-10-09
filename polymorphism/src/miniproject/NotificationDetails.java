package miniproject;

public class NotificationDetails implements  Notification{

    String recipientName;
    String message;

    public NotificationDetails(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    @Override
    public void sendNotification() {

    }

    void displayDetails(){
        System.out.println("Recipient Name :"+recipientName);
        System.out.println("Message :"+message);
    }

}
