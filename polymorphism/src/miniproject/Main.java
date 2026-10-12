package miniproject;

public class Main {
    public static void main(String[] args) {
        NotificationDetails n1 = new EmailNotification("Likhitha","Interview scheduled","likhitha@gmail.com");
        n1.sendNotification();
        n1.displayDetails();

        NotificationDetails n2 = new EmailNotification("Venkateshwar reddy","You got selected","venky234@gmail.com");
        n2.sendNotification();
        n1.displayDetails();

        NotificationDetails n3 = new SMSNotification("Kavya","Your appointment is confirmed","9232631810");
        n3.sendNotification();
        n3.displayDetails();

        NotificationDetails n4 = new SMSNotification("shiva priya","your recharge going to end soon","8287162728");
        n4.sendNotification();
        n4.displayDetails();

        NotificationDetails n5 = new WhatsAppNotification("Ramya Sri","Your order has been delivered","9826151822");
        n5.sendNotification();
        n5.displayDetails();

        NotificationDetails n6 = new WhatsAppNotification("Reshma","You got selected for interview","8262199192");
        n6.sendNotification();
        n6.displayDetails();
    }

}
