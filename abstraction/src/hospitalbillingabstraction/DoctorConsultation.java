package hospitalbillingabstraction;

public class DoctorConsultation extends HospitalService{
    String doctorName;
    double consultationFee;
    double bill;
    double finalBill;
    double discount;
    public DoctorConsultation(String patientName, int patientId, String doctorName, double consultationFee,double bill) {
        super(patientName, patientId);
        this.doctorName = doctorName;
        this.bill = bill;
        this.consultationFee = consultationFee;
    }
    @Override
    void calculateBill(){
            if(bill>=2000){
                System.out.println("10% discount will apply");
                discount = consultationFee*10/100;
            }
            else{
                System.out.println("No discount :");
                discount=0;
            }
            finalBill= consultationFee-discount;
            System.out.println("Patient Name : " + patientName);
            System.out.println("Patient ID   : " + patientId);
            System.out.println("Doctor Name  : " + doctorName);
            System.out.println("Original Fee : " + consultationFee);
            System.out.println("Discount     : " + discount);
            System.out.println("Final Bill   : " + finalBill);
     }
}
