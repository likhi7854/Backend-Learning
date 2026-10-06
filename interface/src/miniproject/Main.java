package miniproject;
//5.Smart Transport Fare System
public class Main {
    public static float maxi(float[] total){
        float x=total[0];
        for(int i=0;i<total.length;i++){
            if(total[i]>x){
                x=total[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("--BUS1--");
        Bus bus1=  new Bus("Likhitha",15.5f);
        bus1.displayDetails();
        float t1=bus1.calculateFare();

        System.out.println();

        System.out.println("--BUS2--");
        Bus bus2=  new Bus("Ramya Sri ",9f);
        bus2.displayDetails();
        float t2=bus2.calculateFare();

        System.out.println();

        System.out.println("--CAB1--");
        Cab cab1= new Cab("venkateshwar Reddy",7.5f);
        cab1.displayDetails();
        float c1=cab1.calculateFare();

        System.out.println();

        System.out.println("--CAB2--");
        Cab cab2= new Cab("Vinay Kumar ",20.5f);
        cab2.displayDetails();
        float c2= cab2.calculateFare();
        System.out.println();

        System.out.println("--AUTO1--");
        Auto auto1 = new Auto("Kavya Sri ",6.5f);
        auto1.displayDetails();
        float a1=auto1.calculateFare();
        System.out.println();

        System.out.println("--AUTO1--");
        Auto auto2 = new Auto("Vardhan ",12.5f);
        auto2.displayDetails();
        float a2=auto2.calculateFare();


        float[] total = {t1,t2,a1,a2,c1,c2};
        float highest = maxi(total);
        System.out.println();
        System.out.println("Highest fare : "+highest);
    }
}
