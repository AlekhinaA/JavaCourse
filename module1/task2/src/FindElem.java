/**
 * Created by user on 17.03.16.
 */
public class FindElem {
    public static double findAndPrintMinElem (double eps){
        if (eps <= 0){
            System.out.println("a_n is always greater than zero");
            return 0;
        }
        int i = 1;
        double a = nextElement(i);

        for (i = 2; a >= eps; i++){
            System.out.println("a_" + (i - 1) + " = " + a);
            a = nextElement(i);
        }
        System.out.println("First appropriate element: " + a + " index i = " + (i - 1));
        return a;
    }

    public static double nextElement (int n){
        return 1.0 / Math.pow(n + 1, 2);
    }


}
