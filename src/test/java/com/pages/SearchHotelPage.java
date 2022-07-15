package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.BaseClass;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates HooksClass
 * @Date 08-July-2022
 *
 */
public class SearchHotelPage  extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement dDnLocation;

	@FindBy(id="hotels")
	private WebElement dDnHotel;

	@FindBy(id="room_type")
	private WebElement dDnRoomType;

	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;

	@FindBy(name="datepick_in")
	private WebElement dDnDateCheckIn;

	@FindBy(name="datepick_out")
	private WebElement dDnDateCheckOut;

	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;

	@FindBy(id="child_room")
	private WebElement dDnChildRoom;

	@FindBy(id="Submit")
	private WebElement dDnSubmit;

	@FindBy(id="location_span")
	private WebElement txtLocation;

	@FindBy(id="checkin_span")
	private WebElement txtDateIn;

	@FindBy(id="checkout_span")
	private WebElement txtDateOut;

	@FindBy(name="username_show")
	private WebElement textWelcomeMsg;

	public WebElement getTxtDateIn() {
		return txtDateIn;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getTxtwelcomemsg() {
		return textWelcomeMsg;
	}

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getdDnDateCheckIn() {
		return dDnDateCheckIn;
	}

	public WebElement getdDnDateCheckOut() {
		return dDnDateCheckOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getdDnSubmit() {
		return dDnSubmit;
	}
	/**
	 * 
	 * @param location
	 * @param hotel
	 * @param roomtype
	 * @param roomnos
	 * @param datecheckin
	 * @param datecheckout
	 * @param adultroom
	 * @param childroom
	 */
	public void searchHotel(String location,String hotel,String roomtype,
			String roomnos,String datecheckin,String datecheckout,
			String adultroom,String childroom) {
		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotel(), hotel);
		selectOptionByText(getdDnRoomType(), roomtype);
		selectOptionByText(getdDnRoomNos(), roomnos);
		clear(getdDnDateCheckIn());
		sendkeys(getdDnDateCheckIn(), datecheckin);
		clear(getdDnDateCheckOut());
		sendkeys(getdDnDateCheckOut(), datecheckout);
		selectOptionByText(getdDnAdultRoom(), adultroom);
		selectOptionByText(getdDnChildRoom(), childroom);
		click(getdDnSubmit());
	}
	/**
	 * 
	 * @param location
	 * @param roomnos
	 * @param datecheckin
	 * @param datecheckout
	 * @param adultroom
	 */
	public void searchHotelMadentory(String location,
			String roomnos,String datecheckin,String datecheckout,
			String adultroom) {
		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnRoomNos(), roomnos);
		sendkeys(getdDnDateCheckIn(), datecheckin);
		sendkeys(getdDnDateCheckOut(), datecheckout);
		selectOptionByText(getdDnAdultRoom(), adultroom);
		click(getdDnSubmit());
	}
	/**
	 * 
	 */
	public void searchHotelWithoutEntrAnyDetail() {

		click(getdDnSubmit());
	}


}
