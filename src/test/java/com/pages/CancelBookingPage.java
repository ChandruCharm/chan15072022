package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates CancelBookingPage
 * @Date 08-July-2022
 *
 */
public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name="ids[]")
	private WebElement slctBooking;

	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement cancelBooking;

	@FindBy(id="search_result_error")
	private WebElement txtCancelBooking;


	@FindBy(id="order_id_text")
	private WebElement txtOrderId;

	@FindBy(id="search_hotel_id")
	private WebElement goselect;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clkBookItinerary;



	public WebElement getClkBookItinerary() {
		return clkBookItinerary;
	}

	public WebElement getGoselect() {
		return goselect;
	}

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}

	public WebElement getSlctBooking() {
		return slctBooking;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}

	public WebElement getTxtCancelBooking() {
		return txtCancelBooking;
	}

	/**
	 * 
	 * @param orderId
	 */
	public void getCancelbooking(String orderId) {
		click(getClkBookItinerary());
		sendkeys(getTxtOrderId(), orderId);
		click(getGoselect());
		click(getSlctBooking());
		click(getCancelBooking());
		alertAccept();	
	}

	/**
	 * 
	 */

	public void existCancelbooking() {
		click(getClkBookItinerary());
		click(getSlctBooking());
		click(getCancelBooking());
		alertAccept();
	}

}





















