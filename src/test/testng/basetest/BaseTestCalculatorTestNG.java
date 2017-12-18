package test.testng.basetest;

import java.util.Date;


import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;


public class BaseTestCalculatorTestNG {
	  
	protected Calculator calculator;
	protected long time;
	 
	 @BeforeClass(alwaysRun = true)
	 public void createCalc() {
        calculator = new Calculator();
        System.out.println("A calculator for testing with TestNG was created");
	 }
	 
	 @BeforeMethod(alwaysRun = true)
	 public void showStartTestTime() {
	    System.out.println("A test was started at " + checkTime());
	    this.time = System.nanoTime();
	    
	 }
	 
	 @AfterMethod(alwaysRun = true)
	 public void showFinishTestTimeAndDuration() {
	    System.out.println("A test was comlited at " + checkTime());
	    System.out.println("A test duration is " + (System.nanoTime() - this.time) + " nanoseconds");
	    
	 }
	 
	 @AfterClass(alwaysRun = true)
	 public void destroyCalc() {
        calculator = null;
        System.out.println("A calculator was destroyed");
	 }
	 
	 protected Date checkTime() {
	        return new Date(System.currentTimeMillis());
	 }
	 
}
