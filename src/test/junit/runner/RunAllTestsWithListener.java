package test.junit.runner;

import org.junit.runner.JUnitCore;

import test.junit.CosDoubleTest;
import test.junit.DivDoubleTest;
import test.junit.MultLongTest;
import test.junit.PositiveLongTest;
import test.junit.PowDoubleTest;
import test.junit.SubLongTest;
import test.junit.SumDoubleTest;
import test.junit.TgDoubleTest;
import test.junit.listener.JUnitExecutionListener;


public class RunAllTestsWithListener {
 
    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new JUnitExecutionListener());
        core.run(CosDoubleTest.class,
        		DivDoubleTest.class,
        		MultLongTest.class,
        		PositiveLongTest.class,
        		SubLongTest.class,
        		SumDoubleTest.class,
        		TgDoubleTest.class,
        		PowDoubleTest.class);
    }
}
