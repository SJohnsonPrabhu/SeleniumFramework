package executor;

import org.testng.annotations.Test;

import base.managers.DriverManager;
import tests.TestPrimer;

public class Executor {

	@Test
	public void checker() {
		DriverManager.properties();
		DriverManager.createDriver();
		TestPrimer.runner();
	}
	
	
}
