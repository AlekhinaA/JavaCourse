/**
 * Created by Анастасия on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        double[] doubleArray = {1, 2, 3, 5, 4, 5};
        double max = task4(doubleArray);
        System.out.println(max);

    }

    public static double task4 (double[] array){
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
