package org.Utilityfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;// (driver is null)

	public static String value;
	
	public static WebDriver browser_Launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Chromedriver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		return driver;
	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click_on_element(WebElement element) {
		element.click();
	}

	public static void clear_on_element(WebElement element) {
		element.clear();
	}

	public static boolean is_Enable(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean is_Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static String get_text(WebElement element, String value) {
		String text = element.getText();
		return text;
	}

	public static String get_Attribute(WebElement element, String attribute_value) {
		String attribute = element.getAttribute(attribute_value);
		return attribute;
	}

	public static void sleep(long milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void select_By_Index(WebElement element, int index) {
		Select a = new Select(element);
		a.selectByIndex(index);
	}

	public static void select_By_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_By_Visible_Text(WebElement element, String value) {
		Select d = new Select(element);
		d.selectByVisibleText(value);
	}

	public static List<WebElement> get_Options(WebElement element) {
		Select a = new Select(element);
		List<WebElement> options = a.getOptions();
		return options;

	}

	public static List<WebElement> get_Allselected_Options(WebElement element) {
		Select a = new Select(element);
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public static WebElement get_Firstselected_Options(WebElement element) {
		Select a = new Select(element);
		WebElement firstSelectedOption = a.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void get_Url(String url) {
		driver.get(url);
	}

	public static String get_Title() {
		String title = driver.getTitle();
		return title;
	}

	public static String get_current_Url() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void navigation_Commands(String commands) {
		if (commands.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (commands.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}

	}

	public static void click(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.click().build().perform();
	}

	public static void click_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.click(element).build().perform();
	}

	public static void context_click(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.contextClick().build().perform();
	}

	public static void context_click_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.contextClick(element).build().perform();
	}

	public static void double_click(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.doubleClick().build().perform();
	}

	public static void double_click_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.doubleClick(element).build().perform();
	}

	public static void click_and_hold(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.clickAndHold().build().perform();
	}

	public static void move_to_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.moveToElement(element).build().perform();
	}

	public static void drag_and_drop(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.dragAndDrop(element, element).build().perform();
	}

	public static void release(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.click().build().perform();
	}
	
	public static void jsscroll(WebDriver webjs,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)webjs;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
	public static void jsclick(WebDriver webjs,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)webjs;
		js.executeScript("arguments[0].click()",element);
	}
	
	
	public static void Take_Pic_Causal(WebElement element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Casual\\snap.png");
		FileUtils.copyFile(source, des);
	}
	public static void Take_Pic_Evening(WebElement element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Evening\\snap.png");
		FileUtils.copyFile(source, des);
	}
	public static void Take_Pic_Summer(WebElement element) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\Summer\\snap.png");
		FileUtils.copyFile(source, des);
	}
	
	public static String Particular_Cell_Data(String path,int sheet,int row,int cell) throws IOException {

		File a = new File(path);

		FileInputStream s = new FileInputStream(a);

		Workbook d = new XSSFWorkbook(s);

		Sheet f = d.getSheetAt(sheet);

		Row g = f.getRow(row);

		Cell h = g.getCell(cell);

		CellType j = h.getCellType();

		if (j.equals(CellType.STRING)) {
			 value = h.getStringCellValue();
		}
		else if (j.equals(CellType.NUMERIC)) {
			double z = h.getNumericCellValue();
			int q=(int) z;
			 value = String.valueOf(q);
		}
		
		d.close();
		
		return value;
	}
	


}
