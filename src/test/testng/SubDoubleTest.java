package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class SubDoubleTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "subDataProvider")
	    public Object[][] valuesForSub() {
	        return new Object[][] {
	                {20.0, 15.0, 5},
	                {-9D, 6D, -15D},
	                {-10.0,-10.0, 0.0},
	                {0.0, 0.0, 0.0},
	                {0.05, 0.651123456, -0.601123456}
	        };
	    }
		
		@Test(dataProvider = "subDataProvider", groups = "arithmetic")
	    public void oneValueMinusAnother(double a, double b, double expected) {
	        double result = calculator.sub(a, b);
	        assertEquals(result, expected, "Invalid result of operation");
	    }	
}
