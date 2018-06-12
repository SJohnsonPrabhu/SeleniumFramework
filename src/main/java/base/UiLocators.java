package base;

import org.openqa.selenium.By;

public class UiLocators {

	private By locator;
	
	public UiLocators id(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators name(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators className(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators linkText(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators partialLinkText(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators xPath(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators cssSelector(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators tagName(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators all(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators chained(By value) {
		locator = value;
		return this;
	}
	
	public UiLocators idOrName(By value) {
		locator = value;
		return this;
	}
	
	public UiElements makeUiObject() {
		return new UiElements(locator);
	}
	
}
