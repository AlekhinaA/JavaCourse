import org.junit.Test;

/**
 * Created by user on 17.03.16.
 */
public class TestMaxSum {
    @Test
    public void testMaxSum(){
        double[] doubleArray = {1, 2, 3, 5, 4, 5};
        double max = MaxSum.calcMaxSum(doubleArray);
        System.out.println("Максимальная сумма пары элементов массива: "+max);
    }

}
