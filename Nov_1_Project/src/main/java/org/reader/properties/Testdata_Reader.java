package org.reader.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testdata_Reader {
	public static Properties d;

	public Testdata_Reader() throws IOException {//constructor
		File a = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Nov_1_Project\\src\\main\\java\\org\\data\\reader\\Test.properties");
		FileInputStream s = new FileInputStream(a);
		d = new Properties();
		d.load(s);
	}

	public String getusername() {//method
		String username = d.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = d.getProperty("password");
		return password;
	}
	public String getlocation() {
		String password = d.getProperty("location");
		return password;
	}
	public String getroom() {
		String password = d.getProperty("roomtype");
		return password;
	}

	public String getdatein() {
		String datein = d.getProperty("selectindate");
		return datein;
	}

	public String getdateout() {
		String dateout = d.getProperty("selectoutdate");
		return dateout;
	}

	public String getfirstname() {
		String firstname = d.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = d.getProperty("lastname");
		return lastname;
	}

	public String getaddress() {
		String lastname = d.getProperty("address");
		return lastname;
	}

	public String getcardno() {
		String cardno = d.getProperty("cardno");
		return cardno;
	}

	public String getcreditcard() {
		String creditcard = d.getProperty("creditcard");
		return creditcard;
	}

	public String getmonth() {
		String month = d.getProperty("month");
		return month;
	}

	public String getyear() {
		String year = d.getProperty("year");
		return year;
	}

	public String getccvno() {
		String ccvno = d.getProperty("ccvno");
		return ccvno;
	}

}
