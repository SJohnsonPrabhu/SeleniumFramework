package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestPrimer {
	
	public static void runner() {
		TestNG runner = new TestNG();
		List<String> suiteFiles = new ArrayList<String>();
		suiteFiles.add("/home/johnson/eclipse-workspace/SeleniumFramework/src/main/resources/testng.xml");
		runner.setTestSuites(suiteFiles);
		runner.run();
	}
}
