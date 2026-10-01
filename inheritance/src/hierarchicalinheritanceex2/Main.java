package hierarchicalinheritanceex2;



public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Swathi",21,2101,"cancer",5300);
        p1.bill();
        Person p2 = new Doctor("Dr.Kavya",44,431,"gynecologist",10);

    }
}
