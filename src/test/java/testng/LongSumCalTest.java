package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSumCalTest extends BaseTest{

    @Test(dataProvider = "valuesForSumTest")
    public void plusTest(long a, long b, long expectedValue) throws InterruptedException{
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation.");
        Thread.sleep(1000);
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] sumDataProvider() {
        return new Object[][] {
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }
}
