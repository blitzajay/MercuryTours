package com.mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightFinder {

	public WebDriver driver;

	By flightTypeRoundTrip = By.xpath("//input[@value='roundtrip']");
	By flightTypeOneWay = By.xpath("//input[@value='oneway']");
	By passangersSelect = By.xpath("//select[@name='passCount']");
	By departingFrom = By.xpath("//select[@name='fromPort']");
	By departingMonth = By.xpath("//select[@name='fromMonth']");
	By departingDay = By.xpath("//select[@name='fromDay']");
	By arrivingTo = By.xpath("//select[@name='toPort']");
	By arrivingMonth = By.xpath("//select[@name='toMonth']");
	By arrivingDay = By.xpath("//select[@name='toDay']");
	By economyClass = By.xpath("//input[@value='Coach']");
	By businessClass = By.xpath("//input[@value='Business']");
	By firstClass = By.xpath("//input[@value='First']");
	By airline = By.xpath("//select[@name='airline']");
	By continueButton = By.xpath("//input[@name='findFlights']");

	public FlightFinder(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement flightTypeRoundTrip() {
		return driver.findElement(flightTypeRoundTrip);
	}

	public WebElement flightTypeOneWay() {
		return driver.findElement(flightTypeOneWay);
	}

	public WebElement passangersSelect() {
		return driver.findElement(passangersSelect);
	}

	public WebElement departingFrom() {
		return driver.findElement(departingFrom);
	}

	public WebElement departingMonth() {
		return driver.findElement(departingMonth);
	}

	public WebElement departingDay() {
		return driver.findElement(departingDay);
	}
	
	public WebElement arrivingTo() {
		return driver.findElement(arrivingTo);
	}
	
	public WebElement arrivingMonth() {
		return driver.findElement(arrivingMonth);
	}
	
	public WebElement arrivingDay() {
		return driver.findElement(arrivingDay);
	}

	public WebElement economyCLass() {
		return driver.findElement(economyClass);
	}

	public WebElement businessClass() {
		return driver.findElement(businessClass);
	}

	public WebElement firstClass() {
		return driver.findElement(firstClass);
	}

	public WebElement airline() {
		return driver.findElement(airline);
	}

	public WebElement continueButton() {
		return driver.findElement(continueButton);
	}

}
