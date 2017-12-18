package test.junit;


import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import test.junit.basetest.BaseTestCalculatorJUnit;
import test.junit.runner.groups.TrigonometryTests;

@Category(TrigonometryTests.class)
@RunWith(value = Parameterized.class)
public class CosDoubleTest extends BaseTestCalculatorJUnit {
		
		private double a;
		private double expected;
	
		public CosDoubleTest(double a, double expected) {
			super();
			this.a = a;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 0.0, 1.0}, { 1.0, 0.540}, { -1.0, 0.540} }; // bug 
	       return Arrays.asList(data);
	    }

		@Test
	    public void cosFromValue() {
	      double result = calculator.cos(a);
	      assertEquals("Invalid result of operation", this.expected, result, 0.001);
        }
		  
}
