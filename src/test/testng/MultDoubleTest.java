package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class MultDoubleTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "multDataProvider")
	    public Object[][] valuesForMult() {
	        return new Object[][] {
	                {2.5, 5.7, 14.25}, //bug
	                {-9D, 6D, -54D},
	                {0.0, 4D, 0.0},
	                {0.7, 0.5, 0.35},  //bug 
	            
	        };
	    }
		
		@Test(dataProvider = "multDataProvider", groups = "arithmetic")
	    public void oneValueMultAnother(double a, double b, double expected) {
	        double result = calculator.mult(a, b);
	        assertEquals(result, expected);
	    }	
}
