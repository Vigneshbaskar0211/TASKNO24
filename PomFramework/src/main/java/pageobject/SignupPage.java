package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	//create a webdriver variables
	public WebDriver driver;
	
	//Initialize pageFactory class init method in constructor
	public SignupPage(WebDriver driver) {
		//Initialize pageFactory  init and driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}
	
	//locate an element available on signup page
	
	//signup dashboard link
	@FindBy(id="signin2")
	WebElement signupclicklink;

    //username
	@FindBy(id="sign-username")
	WebElement usernamefield;

	//password
	@FindBy(id="sign-password")
	WebElement userpassword;
   
	//submot button
	@FindBy(xpath="//button[.='Sign up']")
	WebElement usersignuploginbtn;
	
	//signupclosebtn
	@FindBy(xpath="//button[.='close'])[2]")
	WebElement usersignupclosebtn;
	
	
	//create method
	
	public void  signupclicklink() {
		signupclicklink.click();
	}
	
	public void getusername(String username) {
		usernamefield.sendKeys(username);
	}
	
	public void getuserpassword(String password) {
		userpassword.sendKeys(password);
	}
	
	public void click_Submit_signup() {
		usersignuploginbtn.click();
	}
}

   
    












































