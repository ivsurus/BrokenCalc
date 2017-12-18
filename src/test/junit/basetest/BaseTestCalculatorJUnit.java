package test.junit.basetest;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.epam.tat.module4.Calculator;


public class BaseTestCalculatorJUnit {
	  
	protected static Calculator calculator;
	protected long time;
	 
	 @BeforeClass
	 public static void createCalc() {
        calculator = new Calculator();
        System.out.println("A calculator for testing with JUnit was created");
	 }
	 
	 @Before
	 public void showStartTestTime() {
	    System.out.println("A test was started at " + checkTime());
	    this.time = System.nanoTime();
	    
	 }
	 
	 @After
	 public  void showFinishTestTimeAndDuration() {
	    System.out.println("A test was comlited at " + checkTime());
	    System.out.println("A test duration is " + (System.nanoTime() - this.time) + " nanoseconds");
	    
	 }
	 
	 @AfterClass
	 public static void destroyCalc() {
        calculator = null;
        System.out.println("A calculator was destroyed");
	 }
	 
	 protected Date checkTime() {
	        return new Date(System.currentTimeMillis());
	 }
	 
}
