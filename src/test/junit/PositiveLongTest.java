package test.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import test.junit.basetest.BaseTestCalculatorJUnit;
import test.junit.runner.groups.LogicTests;

@Category(LogicTests.class)
@RunWith(value = Parameterized.class)
public class PositiveLongTest extends BaseTestCalculatorJUnit {
		
		private long a;
		private boolean expected;
	
		public PositiveLongTest(long a, boolean expected) {
			super();
			this.a = a;
			this.expected = expected;
		}
	   
		@Parameterized.Parameters
		public static Collection<Object[]> data() {
	       Object[][] data = new Object[][] { 
               {-9L, false},
               {0, false},
               {1, true} };
	       return Arrays.asList(data); 
	    }

		@Test
	    public void PositiveValueCheck() {
		  boolean result = calculator.isPositive(a);
	      assertEquals ("Invalid result of operation", expected, result);
        }	
	    
}
