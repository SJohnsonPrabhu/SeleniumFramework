package linker.apps.desktopApp.loginPage;

import org.openqa.selenium.NoSuchElementException;

public class LoginPage {
	
	public LoginPageUiElements uiObject = new LoginPageUiElements();
	
	public void clickUsernameTextbox() {
		try {
		uiObject.username().click();
		}catch(NoSuchElementException e) {
			throw new AssertionError("Username field is not available to click");
		}
	}

	public void clickPasswordTextbox() {
		try {
		uiObject.password().click();
		}catch(NoSuchElementException e) {
			throw new AssertionError("Password field is not available to click");
		}
	}
	
	public void clickLoginButton() {
		try {
		uiObject.login().click();
		}catch(NoSuchElementException e) {
			throw new AssertionError("Login button is not available to click");
		}
	}
}
