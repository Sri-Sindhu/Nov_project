package org.normal.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Causal_Org {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Dyna_Project\\Tree\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		signin.click();
		
		Thread.sleep(8000);

		WebElement email = driver
				.findElement(By.xpath("//label[text()='Email address']//following-sibling::input[@id='email']"));
		email.sendKeys("xdg54@gmail.com");
		
		Thread.sleep(8000);
		
		WebElement pass = driver
				.findElement(By.xpath("//p[@class='lost_password form-group']//preceding::input[@type='password']"));
		pass.sendKeys("65873");
		
		Thread.sleep(8000);
		
		WebElement sign_in = driver
				.findElement(By.xpath("//input[@name='back']//following-sibling::button[@id='SubmitLogin']"));
		sign_in.click();

		Actions a = new Actions(driver);

		WebElement dress = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		a.moveToElement(dress).build().perform();
		
		Thread.sleep(8000);

		WebElement casual = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Casual Dresses']"));
		a.moveToElement(casual).build().perform();
		a.click(casual).build().perform();

		WebElement img = driver.findElement(By.xpath("//div[@class='product-image-container']//descendant::img"));
		img.click();

		driver.switchTo().frame(0);

		WebElement qty = driver
				.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input[@id='quantity_wanted']"));
		qty.clear();

		WebElement qty1 = driver
				.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input[@id='quantity_wanted']"));
		qty1.sendKeys("4");

		WebElement size = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		Select b = new Select(size);
		b.selectByIndex(2);

		WebElement addtocart = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		addtocart.click();
		
		Thread.sleep(8000);

		Actions g = new Actions(driver);

		WebElement proceed = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		g.moveToElement(proceed).build().perform();
		g.click(proceed).build().perform();

		WebElement proceed1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		proceed1.click();

		WebElement proceed2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		proceed2.click();

		WebElement agree = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		agree.click();
		WebElement proceed3 = driver.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		proceed3.click();

		WebElement pay = driver.findElement(By.xpath("//p[@class='payment_module']//child::a"));
		pay.click();

		WebElement conform = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		conform.click();
		
		Thread.sleep(8000);

		TakesScreenshot r = (TakesScreenshot) driver;
		File source = r.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Dyna_Project\\Casual\\snap.png");
		FileUtils.copyFile(source, des);

		WebElement back_to_order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back_to_order.click();
		
		Thread.sleep(8000);

		Actions k = new Actions(driver);

		WebElement dress1 = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		k.moveToElement(dress1).build().perform();

		WebElement evening = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Evening Dresses']"));
		k.moveToElement(evening).build().perform();
		k.click(evening).build().perform();
		
		Thread.sleep(7000);

		WebElement image = driver.findElement(By.xpath("//div[@class='product-image-container']//descendant::img"));
		image.click();
		
		Thread.sleep(8000);

		driver.switchTo().frame(0);

		WebElement quan = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		quan.clear();

		WebElement quan1 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		quan1.sendKeys("3");

		WebElement size1 = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		Select t = new Select(size1);
		t.selectByIndex(2);

		WebElement color = driver
				.findElement(By.xpath("//div[@class='attribute_list']//preceding-sibling::a[@title='Pink']"));
		color.click();

		WebElement addtocart1 = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		addtocart1.click();
		
		Thread.sleep(8000);

		Actions re = new Actions(driver);

		WebElement proceeded = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		re.moveToElement(proceeded).build().perform();
		re.click(proceeded).build().perform();

		WebElement proceeded1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		proceeded1.click();

		WebElement proceeded2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		proceeded2.click();

		WebElement agree1 = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		agree1.click();
		
		WebElement proceeded3 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		proceeded3.click();

		WebElement pay1 = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']"));
		pay1.click();

		WebElement conform1 = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		conform1.click();
		
		Thread.sleep(8000);

		TakesScreenshot eve = (TakesScreenshot) driver;
		File source1 = eve.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Dyna_Project\\Evening\\snap.png");
		FileUtils.copyFile(source1, des1);

		WebElement back_to_order1 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back_to_order1.click();

		Actions as = new Actions(driver);

		WebElement dress3 = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		as.moveToElement(dress3).build().perform();

		WebElement summer = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Summer Dresses']"));
		as.moveToElement(summer).build().perform();
		as.click(summer).build().perform();
		
		Thread.sleep(8000);

		WebElement image1 = driver.findElement(By.xpath("//div[@class='product-image-container']//following::a"));
		image1.click();

		driver.switchTo().frame(0);

		WebElement qty_1 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		qty_1.clear();

		WebElement qty_2 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		qty_2.sendKeys("10");

		WebElement size_a = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		Select u = new Select(size_a);
		u.selectByIndex(2);
		
		Thread.sleep(8000);

		WebElement colors = driver
				.findElement(By.xpath("//div[@class='attribute_list']//preceding-sibling::a[@title='Blue']"));
		colors.click();

		WebElement addtocart_1 = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		addtocart_1.click();
		
		Thread.sleep(8000);

		Actions p = new Actions(driver);
		WebElement proceeds = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		p.moveToElement(proceeds).build().perform();
		p.click(proceeds).build().perform();

		WebElement proceeds1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		proceeds1.click();

		WebElement proceeds2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		proceeds2.click();

		WebElement agreeed = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		agreeed.click();

		WebElement proceeds3 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		proceeds3.click();

		WebElement pays = driver
				.findElement(By.xpath("//p[@class='payment_module']//child::a[@title='Pay by bank wire']"));
		pays.click();

		WebElement conforms = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		conforms.click();
		
		Thread.sleep(8000);

		TakesScreenshot v = (TakesScreenshot) driver;
		File sources = v.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Dyna_Project\\Summer\\snap.png");
		FileUtils.copyFile(sources, d);

		WebElement back_to_orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		back_to_orders.click();

		WebElement logout = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a[@class='logout']"));
		logout.click();

	}

}
