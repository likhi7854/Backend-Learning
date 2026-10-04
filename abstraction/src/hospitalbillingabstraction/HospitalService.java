package hospitalbillingabstraction;

public abstract class HospitalService {
    String  patientName;
    int patientId;

    public HospitalService(String patientName, int patientId) {
        this.patientName = patientName;
        this.patientId = patientId;
    }
    abstract void calculateBill();
}
