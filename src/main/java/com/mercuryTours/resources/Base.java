package com.mercuryTours.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/com/mercuryTours/resources/data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/ajaykumar/Desktop/chromedriver");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			// IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}


	public void dropDownSelectByIndex(WebElement dropdownBox, int indexNumber) {
		Select dropdown = new Select(dropdownBox);
		try {
			dropdown.selectByIndex(indexNumber);
		} catch (Exception e) {
			System.out.println("Choose a valid index");
		}
	}

	public void dropDownSelectByValue(WebElement dropDownBox, String value) {
		Select dropDown = new Select(dropDownBox);
		try {
			dropDown.selectByValue(value);
		} catch (Exception e) {
			System.out.println("Choose a valid index");
		}
	}

	public void dropDownSelectByVisibleText(WebElement dropDownBox, String value) {
		Select dropDown = new Select(dropDownBox);
		try {
			dropDown.selectByValue(value);
		} catch (Exception e) {
			System.out.println("Enter a valid test");
		}

	}
	
	public int generateRandomIndex() {
		int number = (int)(Math.random()*10);
		return number;
	}
}
