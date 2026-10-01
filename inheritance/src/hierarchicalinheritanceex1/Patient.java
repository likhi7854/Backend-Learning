package hierarchicalinheritanceex1;

public class Patient extends Person {
    int patientId;
    String disease;
    Patient(String name,int age, int patientId,String disease){
         this.name = name;
         this.age = age;
         this.patientId= patientId;
         this.disease = disease;
        System.out.println("Name of the Patient :"+name);
        System.out.println("Age of the Patient:"+age);
        System.out.println("Patient Id :"+patientId);
        System.out.println("Disease of the Patient :"+disease);
    }
}
