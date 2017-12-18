package resources.testng;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;


public class TestRunner {

    @SuppressWarnings("serial")
	public static void main(String[] args) {
        
    	 TestNG testNgInstance = new TestNG();

    //   testNgInstance.addListener(new MySuiteListener());
    //   testNgInstance.addListener(new MyTestListener());

        XmlSuite suite = new XmlSuite();
        suite.setName("All groups TestNG");

        List<String> files = new ArrayList<>();
        files.addAll(new ArrayList<String>() {{
            add("./src/resources/testng/runTestNAll.xml");
        }});
       suite.setSuiteFiles(files);
       suite.setParallel(XmlSuite.ParallelMode.CLASSES);
       suite.setThreadCount(2);


       List<XmlSuite> suites = new ArrayList<>();
       suites.add(suite);
       testNgInstance.setXmlSuites(suites);
       testNgInstance.run();

        
    }
}
