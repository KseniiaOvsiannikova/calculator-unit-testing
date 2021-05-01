package junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.logging.Logger;

public class CalculatorSumTest {

    private Calculator calculator;
    private double firstNumber;
    private double secondNumber;
    Logger logger = Logger.getGlobal();

    @Before
    public void initTest() {
        calculator = new Calculator();
        firstNumber = 10;
        secondNumber = 0;
    }

    @Test
    public void calculateSum() {
        double actualResult = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals("Invalid result of sum operation.", 10.0, actualResult,0);
        logger.info("Test parameters are "+ firstNumber + " plus " + secondNumber + "\n" + "Result is " + actualResult);
    }

    @After
    public void afterTest() {
        calculator = null;
    }
}
