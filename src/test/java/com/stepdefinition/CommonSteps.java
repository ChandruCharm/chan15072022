package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author CHANDIRAN
 * @Description Generates CommonSteps
 * @Date 08-July-2022
 *
 */
public class CommonSteps extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 *    
	 * @param welcome
	 */
	@Then("User should verify after login sucessfully {string}")
	public void userShouldVerifyAfterLoginSucessfully(String welcome) {

		WebElement txtwelcomemsg = pom.getSearchHotelPage().getTxtwelcomemsg();
		String getattribute = getattribute(txtwelcomemsg);
		Assert.assertEquals("verify after longin succes msg", welcome,getattribute);
		System.out.println(getattribute);
	}

}
