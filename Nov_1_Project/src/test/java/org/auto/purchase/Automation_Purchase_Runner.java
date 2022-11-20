package org.auto.purchase;

import java.io.IOException;

import org.Utilityfile.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Automation_Purchase_Runner extends Base_Class {

	public static WebDriver driver; // 287 lines------>261

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browser_Launch("chrome");

		get_Url("http://automationpractice.com/index.php");

		maximize();

		WebElement signin = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a"));
		click_on_element(signin);

		sleep(8000);

		WebElement email = driver
				.findElement(By.xpath("//label[text()='Email address']//following-sibling::input[@id='email']"));
		sendkeys(email, "xdg54@gmail.com");

		sleep(8000);

		WebElement pass = driver
				.findElement(By.xpath("//p[@class='lost_password form-group']//preceding::input[@type='password']"));
		sendkeys(pass, "65873");

		sleep(8000);

		WebElement sign_in = driver
				.findElement(By.xpath("//input[@name='back']//following-sibling::button[@id='SubmitLogin']"));
		click_on_element(sign_in);

		WebElement dress = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		move_to_element(driver, dress);

		sleep(8000);

		WebElement casual = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Casual Dresses']"));
		move_to_element(driver, casual);
		click(driver, casual);

		WebElement img = driver.findElement(By.xpath("//div[@class='product-image-container']//descendant::img"));
		click_on_element(img);

		driver.switchTo().frame(0);

		WebElement qty = driver
				.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input[@id='quantity_wanted']"));
		clear_on_element(qty);

		WebElement qty1 = driver
				.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input[@id='quantity_wanted']"));
		sendkeys(qty1, "4");

		WebElement size = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		select_By_Index(size, 2);

		WebElement addtocart = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		click_on_element(addtocart);

		sleep(8000);

		WebElement proceed = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		move_to_element(driver, proceed);
		click(driver, proceed);

		WebElement proceed1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		click_on_element(proceed1);

		WebElement proceed2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		click_on_element(proceed2);

		WebElement agree = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		click_on_element(agree);

		WebElement proceed3 = driver.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		click_on_element(proceed3);

		WebElement pay = driver.findElement(By.xpath("//p[@class='payment_module']//child::a"));
		click_on_element(pay);

		WebElement conform = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		click_on_element(conform);

		sleep(8000);

		Take_Pic_Causal(conform);

		WebElement back_to_order = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click_on_element(back_to_order);

		sleep(8000);

		WebElement dress1 = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		move_to_element(driver, dress1);

		WebElement evening = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Evening Dresses']"));
		move_to_element(driver, evening);
		click(driver, evening);

		sleep(7000);

		WebElement image = driver.findElement(By.xpath("//div[@class='product-image-container']//descendant::img"));
		click_on_element(image);

		sleep(8000);

		driver.switchTo().frame(0);

		WebElement quan = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		clear_on_element(quan);

		WebElement quan1 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		sendkeys(quan1, "3");

		WebElement size1 = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		select_By_Index(size1, 2);

		WebElement color = driver
				.findElement(By.xpath("//div[@class='attribute_list']//preceding-sibling::a[@title='Pink']"));
		click_on_element(color);

		WebElement addtocart1 = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		click_on_element(addtocart1);

		sleep(8000);

		WebElement proceeded = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		move_to_element(driver, proceeded);
		click(driver, proceeded);

		WebElement proceeded1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		click_on_element(proceeded1);

		WebElement proceeded2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		click_on_element(proceeded2);

		WebElement agree1 = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		click_on_element(agree1);

		WebElement proceeded3 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		click_on_element(proceeded3);

		WebElement pay1 = driver.findElement(By.xpath("//p[@class='payment_module']//child::a[@class='cheque']"));
		click_on_element(pay1);

		WebElement conform1 = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		click_on_element(conform1);

		sleep(8000);

		Take_Pic_Evening(conform1);

		WebElement back_to_order1 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click_on_element(back_to_order1);

		WebElement dress3 = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Dresses']"));
		move_to_element(driver, dress3);

		WebElement summer = driver
				.findElement(By.xpath("//li[@id='category-thumbnail']//following::a[@title='Summer Dresses']"));
		move_to_element(driver, summer);
		click(driver, summer);

		sleep(8000);

		WebElement image1 = driver.findElement(By.xpath("//div[@class='product-image-container']//following::a"));
		click_on_element(image1);

		driver.switchTo().frame(0);

		WebElement qty_1 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		clear_on_element(qty_1);

		WebElement qty_2 = driver.findElement(By.xpath("//p[@id='quantity_wanted_p']//child::input"));
		sendkeys(qty_2, "10");

		WebElement size_a = driver
				.findElement(By.xpath("//div[@id='uniform-group_1']//following-sibling::select[@id='group_1']"));
		select_By_Index(size_a, 2);

		sleep(8000);

		WebElement colors = driver
				.findElement(By.xpath("//div[@class='attribute_list']//preceding-sibling::a[@title='Blue']"));
		click_on_element(colors);

		WebElement addtocart_1 = driver
				.findElement(By.xpath("//p[@id='add_to_cart']//preceding-sibling::button[@type='submit']"));
		click_on_element(addtocart_1);

		sleep(8000);

		WebElement proceeds = driver.findElement(
				By.xpath("//div[@class='button-container']//following-sibling::a[@title='Proceed to checkout']"));
		move_to_element(driver, proceeds);
		click_on_element(proceeds);
		
		sleep(8000);

		WebElement proceeds1 = driver.findElement(
				By.xpath("//div[@class='order_delivery clearfix row']//following::a[@title='Proceed to checkout']"));
		click_on_element(proceeds1);

		WebElement proceeds2 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@name='processAddress']"));
		click_on_element(proceeds2);

		WebElement agreeed = driver.findElement(By.xpath("//p[@class='checkbox']//following::input[@id='cgv']"));
		click_on_element(agreeed);

		WebElement proceeds3 = driver
				.findElement(By.xpath("//a[@title='Previous']//following::button[@type='submit']"));
		click_on_element(proceeds3);

		WebElement pays = driver
				.findElement(By.xpath("//p[@class='payment_module']//child::a[@title='Pay by bank wire']"));
		click_on_element(pays);

		WebElement conforms = driver.findElement(By.xpath("//p[@id='cart_navigation']//following::button"));
		click_on_element(conforms);

		sleep(8000);

		Take_Pic_Summer(conforms);

		WebElement back_to_orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click_on_element(back_to_orders);

		WebElement logout = driver.findElement(By.xpath("//div[@class='header_user_info']//child::a[@class='logout']"));
		click_on_element(logout);

	}

}
