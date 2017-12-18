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
public class MultLongTest extends BaseTestCalculatorJUnit {
		
		private long a;
		private long b;
		private long expected;
	
		public MultLongTest(long a, long b, long expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { {2, 5, 10}, 
               {-9L, 6L, -54L},
               {0, Long.MIN_VALUE, 0},
               {0, 0, 0}, };
	       return Arrays.asList(data); 
	    }

		
		@Test
	    public void oneValueMultAnother() {
		  long result = calculator.mult(a, b);
	      assertEquals("Invalid result of operation", this.expected, result, 0);
        }	
	    
}
