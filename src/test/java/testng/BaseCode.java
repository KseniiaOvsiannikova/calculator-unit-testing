package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public class BaseCode {

    public Calculator calculator;
    Logger logger = Logger.getGlobal();

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.info(String.format("Thread Id is %s", Thread.currentThread().getId()));
    }

}
