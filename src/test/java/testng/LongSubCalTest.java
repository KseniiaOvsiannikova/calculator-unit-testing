package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongSubCalTest extends BaseTest{

    @Test
    public void twoMinusOneLongTest() {
        long expected = calculator.sub(2,1);
        Assert.assertEquals(expected, 1, "Invalid result of sub operation.");
    }

}
