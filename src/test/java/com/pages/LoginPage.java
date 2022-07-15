package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;



public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//div[@class ='auth_error']")
	private WebElement txtLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void loginPage(String username, String password) {

		sendkeys(getTxtUsername(), username);
		sendkeys(getTxtPassword(), password);
		click(getBtnLogin());
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnter(String username, String password) throws AWTException {

		sendkeys(getTxtUsername(), username);
		sendkeys(getTxtPassword(), password);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}


}
