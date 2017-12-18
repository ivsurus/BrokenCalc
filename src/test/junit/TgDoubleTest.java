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
public class TgDoubleTest extends BaseTestCalculatorJUnit {
		
		private double a;
		private double expected;
	
		public TgDoubleTest(double a, double expected) {
			super();
			this.a = a;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 0.0, 0.0}, { 0.5, 0.546}, { -1.0, -1.557} }; //bug 
	       return Arrays.asList(data);
	    }

		@Test
	    public void tgFromValue() {
	      double result = calculator.tg(a);
	      assertEquals("Invalid result of operation", this.expected, result, 0.001);
        }
		  
}
