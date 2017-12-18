package test.junit;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import test.junit.basetest.BaseTestCalculatorJUnit;
import test.junit.runner.groups.ArithmeticTests;

@Category(ArithmeticTests.class)
@RunWith(value = Parameterized.class)
public class SumDoubleTest extends BaseTestCalculatorJUnit {
		
		private double a;
		private double b;
		private double expected;
	
		public SumDoubleTest(double a, double b, double expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 20.0, 15.0, 35.0}, { 9D,6D,15D }, {1.0,-10.056, -9.056}, {0.0, 0.0, 0.0} };
	       return Arrays.asList(data);
	    }

		
		@Test
	    public void oneValuePlusAnother() {
	      double result = calculator.sum(a, b);
	      assertEquals("Invalid result of operation", this.expected, result, 0);
        }	
	    
}
