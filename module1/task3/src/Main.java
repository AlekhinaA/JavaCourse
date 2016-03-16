/**
 * Created by Анастасия on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        task3(Math.PI/4,3,0.1);

    }

    public static void task3 (double a, double b, double h){
        System.out.printf("%8s \t%8s \n","x", "F(x)");
        for (double x = a; x <= b; x += h)
            System.out.printf("%8.4f \t%8.4f \n", x, F(x));
    }

    public static double F(double x){
        if (x % (Math.PI/2) == Math.PI/4)
            return Double.NEGATIVE_INFINITY;
        else if (x % (Math.PI/2) == 3*Math.PI/4)
            return  Double.POSITIVE_INFINITY;
        return Math.tan(2*x)-3;
    }
}
