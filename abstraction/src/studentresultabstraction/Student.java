package studentresultabstraction;

public abstract class Student {
    String name;
    int rollNo;
    abstract void calculateResult();
    Student(String name,int rollNo){
        this.rollNo=rollNo;
        this.name = name;
    }
}
