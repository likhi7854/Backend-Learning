package hospitalbillingabstraction;

public class DoctorConsultation extends HospitalService{
    String doctorName;
    double consultationFee;
    double finalBill;
    double discount;
    public DoctorConsultation(String patientName, int patientId, String doctorName, double consultationFee) {
        super(patientName, patientId);
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }
    @Override
    void calculateBill(){
            if(consultationFee>=2000){
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
