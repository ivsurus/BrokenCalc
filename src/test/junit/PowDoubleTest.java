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
public class PowDoubleTest extends BaseTestCalculatorJUnit {
		
		private double a;
		private double b;
		private double expected;
	
		public PowDoubleTest(double a, double b, double expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 0.0, 1.435, 0.0}, { 2.0, 5.0, 32.0}, { -2.0, 2.0, 4.0},
	    	   { -2.0, 3.0, -8.0}, {-1.5, 2.0, 2.25}, {-1.5, 2.25, -3.375}, {8.0, 0.25, 1.681} };  //bug
	       return Arrays.asList(data);
	    }

		@Test
	    public void powFromValue() {
	      double result = calculator.pow(a, b);
	      assertEquals("Invalid result of operation", this.expected, result, 0.001);
        }
		  
}
