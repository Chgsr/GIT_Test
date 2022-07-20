package com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public  WebDriver driver;
	
	public  WebDriver initializeBrowser() throws IOException
	{

		String basePath = System.getProperty("user.dir");
		Properties pr = new Properties();
		FileInputStream FIS = new FileInputStream(basePath+"\\Data.properties");
		pr.load(FIS);
		String browser = pr.getProperty("browser");
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", basePath+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		return driver;
	}

}
