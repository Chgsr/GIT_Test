package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@title ='Search']")
	WebElement Search;

	@FindBy(xpath = "(//input[@value='Google Search'])[1]")
	WebElement Submit;

	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement search() {
		return Search;
	}

	public WebElement submit() {
		return Search;
	}

}
