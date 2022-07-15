package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.google.auto.common.GeneratedAnnotationSpecs;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author CHANDIRAN
 * @Description Generates SearchHotelSteps
 * @Date 08-July-2022
 *
 */
public class SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param roomNos
	 * @param dateIn
	 * @param dateOut
	 * @param adults
	 * @param child
	 */
	@Then("User should perform search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldPerformSearchHotelAnd(String location, String hotels, String roomType, 
			String roomNos, String dateIn, String dateOut, String adults, String child) {

		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, roomNos, dateIn, dateOut, adults, child);
	}
	/**
	 * 
	 * @param slctHotelMsg
	 */
	@Then("User should verify search hotel sucessfully {string}")
	public void userShouldVerifySearchHotelSucessfully(String slctHotelMsg) { 
		WebElement txtselecthotel = pom.getSelectHotelPage().getTxtslctHotel();
		String text=getText(txtselecthotel);	
		System.out.println(text);
		Assert.assertEquals("verify select hotel msg",text,slctHotelMsg);
	}
	/**
	 * 
	 * @param location
	 * @param roomNos
	 * @param dateIn
	 * @param dateOut
	 * @param adults
	 */
	@Then("User should perform search hotel {string},{string},{string},{string}, and {string}")
	public void userShouldPerformSearchHotelAnd(String location, String roomNos, String dateIn,
			String dateOut, String adults) {  
		pom.getSearchHotelPage().searchHotelMadentory(location, roomNos, dateIn, dateOut, adults);
	}
	/**
	 * 
	 * @param datInMsg
	 * @param dateOutMsg
	 */
	@Then("After searching, User should verify with date error message from search hotel page {string},{string}")
	public void afterSearchingUserShouldVerifyWithDateErrorMessageFromSearchHotelPage(String datInMsg, 
			String dateOutMsg) {
		WebElement txtDateIn = pom.getSearchHotelPage().getTxtDateIn();
		String text = getText(txtDateIn);
		System.out.println(text);
		Assert.assertEquals("verify dateIN error msg", datInMsg,text);

		WebElement txtDateOut = pom.getSearchHotelPage().getTxtDateOut();
		String text2 = getText(txtDateOut);
		System.out.println(text);
		Assert.assertEquals("verify Dateout error msg ",dateOutMsg,text2);
	}
	/**
	 * 
	 */
	@Then("User should perform search hotel")
	public void userShouldPerformSearchHotel() {
		pom.getSearchHotelPage().searchHotelWithoutEntrAnyDetail();
	}
	/**
	 * 
	 * @param locnErrorMsg
	 */
	@Then("After searching, User should verify with location error message from search hotel page {string}")
	public void afterSearchingUserShouldVerifyWithLocationErrorMessageFromSearchHotelPage(String locnErrorMsg) {
		WebElement txtLocation = pom.getSearchHotelPage().getTxtLocation();
		String locationError = getText(txtLocation);
		System.out.println(locationError);
		Assert.assertEquals("verify location error msg",locnErrorMsg,locationError);

	}

}
