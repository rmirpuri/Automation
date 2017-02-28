package org.loblaw.project.lib;

import org.openqa.selenium.WebElement;

public class Interactions {

	public void interact_with(String data) {
		// go through the data

		// data.each { |key, value| process(key, value) }
		// browser.send_keys :tab

	}

	public void interactWithKeyable() {
		// when user peresses enter key
	}

	public void interactWithClickable(WebElement element) {
		// when users performs click operarion on button
		element.click();
	}

	public void interactWithCheckBoxIfSelected(WebElement element) {
		// if ( !driver.findElement(By.id("idOfTheElement")).isSelected() )
		// {
		// driver.findElement(By.id("idOfTheElement")).click();
		// }
	}

	public void interactWithRadioButton(WebElement element) {

	}

	public void interactWithSelectList(WebElement element) {

	}

	public void interactWithText(WebElement element) {

	}

	public void scrollUpAndDownOnPage(WebElement element) {
		// execute javascript
		// browser.execute_script('arguments[0].scrollIntoView();', element)
	}

}
