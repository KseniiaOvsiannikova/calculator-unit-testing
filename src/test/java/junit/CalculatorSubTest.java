package junit;

import org.junit.*;

public class CalculatorSubTest extends BaseCode {

    @Test
    public void calculateSub() {

        double actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals("Invalid result of sub operation.", 3.5, actualResult, 0.0);
        logger.info("Test parameters are " + firstNumber + " minus " + secondNumber + "\n" + "Result is " + actualResult);
    }
}
