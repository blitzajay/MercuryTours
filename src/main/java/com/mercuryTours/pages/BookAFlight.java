package com.mercuryTours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookAFlight {

	public WebDriver driver;
	
	By passangerFirstName = By.xpath("//input[@name='passFirst0']");
	By passangerLastName = By.xpath("//input[@name='passLast0']");
	By passengerMealSelection = By.xpath("//select[@name='pass.0.meal']");
	By creditCardType = By.xpath("//select[@name='creditCard']");
	By creditCardNumber = By.xpath("//input[@name='creditnumber']");
	By creditCardExpirationMonth = By.xpath("//select[@name='cc_exp_dt_mn']");
	By creditCardExpirationYear = By.xpath("//select[@name='cc_exp_dt_yr']");
	By creditCardFirstname = By.xpath("//input[@name='cc_frst_name']");
	By creditCardMiddleName = By.xpath("//input[@name='cc_mid_name']");
	By creditCardLastName = By.xpath("//input[@name='cc_last_name']");
	By billingAddressLine1 = By.xpath("//input[@name='billAddress1']");
	By billingAddressLine2 = By.xpath("//input[@name='billAddress2']");
	By billingAddressCity = By.xpath("//input[@name='billCity']");
	By billingAddressState = By.xpath("//input[@name='billState']");
	By billingAddressPostalCode = By.xpath("//input[@name='billZip']");
	By billingAddressCountry = By.xpath("//select[@name='billCountry']");
	By billingAddressTicketlessTravel = By.xpath("(//input[@name='ticketLess'])[1]");
	By deliveryAddressLine1 = By.xpath("//input[@name='delAddress1']");
	By deliveryAddressLine2 = By.xpath("//input[@name='delAddress2']");
	By deliveryAddressCity = By.xpath("//input[@name='delCity']");
	By deliveryAddressState = By.xpath("//input[@name='delState']");
	By deliveryAddressPostalCode = By.xpath("//input[@name='delZip']");
	By deliveryAddressCountry = By.xpath("//select[@name='delCountry']");
	By deliveryAddressSameAsBillingAddress = By.xpath("(//input[@name='ticketLess'])[2]");
	By securePurchase = By.xpath("//input[@name='buyFlights']");

	

	public BookAFlight(WebDriver driver) {
		this.driver = driver;
	}

	


}
