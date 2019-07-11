package com.mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectFlight {
	
	public WebDriver driver;

	By departFromAndTo = By.xpath("(//td[@valign='top']//td[@class='title'])[3]");
	By departureDate = By.xpath("(//td[@valign='top']//td[@class='title'])[4]");
	By arrivalFromAndTo = By.xpath("(//td[@valign='top']//td[@class='title'])[7]");
	By arrivalDate = By.xpath("(//td[@valign='top']//td[@class='title'])[8]");

	public SelectFlight(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDepartFromAndTovalue() {
		return driver.findElement(departFromAndTo);
	}
	
	public WebElement getDepartureDate() {
		return driver.findElement(departureDate);
	}
	
	public WebElement getArraivalFromAndTo() {
		return driver.findElement(arrivalFromAndTo);
	}

	
	public WebElement getArrivalDate() {
		return driver.findElement(arrivalDate);
	}


}
