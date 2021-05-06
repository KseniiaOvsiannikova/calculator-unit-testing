package junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

import java.util.logging.Logger;

public class BaseCode {

    public Calculator calculator;
    public double firstNumber;
    public double secondNumber;
    Logger logger = Logger.getGlobal();

    @Before
    public void initTest() {
        calculator = new Calculator();
        firstNumber = 6.8;
        secondNumber = 3.3;
    }

    @After
    public void afterTest() {
        calculator = null;
    }
}
