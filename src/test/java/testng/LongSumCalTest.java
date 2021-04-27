package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongSumCalTest extends BaseTest{

    @Test
    public void onePlusTwoLongTest() {
        long expected = calculator.sum(1,2);
        Assert.assertEquals(expected, 3, "Invalid result of sum operation.");
    }

}
