package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//create a webdriver variables
		public WebDriver driver;
		
		//Initialize pageFactory class init method in constructor
		public LoginPage(WebDriver driver) {
			//Initialize pageFactory  init and driver
			this.driver=driver;
			PageFactory.initElements(driver,this);
				
		}
		
		//locate an element available on signup page
		
		//signup dashboard link
		@FindBy(id="login2")
		WebElement loginlinkclick;

	    //username
		@FindBy(id="loginusername")
		WebElement usernamefield;

		//password
		@FindBy(id="loginpassword")
		WebElement userpassword;
	   
		//submot button
		@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
		WebElement userloginbtn;

		

		//create method
		
		public void  signupclicklink() {
			loginlinkclick.click();
		}
		
		public void getusername(String username) {
			usernamefield.sendKeys(username);
		}
		
		public void getuserpassword(String password) {
			userpassword.sendKeys(password);
		}
		
		public void click_Submit_login() {
			userloginbtn.click();
		

			
		}
	}









