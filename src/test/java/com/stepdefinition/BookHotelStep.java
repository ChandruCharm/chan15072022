package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates BookHotelStep
 * @Date 08-July-2022
 *
 */

public class BookHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	/**
	 * 
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param dataTable
	 */
	@Then("User should book hotel {string},{string} and {string}")
	public void userShouldBookHotelAnd(String firstname, String lastname, String address, 
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String,String>> list = dataTable.asMaps();
		Map<String, String> map = list.get(2);
		String ccNo = map.get("ccNum");
		String ccType = map.get("ccType");
		String ccMnth = map.get("expmonth");
		String exYear = map.get("expyear");
		String cvv = map.get("cccvv");
		pom.getBookHotelPage().bookHotel(firstname, lastname, address, ccNo, ccType, ccMnth, exYear, cvv);

	}
	/**
	 * 
	 * @param bkgConfirm
	 */
	@Then("User should verify after book a hotel sucessfully {string}")
	public void userShouldVerifyAfterBookAHotelSucessfully(String bkgConfirm) {

		WebElement txtbookingconfirm = pom.getBookHotelPage().getTxtbookingconfirm();
		String text = getText(txtbookingconfirm);
		System.out.println(text);
		Assert.assertEquals("verify booking confirmation",bkgConfirm,text);

	}
	/**
	 * 
	 */
	@Then("User should book a hotel without select any fields")
	public void userShouldBookAHotelWithoutSelectAnyFields() {

		pom.getBookHotelPage().clickBook();

	}

	/**
	 * 
	 * @param firstNameError
	 * @param lastNameError
	 * @param addressError
	 * @param ccNumberError
	 * @param ccTypeError
	 * @param expiryMonth
	 * @param cvvNumber
	 */
	@Then("After click book now button, User should verify error message from book a hotel page "
			+ "{string},{string},{string},{string},{string},{string},{string}")
	public void afterClickBookNowButtonUserShouldVerifyErrorMessageFromBookAHotelPage(String firstNameError,
			String lastNameError, String addressError, String ccNumberError, String ccTypeError, String expiryMonth, String cvvNumber) {

		WebElement txtFirstName = pom.getBookHotelPage().getTxtFirstName();
		String first = getText(txtFirstName);
		System.out.println(first);
		Assert.assertEquals("verify firstname error",firstNameError,first);

		WebElement txtLastName = pom.getBookHotelPage().getTxtLastName();
		String last = getText(txtLastName);
		System.out.println(last);
		Assert.assertEquals("verify lastname error",lastNameError,last);

		WebElement txtAdress = pom.getBookHotelPage().getTxtAddress();
		String add = getText(txtAdress);
		System.out.println(add);
		Assert.assertEquals("verify address error",addressError,add);

		WebElement txtCcNum = pom.getBookHotelPage().getTxtCCNum();
		String CCN = getText(txtCcNum);
		System.out.println(CCN);
		Assert.assertEquals("verify ccnumber error",ccNumberError,CCN);

		WebElement txtCcType = pom.getBookHotelPage().getTxtCCType();
		String CCType = getText(txtCcType);
		System.out.println(CCType);
		Assert.assertEquals("verify cctype error",ccTypeError,CCType);

		WebElement txtExpMonth = pom.getBookHotelPage().getTxtExpiryMonth();
		String ExpMon = getText(txtExpMonth);
		System.out.println(ExpMon);
		Assert.assertEquals("verify exp month error",expiryMonth,ExpMon);

		WebElement txtCvvNumber = pom.getBookHotelPage().getTxtCVVNum();
		String CVVNum = getText(txtCvvNumber);
		System.out.println(CVVNum);
		Assert.assertEquals("verify cvvnum error",cvvNumber,CVVNum);


	}


}
