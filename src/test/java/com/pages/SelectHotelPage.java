package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotelPage  extends BaseClass {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement dDnRdioButton;

	@FindBy(id="continue")
	private WebElement dDnContinue;

	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement txtslctHotel;

	@FindBy(id="radiobutton_span")
	private WebElement txtContinueError;


	public WebElement getTxtContinueError() {
		return txtContinueError;
	}

	public WebElement getTxtslctHotel() {
		return txtslctHotel;
	}

	public WebElement getdDnRdioButton() {
		return dDnRdioButton;
	}

	public WebElement getdDnContinue() {
		return dDnContinue;
	}
	/**
	 * 
	 */
	public void selectHotel() {

		click(getdDnRdioButton());
		click(getdDnContinue());

	}
	/**
	 * 
	 */
	public void withoutSelectHotel() {

		click(getdDnContinue());

	}



}
