package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class SinDoubleTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "sinDataProvider")
	    public Object[][] valuesForMult() {
	        return new Object[][] {
	                {0D, 0D},  
	                {1D, 0.841}, 
	                {100, -0.506}, 
	        };
	    }
		
		@Test(dataProvider = "sinDataProvider", groups = "trigonometry")
	    public void sinFromValue(double a, double expected) {
	        double result = calculator.sin(a);
	        assertEquals(result, expected, 0.001);
	    }	
}
