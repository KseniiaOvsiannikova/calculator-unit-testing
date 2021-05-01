package junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;
import java.util.logging.Logger;

public class CalculatorSubTest {
    private Calculator calculator;
    private double firstNumber;
    private double secondNumber;
    Logger logger = Logger.getGlobal();

    @Before
    public void initTest() {
        calculator = new Calculator();
        firstNumber = 6.8;
        secondNumber = 3.3;
    }

    @Test
    public void calculateSub() {
        double actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals("Invalid result of sub operation.", 3.5, actualResult, 0);
        logger.info("Test parameters are "+ firstNumber + " minus " + secondNumber + "\n" + "Result is " + actualResult);
    }

    @After
    public void afterTest() {
        calculator = null;
    }
}
