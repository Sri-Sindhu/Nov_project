package org.Automation;

import org.openqa.selenium.WebDriver;

public class Page_Obj_Manager_Auto {

	public WebDriver driver;

	private My_Store clicksignin;
	
	private Login_Email acc;
	
	private Create_Acc3 register_details;

	public Page_Obj_Manager_Auto(WebDriver driver2) {
		driver=driver2;
	}

	public My_Store getClicksignin() {
		if (clicksignin==null) {
			clicksignin = new My_Store(driver);
		}
		return clicksignin;
	}

	public Login_Email getAcc() {
		if (acc==null) {
			acc=new Login_Email(driver);
		}
		return acc;
	}

	public Create_Acc3 getRegister_details() {
		if (register_details==null) {
			register_details= new Create_Acc3(driver);
		}
		return register_details;
	}
	
}


