package notificationsystems;

public class SMSNotification implements  Notification{

    String phoneNumber;
    SMSNotification(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void sendNotification(){
        System.out.println("SMS notification sent to: "+this.phoneNumber);
    }
}
