/**
 * Created by user on 17.03.16.
 */
public class FuncTablePrint {
    public static void tablePrint (double a, double b, double h){
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
