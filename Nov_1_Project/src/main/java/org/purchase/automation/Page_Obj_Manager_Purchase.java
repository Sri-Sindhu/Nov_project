package org.purchase.automation;

import org.openqa.selenium.WebDriver;

public class Page_Obj_Manager_Purchase {
	
	public WebDriver driver;
	
	private Signin_Page1 signin;
	
	private Login_Page2 login;

	private Causual_Dress select_dress;

	private Image_Casual select_image;

	private Add_Cart_Casual quan_cart;

	private Procced_Page1_Casual proceed1;

	private Proceed7_Casual proceed2;

	private Proceed8_Casual proceed3;

	private Proceed9_Casual proceed4;

	private Pay10_Casual pay;

	private Conform_Casual conform;

	private Back_To_Order_Casual order;

	private Evening_Outfit choose;

	private Image_Evening evening;

	private Add_To_Cart_Evening cart;

	private Proceed_Page1_Evening proceed;

	private Proceed7_Evening procced_Eve;

	private Proceed8_Evening click_proceed;

	private Proceed9_Evening click_proceed9_eve;
	
	private Pay10_Evening pay_evening;
	
	private Conform_Evening conform_Evening;
	
	private Back_To_Order_Evening back_evening;

	private Summer_Outfit summer;

	private Image_Summer img;

	private Add_To_Cart_Summer add_to_cart;

	private Proceed_Page1_Summer summer_proceed;

	private Proceed7_Summer proceed_Summer;

	private Proceed8_Summer click_Proceed8;

	private Proceed9_Summer click_proced9_summer;
	
	private Pay10_Summer pay_summer;
	
	private Conform_Summer  conform_summer;
	
	private Back_To_Order_Summer back_summer;
	
	private Logout_Page logout;

	public Page_Obj_Manager_Purchase(WebDriver driver2) {
		driver=driver2;
	}

	public Signin_Page1 getSignin() {
		if (signin==null) {
			signin = new Signin_Page1(driver);
		}
		return signin;
	}

	public Login_Page2 getLogin() {
		if (login==null) {
			login=new Login_Page2(driver);
		}
		return login;
	}

	public Causual_Dress getSelect_dress() {
		if (select_dress==null) {
			select_dress=new Causual_Dress(driver);
		}
		return select_dress;
	}

	public Image_Casual getSelect_image() {
		if (select_image==null) {
			select_image=new Image_Casual(driver);
		}
		return select_image;
	}

	public Add_Cart_Casual getQuan_cart() {
		if (quan_cart==null) {
			quan_cart=new Add_Cart_Casual(driver);
		}
		return quan_cart;
	}

	public Procced_Page1_Casual getProceed1() {
		if (proceed1==null) {
			proceed1=new Procced_Page1_Casual(driver);
		}
		return proceed1;
	}

	public Proceed7_Casual getProceed2() {
		if (proceed2==null) {
			proceed2=new Proceed7_Casual(driver);
		}
		return proceed2;
	}

	public Proceed8_Casual getProceed3() {
		if (proceed3==null) {
			proceed3=new Proceed8_Casual(driver);
		}
		return proceed3;
	}

	public Proceed9_Casual getProceed4() {
		if (proceed4==null) {
			proceed4=new Proceed9_Casual(driver);
		}
		return proceed4;
	}

	public Pay10_Casual getPay() {
		if (pay==null) {
			pay=new Pay10_Casual(driver);
		}
		return pay;
	}

	public Conform_Casual getConform() {
		if (conform==null) {
			conform = new Conform_Casual(driver);
		}
		return conform;
	}

	public Back_To_Order_Casual getOrder() {
		if (order==null) {
			order = new Back_To_Order_Casual(driver);
		}
		return order;
	}

	public Evening_Outfit getChoose() {
		if (choose==null) {
			choose = new Evening_Outfit(driver);
		}
		return choose;
	}

	public Image_Evening getEvening() {
		if (evening==null) {
			evening = new Image_Evening(driver);
		}
		return evening;
	}

	public Add_To_Cart_Evening getCart() {
		if (cart==null) {
			cart = new Add_To_Cart_Evening(driver);
		}
		return cart;
	}

	public Proceed_Page1_Evening getProceed() {
		if (proceed==null) {
			proceed = new Proceed_Page1_Evening(driver);
		}
		return proceed;
	}

	public Proceed7_Evening getProcced_Eve() {
		if (procced_Eve==null) {
			procced_Eve = new Proceed7_Evening(driver);
		}
		return procced_Eve;
	}

	public Proceed8_Evening getClick_proceed() {
		if (click_proceed==null) {
			click_proceed=new Proceed8_Evening(driver);
		}
		return click_proceed;
	}

	public Proceed9_Evening getClick_proceed9_eve() {
		if (click_proceed9_eve==null) {
			click_proceed9_eve= new Proceed9_Evening(driver);
		}
		return click_proceed9_eve;
	}

	public Pay10_Evening getPay_evening() {
		if (pay_evening==null) {
			pay_evening = new Pay10_Evening(driver);
		}
		return pay_evening;
	}

	public Conform_Evening getConform_Evening() {
		if (conform_Evening==null) {
			conform_Evening = new Conform_Evening(driver);
		}
		return conform_Evening;
	}

	public Back_To_Order_Evening getBack_evening() {
		if (back_evening==null) {
			back_evening = new Back_To_Order_Evening(driver);
		}
		return back_evening;
	}

	public Summer_Outfit getSummer() {
		if (summer==null) {
			summer = new Summer_Outfit(driver);
		}
		return summer;
	}

	public Image_Summer getImg() {
		if (img==null) {
			img = new Image_Summer(driver);
		}
		return img;
	}

	public Add_To_Cart_Summer getAdd_to_cart() {
		if (add_to_cart==null) {
			add_to_cart = new Add_To_Cart_Summer(driver);
		}
		return add_to_cart;
	}

	public Proceed_Page1_Summer getSummer_proceed() {
		if (summer_proceed==null) {
			summer_proceed = new Proceed_Page1_Summer(driver);
		}
		return summer_proceed;
	}

	public Proceed7_Summer getProceed_Summer() {
		if (proceed_Summer==null) {
			proceed_Summer = new Proceed7_Summer(driver);
		}
		return proceed_Summer;
	}

	public Proceed8_Summer getClick() {
		if (click_Proceed8==null) {
			click_Proceed8=new Proceed8_Summer(driver);
		}
		return click_Proceed8;
	}

	public Proceed9_Summer getClick_proced9_summer() {
		if (click_proced9_summer==null) {
			click_proced9_summer = new Proceed9_Summer(driver);
		}
		return click_proced9_summer;
	}

	public Pay10_Summer getPay_summer() {
		if (pay_summer==null) {
			pay_summer = new Pay10_Summer(driver);
		}
		return pay_summer;
	}

	public Conform_Summer getConform_summer() {
		if (conform_summer==null) {
			conform_summer = new Conform_Summer(driver);
		}
		return conform_summer;
	}

	public Back_To_Order_Summer getBack_summer() {
		if (back_summer==null) {
			back_summer = new Back_To_Order_Summer(driver);
		}
		return back_summer;
	}

	public Logout_Page getLogout() {
		if (logout==null) {
			logout = new Logout_Page(driver);
		}
		return logout;
	}

}
