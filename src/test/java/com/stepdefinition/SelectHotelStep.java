package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author CHANDIRAN
 * @Description Generates SelectHotelStep
 * @Date 08-July-2022
 *
 */
public class SelectHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 */
	@Then("User should select hotel page")
	public void userShouldSelectHotelPage() {
		pom.getSelectHotelPage().selectHotel();

	}
	/**
	 * 
	 * @param bookAHotel
	 */
	@Then("user should verify after select hotel sucessfully {string}")
	public void userShouldVerifyAfterSelectHotelSucessfully(String bookAHotel) {
		WebElement txtbookingconfirm = pom.getBookHotelPage().getTxtbookAhotel();
		String text = getText(txtbookingconfirm);
		System.out.println(text);
		Assert.assertEquals("verify book a hotel msg", bookAHotel,text);
	}
	/**
	 * 
	 */
	@Then("User should click continue button without select any hotel")
	public void userShouldClickContinueButtonWithoutSelectAnyHotel() {
		pom.getSelectHotelPage().withoutSelectHotel();

	}
	/**
	 * 
	 * @param continueErrMsg
	 */
	@Then("After click continue button, user should verify with error message from select hotel page {string}")
	public void afterClickContinueButtonUserShouldVerifyWithErrorMessageFromSelectHotelPage(String continueErrMsg) {
		pom.getSelectHotelPage().withoutSelectHotel();
		WebElement txtContinueError = pom.getSelectHotelPage().getTxtContinueError();
		String text = getText(txtContinueError);
		System.out.println(text);
		Assert.assertEquals("verify continue error msg", continueErrMsg,text);

	}



}
