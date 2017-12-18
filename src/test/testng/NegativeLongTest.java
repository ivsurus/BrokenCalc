package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class NegativeLongTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "isNegativeDataProvider")
	    public Object[][] valuesForSum() {
	        return new Object[][] {
	        	   {-9L, true},
	               {0, false},
	               {1, false} };
	    }
		
		@Test(dataProvider = "isNegativeDataProvider", groups = "logic")
	    public void NegativeValueCheck(long a, boolean expected) {
	        boolean result = calculator.isNegative(a);
	        assertEquals(result, expected, "Invalid result of operation");
	    }	
}
