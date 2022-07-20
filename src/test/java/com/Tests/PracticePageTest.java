package com.Tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.apache.logging.log4j.*;

import com.Base.Base;
import com.Page.PracticePage2;

public class PracticePageTest extends Base {

	private static Logger log = LogManager.getLogger(PracticePageTest.class.getName());

	private WebDriver driver;

	@Test
	public void checkBox() throws IOException {

		driver = initializeBrowser();
		log.info("Chrome Browser got Initiated");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		log.info("Navigated to Rahulshetty Academy Practice Page");
		PracticePage2 pg = new PracticePage2(driver);
		log.debug("Clicking on Option 1");
		pg.option1().click();
		log.info("Selected Option 1");
		String selectedOption = pg.optionText().getText();
		log.info("Got Text of the selected Option" + selectedOption);
		Select select = new Select(pg.dropdown());
		pg.dropdown().click();
		log.info("Clicked on Dropdown");
		select.selectByVisibleText(selectedOption);
		log.info("selected " + selectedOption + " from Dropdown");
		log.debug("Entering name in Name box");
		pg.name().sendKeys(selectedOption);
		log.info("Enetered the Name as: "+selectedOption);
		driver.close();

	}

}
