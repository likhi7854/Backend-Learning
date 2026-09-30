//2. Initialize Variables Using Constructor
public class InitializingVariables {
    public static void main(String[] args) {
        Students s = new Students("Likhitha",20);

    }
}
class Students{
    String name ;
    int age;
    Students(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Name of the Student "+name+". \nAge of the student :"+age);
    }

}



