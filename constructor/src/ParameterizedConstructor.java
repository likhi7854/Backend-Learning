public class ParameterizedConstructor {
    public static void main(String[] args) {
        Patient p = new Patient(101,"Likhitha",21);
    }
}
class Patient{
    int patientId;
    String patientName;
    int age;
    Patient(int patientId,String patientName,int age){
        this.patientId=patientId;
        this.patientName= patientName;
        this.age = age;
        System.out.println("patient Id :"+patientId);
        System.out.println("Patient name: "+patientName);
        System.out.println("Age :"+age);
    }
}
