package test.testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;


public class MySuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
       suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.CLASSES);
       suite.getXmlSuite().setThreadCount(8);
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
