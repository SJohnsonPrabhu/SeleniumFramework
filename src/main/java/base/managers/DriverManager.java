package base.managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import linker.controller.Controller;
import utils.TestUtils;

public class DriverManager {

	public static void properties() {
		try {
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/resources/Config.properties");
			Controller.prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/johnson/Documents/Selenium/libs/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setBinary(Controller.prop.getProperty("desktopAppPath"));
		ChromeDriverService chromeServices = new ChromeDriverService.Builder().build();
		Controller.driver = new ChromeDriver(chromeServices, options);
		Controller.driver.manage().timeouts().implicitlyWait(TestUtils.timeUnit, TimeUnit.SECONDS);
	}

}
