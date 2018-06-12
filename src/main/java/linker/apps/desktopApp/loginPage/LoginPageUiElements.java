package linker.apps.desktopApp.loginPage;

import base.OR;
import base.UiElements;
import base.UiLocators;

public class LoginPageUiElements {
	
	private static UiElements username, password, login;
	
	public UiElements username() {
		if (username == null)
			username = new UiLocators().xPath(OR.username).makeUiObject();
			return username;
	}

	public UiElements password() {
		if (password == null)
			password = new UiLocators().xPath(OR.password).makeUiObject();
			return password;
	}
	
	public UiElements login() {
		if (login == null)
			login = new UiLocators().xPath(OR.login).makeUiObject();
			return login;
	}

}
