package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class SqrtDoubleTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "sqrtDataProvider")
	    public Object[][] valuesForSqrt() {
	        return new Object[][] {
	                {100.0, 10.0}, 
	                {-100.0, Double.NaN}, 
	                {0.0, 0.0},
	                {0.4, 0.632}, 
	                {0.09, 0.3}, 
	        };
	    }
		
		@Test(dataProvider = "sqrtDataProvider", groups = "trigonometry")
	    public void sqrtFromValue(double a,  double expected) {
	        double result = calculator.sqrt(a);
	        assertEquals(result, expected, 0.001);
	    }	
		
	
}
