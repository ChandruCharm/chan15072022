package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates CancelBookingSteps
 * @Date 08-July-2022
 *
 */

public class CancelBookingStep extends BaseClass {

	PageObjectManager pom=new PageObjectManager();
	/**
	 * 	
	 */
	@Then("User should cancel particular order id")
	public void userShouldCancelParticularOrderId() {

		String orderId = pom.getBookingConfirmationPage().getOrderId();
		pom.getCancelBookingPage().getCancelbooking(orderId);
	}
	/**
	 * 
	 * @param canBookMsg
	 */
	@Then("After cancelling, User should successfully cancelled message {string}")
	public void afterCancellingUserShouldSuccessfullyCancelledMessage(String canBookMsg) {

		WebElement cancelBooking = pom.getCancelBookingPage().getTxtCancelBooking();
		String txtCancel = getText(cancelBooking);
		System.out.println(txtCancel);
		Assert.assertEquals("cencel message", canBookMsg,txtCancel);

	}
	/**
	 * 
	 * @param exisOrderId
	 */
	@Then("User should cancel the existing booked order id {string}")
	public void userShouldCancelTheExistingBookedOrderId(String exisOrderId) {
		pom.getCancelBookingPage().existCancelbooking();

	}

}
