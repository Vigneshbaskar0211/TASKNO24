package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.LoginPage;

public class Logintest extends BaseClass{

@Test
	
	public void LoginWith_Valid_Credentials() throws InterruptedException {
		//create an object of signuppage class
		LoginPage login=new LoginPage(driver);
		login.signupclicklink();
		login.getusername(prop.getProperty("username"));
		login.getuserpassword(prop.getProperty("password"));
		Thread.sleep(2000);
		login.click_Submit_login(); //calling this method
		Thread.sleep(2000);
		driver.quit();
		
	}

}












