import javax.naming.Name;
//2. Initialize Variables Using Constructor
public class InitializingVariables {
    public static void main(String[] args) {
        Students s = new Students();
        s.name = "Likhitha";
        s.age = 21;
        s.display();
    }
}
class Students{
    String name ;
    int age;
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age  :"+age);
    }

}



