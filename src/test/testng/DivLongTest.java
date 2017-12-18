package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class DivLongTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "divDataProvider")
	    public Object[][] valuesForSum() {
	        return new Object[][] {
	                {20, 5, 4.0}, 
	                {-9L, 6L, -1.5D}, // bug: returns long instead double
	                {1, 10, 0.1},     // bug: returns long instead double
	                {0, 10, 0.0}
	        };
	    }
		
		@Test(dataProvider = "divDataProvider", groups = "arithmetic")
	    public void oneValueDivAnother(long a, long b, double expected) {
	        double result = calculator.div(a, b);
	        assertEquals(result, expected, "Invalid result of operation");
	    }
		
		@Test(groups = "arithmetic", expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = ".*Attempt.*")
	    public void checkDivisionByZeroThrowsException() {
	       calculator.div(3L, 0L);
	    }
}
