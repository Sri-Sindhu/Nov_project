package org.Utilityfile;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page_Adacatin homepg;

	private Search_Hotel_Adacatin search;

	private Click_Contiune3 next;

	private Book_Now book;

	private My_litenery click;

	private Logout logout;

	public Page_Object_Manager(WebDriver driver2) {
		
		driver=driver2;
	}
	public Home_Page_Adacatin getHomepg() {

		if (homepg == null) {
			homepg = new Home_Page_Adacatin(driver);
		}
		return homepg;
	}
	public Search_Hotel_Adacatin getSearch() {
		if (search == null) {
			search = new Search_Hotel_Adacatin(driver);
		}
		return search;
	}
	public Click_Contiune3 getNext() {

		if (next == null) {
			next = new Click_Contiune3(driver);

		}
		return next;
	}

	public Book_Now getBook() {
		if (book == null) {
			book = new Book_Now(driver);

		}
		return book;
	}

	public My_litenery getClick() {
		if (click == null) {
			click = new My_litenery(driver);

		}
		return click;
	}

	public Logout getLogout() {
		if (logout == null) {
			logout = new Logout(driver);

		}
		return logout;
	}

}
