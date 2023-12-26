package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.SignupPage;

public class Signuptest extends BaseClass {
	
	
	@Test
	
	public void signup () throws InterruptedException {
		//create an object of signuppage class
		SignupPage signup=new SignupPage(driver);
		signup.signupclicklink();
		signup.getusername(prop.getProperty("username"));
		signup.getuserpassword(prop.getProperty("password"));
		Thread.sleep(2000);
		signup.click_Submit_signup(); //calling this method
		Thread.sleep(2000);
		//driver.quit();
		
	}

}















