package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.BaseClass;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates BookHotelPage
 * @Date 08-July-2022
 *
 */
public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement dDnFirstName;

	@FindBy(id="last_name")
	private WebElement dDnLastName;

	@FindBy(id="address")
	private WebElement dDnAddress;

	@FindBy(id="cc_num")
	private WebElement dDnCCNum;

	@FindBy(id="cc_type")
	private WebElement dDnCCtype;

	@FindBy(id="cc_exp_month")
	private WebElement dDnCCExpiryMonth;

	@FindBy(id="cc_exp_year")
	private WebElement dDnCCExpiryYear;

	@FindBy(id="cc_cvv")
	private WebElement dDnCCVNumber;

	@FindBy(id="book_now")
	private WebElement dDnBooknow;

	@FindBy(id="first_name_span")
	private WebElement txtFirstName;

	@FindBy(id="last_name_span")
	private WebElement txtLastName;

	@FindBy(id="address_span")
	private WebElement txtAddress;

	@FindBy(id="cc_num_span")
	private WebElement txtCCNum;

	@FindBy(id="cc_type_span")
	private WebElement txtCCType;

	@FindBy(id="cc_expiry_span")
	private WebElement txtExpiryMonth;

	@FindBy(id="cc_cvv_span")
	private WebElement txtCVVNum;

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtbookingconfirm;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtbookAhotel;

	public WebElement getTxtbookAhotel() {
		return txtbookAhotel;
	}
	public WebElement getTxtbookingconfirm() {
		return txtbookingconfirm;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCCNum() {
		return txtCCNum;
	}
	public WebElement getTxtCCType() {
		return txtCCType;
	}
	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}
	public WebElement getTxtCVVNum() {
		return txtCVVNum;
	}
	public WebElement getdDnFirstName() {
		return dDnFirstName;
	}
	public WebElement getdDnLastName() {
		return dDnLastName;
	}
	public WebElement getdDnAddress() {
		return dDnAddress;
	}
	public WebElement getdDnCCNum() {
		return dDnCCNum;
	}
	public WebElement getdDnCCtype() {
		return dDnCCtype;
	}
	public WebElement getdDnCCExpiryMonth() {
		return dDnCCExpiryMonth;
	}
	public WebElement getdDnCCExpiryYear() {
		return dDnCCExpiryYear;
	}
	public WebElement getdDnCCVNumber() {
		return dDnCCVNumber;
	}
	public WebElement getdDnBooknow() {
		return dDnBooknow;
	}

	/**
	 * 
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param ccnum
	 * @param cctype
	 * @param expmonth
	 * @param expyear
	 * @param ccvnum
	 */
	public void bookHotel(String firstname,String lastname,
			String address,String ccnum,String cctype,
			String expmonth,String expyear,String ccvnum) {
		sendkeys(getdDnFirstName(), firstname);
		sendkeys(getdDnLastName(), lastname);
		sendkeys(getdDnAddress(), address);
		sendkeys(getdDnCCNum(), ccnum);
		selectOptionByText(getdDnCCtype(), cctype);
		selectOptionByText(getdDnCCExpiryMonth(), expmonth);
		selectOptionByText(getdDnCCExpiryYear(), expyear);
		sendkeys(getdDnCCVNumber(), ccvnum);
		click(getdDnBooknow());
	}

	/**
	 * 
	 */
	public void clickBook() {

		click(getdDnBooknow());
	}





}
