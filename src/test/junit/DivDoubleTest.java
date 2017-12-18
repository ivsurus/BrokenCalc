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
public class DivDoubleTest extends BaseTestCalculatorJUnit {
		
		private double a;
		private double b;
		private double expected;
	
		public DivDoubleTest(double a, double b, double expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 20.0, 5.0, 4.0}, { 9D, - 6D, - 1.5D }, {1.0,-10.0, -.1}};
	       return Arrays.asList(data);
	    }

		@Test
	    public void oneValueDivAnother() {
	      double result = calculator.div(a, b);
	      assertEquals("Invalid result of operation", this.expected, result, 0);
        }
		
		@Test
	    public void positiveValueDivByZeroReturnsPositiveInfinity() {
	      double result = calculator.div(1.0, 0.0);
	      assertEquals("Invalid result of operation", Double.POSITIVE_INFINITY, result, 0);
        }
		
		@Test
	    public void negativeValueDivByZeroReturnsNegativeInfinity() {
	      double result = calculator.div(-0.1, 0.0);
	      assertEquals("Invalid result of operation", Double.NEGATIVE_INFINITY, result, 0);
        }
		
		@Test
	    public void zeroDivByZeroReturnsNaN() {
	      double result = calculator.div(0.0, 0.0);
	      assertEquals("Invalid result of operation", Double.NaN, result, 0);
        }
	    
}
