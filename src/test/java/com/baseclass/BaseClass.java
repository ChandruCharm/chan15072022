package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author CHANDIRAN
 * @Description Generates BaseClass
 * @Date 08-July-2022
 *
 */
public class BaseClass {
	
	/**
	 * 
	 */
	public static WebDriver driver;
	
	/**
	 * 
	 */
	public static void launchDriver() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	/**
	 * 
	 */
	public static void maximize() {
		driver.manage().window().maximize();

	}
	/**
	 * 
	 * @param attributevalue
	 * @return WebElement
	 */
	public static WebElement findById(String attributevalue) {
		WebElement element = driver.findElement(By.id("attribute value"));
		return element;
	}
/**
 * 
 * @param url
 */
	public static void launchUrl(String url) {
		driver.get(url);
	}
/**
 * 
 * @return String
 */
	public static String toGetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
/**
 * 
 * @return String
 */
	public static String tile() {
		String title = driver.getTitle();
		return title;
	}
/**
 * 
 * @param attributevalue
 * @return WebElement
 */
	public static WebElement id(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}
/**
 * 
 * @param attributevalue
 * @return WebElement
 */
	public static WebElement name(String attributevalue) {
		WebElement element = driver.findElement(By.name("attributevalue"));
		return element;
	}

/**
 * 
 * @param element
 * @param data
 */

	public static void type1(WebElement element, String data) {
		element.sendKeys(data);
	}
/**
 * 
 * @param attributevalue
 * @return WebElement
 */
	public static WebElement className(String attributevalue) {
		WebElement element = driver.findElement(By.className("attributevalue"));
		return element;
	}
/**
 * 
 * @param xpath
 * @return WebElement
 */
	public static WebElement xpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
/**
 * 
 * @param element
 * @return String
 */
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
/**
 * 
 * @param time
 */
	@SuppressWarnings("deprecation")
	public static void implicitwait(int time) {

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	}
/**
 * 
 * @param element
 * @return String
 */
	// 99% attribute value
	public static String getAttribute(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;
	} 
	/**
	 * 
	 * @param element
	 * @param value
	 * @return
	 */
	// 1% attribute value
	public String getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}
/**
 * 
 * @param element
 * @param data
 */

	public static void sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}
/**
 * 
 * @param element
 */
	public static void click(WebElement element) {
		element.click();
	}
/**
 * 
 * @param element
 */
	public static void clear(WebElement element) {
		element.clear();
	}
/**
 * 
 */
	public static void close() {
		driver.close();
	}
/**
 * 
 */
	public static void quit() {
		driver.quit();
	}
/**
 * 
 * @throws InterruptedException
 */
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
/**
 * 
 * @param element
 */
	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
/**
 * 
 * @param element
 */
	public static void dragAndDrop(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
/**
 * 
 * @param element
 */
	public static void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
/**
 * 
 * @param element
 * @throws AWTException
 */
	public static void keyBoardActions(WebElement element) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
/**
 * 
 * @return String
 */
	public static String printTitle() {
		String title = driver.getTitle();
		return title;
	}
/**
 * 
 * @return String
 */
	public static String printCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
/**
 * 
 * @param element
 * @return String
 */
	public static String getattribute(WebElement element  ) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
/**
 * 
 * @param element
 * @param attributeName
 * @return String
 */
	public static String getattribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
/**
 * 
 * @param element
 * @param text
 */
	public static void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
/**
 * 
 * @param element
 * @param attributevalue
 */
	public static void seletByAttribute(WebElement element, String attributevalue) {
		Select select = new Select(element);
		select.selectByValue(attributevalue);
	}
/**
 * 
 * @param element
 * @param index
 */
	public static void selectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
/**
 * 
 * @param element
 * @param data
 */
	public static void KeyBoardActions2(WebElement element, String data) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, "data").keyUp(Keys.SHIFT).perform();
	}
/**
 * 
 * @param element
 * @param data
 */
	public static void keyBoardActions3(WebElement element, String data) {
		element.sendKeys("data ", Keys.ENTER);
	}
/**
 * 
 * @param element
 */
	public static void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
/**
 * 
 */
	@SuppressWarnings("unused")
	public static void switchToAlert() {
		Alert alert = driver.switchTo().alert();

	}
/**
 * 
 */
	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
/**
 * 
 */
	public static void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
/**
 * 
 * @return String
 */
	public static String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}
/**
 * 
 * @param data
 */
	public static void alertSendKeys(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("data");
	}
/**
 * 
 * @param element
 * @param text
 */
	public static void selectDropDownByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
/**
 * 
 * @param element
 * @param index
 */
	public static void selectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
/**
 * 
 * @param element
 * @param value
 */
	public static void selectDropDownByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
/**
 * 
 * @param element
 * @param text
 */
	public static void deselectDropDownByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
/**
 * 
 * @param element
 * @param index
 */
	public static void deselectDropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
/**
 * 
 * @param element
 * @param value
 */
	public static void deselectDropDownByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}
/**
 * 
 * @param element
 * @return WebElement
 */
	public static List<WebElement> getAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
/**
 * 
 * @param element
 * @return WebElement
 */
	public static WebElement toGetFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
/**
 * 
 * @param element
 * @return WebElement
 */
	public static List<WebElement> getAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}
/**
 * 
 * @param element
 */
	public static void deselectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}
/**
 * 
 * @param element
 * @return WebElement
 */
	public static boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
/**
 * 
 * @param childWindow
 */
	public static void windowHandle(String childWindow) {
		driver.switchTo().window(childWindow);
	}
/**
 * 
 * @param url
 */
	public static void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
/**
 * 
 */
	public static void navigateForward() {
		driver.navigate().forward();
	}
/**
 * 
 */
	public static void navigateBack() {
		driver.navigate().back();
	}
/**
 * 
 */
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
/**
 * 
 * @param element
 * @param text
 */
	public static void typeJS(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + "')", element);
	}
/**
 * 
 * @param element
 * @param value
 */
	public static void JSgetAttribute(WebElement element, String value) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("return arguments[0].getAttribute('value')", element);
	}
/**
 * 
 * @param element
 */
	public static void JSClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
/**
 * 
 * @param element
 */
	public static void JSScrollUp(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}
/**
 * 
 * @param element
 */
	public static void JSScrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}
/**
 * 
 * @param URL
 */
	public static void navigate(String URL) {
		driver.navigate().to("URL");
	}
/**
 * 
 * @param sheetName
 * @param rownum
 * @param cellnum
 * @return String
 * @throws IOException
 */
// Write a code to read from excel sheet
	@SuppressWarnings("resource")
	public static String getData(String sheetName, int rownum, int cellnum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Day1Maven1\\ExcelSheet\\Book2.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
				res = dateFormat.format(date);
			} else {
				double d = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				res = b.toString();
			}
			break;

		default:
			break;
		}
		return res;
	}
	/**
	 * 
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @param olddata
	 * @param newdata
	 * @return String
	 * @throws IOException
	 */
	// Write a code to Update values in cell
	@SuppressWarnings("resource")
	public static String UpdateData(String sheetName, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Day1Maven1\\ExcelSheet\\Book2.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(olddata)) {
			cell.setCellValue(newdata);	
		}
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		return value;
	}
/**
 * 
 * @param sheetName
 * @param rownum
 * @param cellnum
 * @param data
 * @return String
 * @throws IOException
 */
	// Write a code to insert values in cell
	@SuppressWarnings("resource")
	public static String insertValue(String sheetName, int rownum, int cellnum, String data)
			throws IOException {
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Day1Maven1\\ExcelSheet\\Book2.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		return data;
	}
	/**
	 * 
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	// get the value from cofig.properties file
	public String getPropertyFile(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object name = properties.get(key);
		String value=(String)name;
		return value;		
	}
/**
 * 
 * @param browserType
 */
	// launch drivers in other class
	public static void getdriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}
	}
}
