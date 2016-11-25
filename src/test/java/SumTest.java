import org.junit.Assert;
import org.junit.Test;

import pl.coi.gov.Calc;

public class SumTest {


    @Test
    public void test() {
        Calc c = new Calc();
        c.add(1,2);
        Assert.assertTrue(true);
    }

    @Test
    public void test3() {
        Calc c = new Calc();
        c.add(3,2);
        Assert.assertTrue(true);
    }

    @Test
    public void test1() {
        Calc c = new Calc();
        c.sub(1,2);
        Assert.assertTrue(true);
    }

}
