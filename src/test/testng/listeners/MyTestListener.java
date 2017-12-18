package test.testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyTestListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method started: " + method.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("method finished [" + testResult.getStatus() + "]: " + method.getTestMethod().getMethodName() + "\n");
    }
}
