package resources.junit;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

import test.junit.CosDoubleTest;
import test.junit.DivDoubleTest;
import test.junit.MultLongTest;
import test.junit.PositiveLongTest;
import test.junit.PowDoubleTest;
import test.junit.SubLongTest;
import test.junit.SumDoubleTest;
import test.junit.TgDoubleTest;

public class RunTestClassesParallel {
		@SuppressWarnings("rawtypes")
		@Test
	    public void test() {
	
	        Class[] cls = { CosDoubleTest.class,
	        		DivDoubleTest.class,
	        		MultLongTest.class,
	        		PositiveLongTest.class,
	        		SubLongTest.class,
	        		SumDoubleTest.class,
	        		TgDoubleTest.class,
	        		PowDoubleTest.class };
	        // Parallel among classes
	        JUnitCore.runClasses(ParallelComputer.classes(), cls);
	    }
}
;