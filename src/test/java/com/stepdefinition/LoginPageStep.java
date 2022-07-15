package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author CHANDIRAN
 * @Description Generates LoginPageStep
 * @Date 08-July-2022
 *
 */
public class LoginPageStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @throws IOException
	 */
	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage() throws IOException {

		
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws IOException
	 */
	@When("User should perform login {string} and {string}")
	public void userShouldPerformLoginAnd(String username, String password) throws IOException {
		pom.getLoginpage().loginPage(username, password);
	}
	/**
	 * 
	 * @param username
	 * @param password
	 */
	@When("User should perform login {string} and {string} with enter key")
	public void userShouldPerformLoginAndWithEnterKey(String username, String password) {
		pom.getLoginpage().loginPage(username, password);

	}
	/**
	 * 
	 * @param errMsg
	 */
	@Then("User should verify after login error message contains {string}")
	public void userShouldVerifyAfterLoginErrorMessageContains(String errMsg) {

		WebElement txtLogin = pom.getLoginpage().getTxtLogin();
		String text = getText(txtLogin);
		System.out.println(text);
		boolean contains = text.contains(errMsg);
		Assert.assertTrue("verify after longin error msg",contains);
	}
}
