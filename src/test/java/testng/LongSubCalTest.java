package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSubCalTest extends BaseTest{

    @Test(dataProvider = "valuesForSubTest")
    public void minusTest(long a, long b, long expectedValue) throws InterruptedException{
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation.");
        Thread.sleep(1000);
    }

    @DataProvider (name = "valuesForSubTest")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {10, 3, 7},
                {1, -1, 2},
                {0, 0, 0},
                {-5, 3, -8}
        };
    }
}
