package calculatoroverloading;

public class Calculate {
    public static void main(String[] args) {
            int c = calculate(10,20);
            System.out.println(c);
            double d = calculate(20.3,30);
            System.out.println(d);
            int h = calculate(10,20,78);
            System.out.println(h);

    }
    static int calculate(int a,int b){
         return  a+b;
    }

    static double calculate(double a, double b){
            return a+b;
    }

    static int  calculate(int a, int b, int c){
            return a+b+c;
    }

}
