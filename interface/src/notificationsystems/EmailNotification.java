package notificationsystems;

public class EmailNotification implements  Notification {
    String email;
    EmailNotification(String email){
        this.email = email;
    }
    @Override
    public void sendNotification(){
            System.out.println("Email notification sent to: "+email);
    }


}
