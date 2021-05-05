package junit;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorSumTest extends BaseCode {

    @Test
    public void calculateSum() {
        double actualResult = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals("Invalid result of sum operation.", 10.1, actualResult, 0.0);
        logger.info("Test parameters are " + firstNumber + " plus " + secondNumber + "\n" + "Result is " + actualResult);
    }
}
