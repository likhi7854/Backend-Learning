package hospitalbillingabstraction;

public class Main {
    public static void main(String[] args) {
         MedicalTest mt = new MedicalTest("Kavya",220,"Bloodtest",2000);
         DoctorConsultation dc = new DoctorConsultation("Venkateshwar Reddy",23,"Likhitha",500);
         mt.calculateBill();
         dc.calculateBill();
    }
}
