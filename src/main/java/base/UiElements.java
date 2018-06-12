package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import linker.controller.Controller;

public class UiElements {

	private By locator;

	UiElements(By locator) {
		this.locator = locator;
	}

	public boolean exists() {
		WebElement element;
		element = Controller.driver.findElement(locator);
		return element.isDisplayed();
	}

	public UiElements click() {
		Controller.driver.findElement(locator).click();
		return this;
	}
	
	public UiElements sendKeys(String value) {
		Controller.driver.findElement(locator).sendKeys(value);
		return this;
	}
	
	public UiElements waitToAppear(int seconds) {
		Timer timer = new Timer();
		timer.start();
		while (!timer.expired(seconds))
			if(exists())
				break;
		if(timer.expired(seconds) && !exists())
			throw new AssertionError("Element "+ locator + " failed to appear within "+ seconds + " seconds");
		return this;
	}
}
