/**
 * Created by user on 17.03.16.
 */
public class MaxSum {
    public static double calcMaxSum (double[] array){
        if (array.length % 2 != 0) {
            System.out.println("Odd length of array");
            return 0;
        }
        double max = array[0] + array[array.length-1];
        for(int i = 1; i < array.length/2; i++){
            if (array[i] + array[array.length - 1 - i] > max)
                max = array[i] + array[array.length - 1 - i];
        }
        return max;
    }
}
