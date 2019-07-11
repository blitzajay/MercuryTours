package com.mercuryTours.pages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mercuryTours.resources.Base;

public class FlightFinderTest extends Base {

	FlightFinder finder = new FlightFinder(driver);

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void chooseFirstClass() throws IOException {
		driver.get(prop.getProperty("url"));
		try {
			finder.firstClass().click();
			Assert.assertTrue(finder.firstClass().isSelected(), "The first class option is chosen");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void chooseOneWay() {
		try {
			finder.flightTypeOneWay().click();
			Assert.assertTrue(finder.flightTypeOneWay().isSelected(), "The One way option is chosen");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void verifyDefaultAirlinePreference() {
		try {
			Assert.assertEquals("No Preference", finder.airline().getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
