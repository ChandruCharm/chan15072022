package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates BookingConfirmationPage
 * @Date 08-July-2022
 *
 */
public class BookingConfirmationPage extends BaseClass {

	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement dDnOrderNumber;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement clkBookItinerary;

	public WebElement getdDnOrderNumber() {
		return dDnOrderNumber;
	}

	public WebElement getClkBookItinerary() {
		return clkBookItinerary;
	}
	/**
	 * 
	 * @return String
	 */
	public String getOrderId() {

		String attribute = getAttribute(getdDnOrderNumber(),"value");
		return attribute;


	}


}
