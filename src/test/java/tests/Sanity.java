package tests;

import org.testng.annotations.Test;

import linker.apps.desktopApp.DesktopApp;
import linker.controller.Controller;

public class Sanity {
	
	private static DesktopApp desktopApp = Controller.app.desktopApp;
	
	@Test (priority=0)
	public void enterTheUsername() {
		desktopApp.loginPage.uiObject.username().sendKeys(Controller.prop.getProperty("username"));
	}
	
	@Test (priority=1)
	public void enterThePassword() {
		desktopApp.loginPage.uiObject.password().sendKeys(Controller.prop.getProperty("password"));
	}

	@Test (priority=2)
	public void clickLogin() {
		desktopApp.loginPage.clickLoginButton();
	}

}
