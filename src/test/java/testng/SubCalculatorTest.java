package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalculatorTest extends BaseTest{

    @Test(dataProvider = "valuesForSubTest", groups = {"functionalTest", "smokeTest"})
    public void minusTest(long firstValue, long secondValue, long expectedValue) {
        long actualResult = calculator.sub(firstValue, secondValue);
        Assert.assertEquals(actualResult, expectedValue, "Invalid result of sub operation.");
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
