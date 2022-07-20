package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage2 {

	private WebDriver driver;

	By option1 = By.id("checkBoxOption1");
	By option2 = By.id("checkBoxOption2");
	By option3 = By.id("checkBoxOption3");
	By dropdown = By.id("dropdown-class-example");
	By optionText = By.xpath("//*[@id='checkbox-example']/fieldset/label[1]");
	By name = By.id("name");
	
	public PracticePage2(WebDriver driver) {
		this.driver= driver;
	}

	public WebElement option1() {

		return driver.findElement(option1);
	}

	public WebElement option2() {

		return driver.findElement(option2);
	}

	public WebElement option3() {

		return driver.findElement(option3);
	}

	public WebElement dropdown() {

		return driver.findElement(dropdown);
	}
	public WebElement optionText() {

		return driver.findElement(optionText);
	}
	public WebElement name() {

		return driver.findElement(name);
	}

}
