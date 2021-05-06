package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalculatorTest extends BaseCode {

    @Test(dataProvider = "valuesForSumTest", groups = {"functionalTest"})
    public void plusTest(long firstValue, long secondValue, long expectedValue) {
        long actualResult = calculator.sum(firstValue, secondValue);
        Assert.assertEquals(actualResult, expectedValue, "Invalid result of sum operation.");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }
}
