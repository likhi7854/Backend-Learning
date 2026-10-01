package hierarchicalinheritanceex1;

public class Doctor  extends Person{
    int doctorId;
    String specialization;
    Doctor(String name,int age,int doctorId,String specialization){
        this.name = name;
        this.age = age;
        this.doctorId= doctorId;
        this.specialization = specialization;
        System.out.println("Name of the Doctor :"+name);
        System.out.println("Age of the Doctor :"+age);
        System.out.println("Doctor Id :"+doctorId);
        System.out.println("Specialization :"+specialization);

    }

}
