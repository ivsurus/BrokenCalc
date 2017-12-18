package test.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test.testng.basetest.BaseTestCalculatorTestNG;

import static org.testng.Assert.*;

public class CtgDoubleTest extends BaseTestCalculatorTestNG {
		
		@DataProvider(name = "ctgDataProvider")
	    public Object[][] valuesForMult() {
	        return new Object[][] {
	                {1, 0.642},    // bug 
	        };
	    }
		
		@Test(dataProvider = "ctgDataProvider", groups = "trigonometry")
	    public void ctgFromValue(double a, double expected) {
			double result = calculator.ctg(a);
	        assertEquals(result, expected, 0.001);
	    }	
}
