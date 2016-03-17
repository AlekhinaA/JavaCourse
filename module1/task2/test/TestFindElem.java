import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by user on 17.03.16.
 */
public class TestFindElem {
    @Test
    public void testFindElem(){
        double eps = 0.01;
       assertTrue( FindElem.findAndPrintMinElem(eps) <= eps);
    }
}
