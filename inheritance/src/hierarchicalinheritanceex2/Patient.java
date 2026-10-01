package hierarchicalinheritanceex2;

public class Patient extends Person{
    int patientId;
    String disease;
    double billAmount;
    Patient(String name,int age, int patientId,String disease,double billAmount){
        this.name = name;
        this.age = age;
        this.patientId= patientId;
        this.disease = disease;
        this.billAmount = billAmount;
        System.out.println("Name of the Patient :"+name);
        System.out.println("Age of the Patient:"+age);
        System.out.println("Patient Id :"+patientId);
        System.out.println("Disease of the Patient :"+disease);
    }
    void bill(){
        if(billAmount>=5000){
            System.out.println("Total Bill of the Patient  before Discount :"+billAmount);
            double dicount = (billAmount)*10/100;
            billAmount-=dicount;
            System.out.println("Total Bill of the Patient after discount :"+billAmount);

        }
        else{
            System.out.println("Total Bill of the Patient :"+billAmount);
        }
    }
}
