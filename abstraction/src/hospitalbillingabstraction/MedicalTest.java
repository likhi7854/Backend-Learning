package hospitalbillingabstraction;

public class MedicalTest extends HospitalService {
    String testName;
    double testCost;
    double finalBill;
    double discount;

    public MedicalTest(String patientName, int patientId, String testName, double testCost) {
        super(patientName, patientId);
        this.testName = testName;
        this.testCost = testCost;
    }
    @Override
    void calculateBill(){
          if(testCost>=5000){
              System.out.println("10% discount will apply");
              discount = testCost*10/100;
          }
          else{
              System.out.println("No discount is applied");
              discount = 0;
          }
            finalBill = testCost-discount;
            System.out.println("Patient Name : " + patientName);
            System.out.println("Patient ID   : " + patientId);
            System.out.println("Test Name  : " +testName );
            System.out.println("Original Fee : " + testCost);
            System.out.println("Discount     : " + discount);
            System.out.println("Final Bill   : " + finalBill);
    }
}
