package notificationsystems;

public class Main {
    public static void main(String[] args) {
          SMSNotification s = new SMSNotification("likhitha7843@gmail.com");
          s.sendNotification();
          EmailNotification e = new EmailNotification("8296256238");
          e.sendNotification();
    }
}
