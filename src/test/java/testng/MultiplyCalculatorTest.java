package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyCalculatorTest extends BaseCode {

    @Test(groups = {"smokeTest"})
    public void Test() {
        long result = calculator.mult(3, 4);
        Assert.assertEquals(result, 12, "Invalid result of multiply operation.");
    }
}
