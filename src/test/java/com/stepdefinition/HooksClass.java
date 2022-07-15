package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates HooksClass
 * @Date 08-July-2022
 *
 */
public class HooksClass extends BaseClass {
	/**
	 * 
	 */
	@Before
	public void beforeScenario() {

		getdriver("chrome");
		launchUrl("http://adactinhotelapp.com/");
		maximize();
		implicitwait(30);
	}
	/**
	 * 
	 * @param sc
	 */
	@After
	public void afterScenario(Scenario sc) {
		if (!sc.isFailed()) {
			TakesScreenshot screenshot =(TakesScreenshot)driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "Every Scenario");
		}
		quit();

	}

}
