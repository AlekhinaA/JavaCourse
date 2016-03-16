/**
 * Created by Анастасия on 14.03.2016.
 */
public class Main {

    public static void main(String[] args) {
        task2(0.1);
    }

    public static void task2 (double eps){
        if (eps <= 0){
            System.out.println("a_n is always greater than zero");
            return;
        }
        int i = 1;
        double a = nextElement(i);

        for (i = 2; a >= eps; i++){
            System.out.println("a_" + (i - 1) + " = " + a);
            a = nextElement(i);
        }
        System.out.println("First appropriate element: " + a + " index i = " + (i - 1));
    }

    public static double nextElement (int n){
        return 1.0 / Math.pow(n + 1, 2);
    }

}

