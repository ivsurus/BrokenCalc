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
public class SubLongTest extends BaseTestCalculatorJUnit {
		
		private long a;
		private long b;
		private long expected;
	
		public SubLongTest(long a, long b, long expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { { 15, 20, -5}, { Long.MAX_VALUE, Long.MAX_VALUE, 0}, {1L,-10L, 11}, {0, 0, 0} };
	       return Arrays.asList(data); 
	    }

		
		@Test
	    public void oneValueMinusAnother() {
		  long result = calculator.sub(a, b);
	      assertEquals("Invalid result of operation", this.expected, result, 0);
        }	
	    
}
