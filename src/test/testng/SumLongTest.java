package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class SumLongTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "sumDataProvider")
	    public Object[][] valuesForSum() {
	        return new Object[][] {
	                {20, 15, 35},
	                {9L, 6L, 15L},
	                {1,-10, -9},
	                {0, 0, 0}
	        };
	    }
		
		@Test(dataProvider = "sumDataProvider", groups = "arithmetic")
	    public void oneValuePlusAnother(long a, long b, long expected) {
	        long result = calculator.sum(a, b);
	        assertEquals(result, expected, "Invalid result of operation");
	    }	
}
