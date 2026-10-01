package hierarchicalinheritanceex2;

public class Doctor extends Person {
    int doctorId;
    String specialization;
    int experience;
    Doctor(String name,int age,int doctorId,String specialization,int experience){
        this.name = name;
        this.age = age;
        this.doctorId= doctorId;
        this.specialization = specialization;
        this.experience = experience;
        System.out.println("Name of the Doctor :"+name);
        System.out.println("Age of the Doctor :"+age);
        System.out.println("Doctor Id :"+doctorId);
        System.out.println("Specialization :"+specialization);
        System.out.println("Experience of the Doctor: "+experience);

    }

}
