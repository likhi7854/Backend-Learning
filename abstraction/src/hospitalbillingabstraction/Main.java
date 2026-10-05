package hospitalbillingabstraction;

public class Main {
    public static void main(String[] args) {
         MedicalTest mt = new MedicalTest("Kavya",220,"Bloodtest",2000);
         MedicalTest mt1  = new MedicalTest("Shiva Priya",678,"body scanning",10000);
         DoctorConsultation dc = new DoctorConsultation("Venkateshwar Reddy",23,"Dr.Likhitha",500,5000);
         DoctorConsultation dc1 = new DoctorConsultation("Rachana",986,"dr.Koppu Ramya Sri",550,12000);
         mt1.calculateBill();
         dc1.calculateBill();
         mt.calculateBill();
         dc.calculateBill();
    }
}
