package com.mercuryTours.pages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mercuryTours.resources.Base;

public class SelectAFlightTest extends Base {

	SelectFlight selectFlight = new SelectFlight(driver);

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}
	
	@Test
	public void verifyFromAndToCity() {
		FlightFinder finder = new FlightFinder(driver);		
		dropDownSelectByIndex(finder.departingFrom(), generateRandomIndex());
		String departureText = finder.departingFrom().getText();
		dropDownSelectByIndex(finder.arrivingTo(), generateRandomIndex());
		String arrivingText = finder.arrivingTo().getText();
		finder.continueButton().click();
		try {
			Assert.assertEquals(departureText+" to "+arrivingText, selectFlight.getArraivalFromAndTo().getText());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
