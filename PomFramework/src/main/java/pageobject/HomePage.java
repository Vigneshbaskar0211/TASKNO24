package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//create a webdriver variables
			public WebDriver driver;
			
			//Initialize pageFactory class init method in constructor
			public HomePage(WebDriver driver) {
				//Initialize pageFactory  init and driver
				this.driver=driver;
				PageFactory.initElements(driver,this);
					
			}
			
		//locate an element on the page 
			
			@FindBy(xpath="(//img[@src='bm.png'])[1]")
			WebElement logo;
			
			@FindBy(xpath="//*[@id=\'navbarExample\']/ul/li[1]/a")
			WebElement hometext;
			
			@FindBy(xpath="//*[@id=\'navbarExample\']")
			List<WebElement> allmenuitems;

			
		 public boolean isLogoDisplayed() {
				return logo.isDisplayed();
			}
		 
		 //create method to verify title of the page
		 public String validateHomePageTitle() {
			 return driver.getTitle();
		 }
		 
		 //return collection of item
		 public List<WebElement> getMenuItems(){
			 return allmenuitems;
		 }
         
		/* //
		 public boolean is_FeaturesProductAvailable(WebElement SamsunggalaxyS6) {
			 return SamsunggalaxyS6.isDisplayed();		
	  /*  public boolean is_featruesproductavailable () {
		WebElement productFeatures = driver.findElement(By.xpath("//*[@id=\'tbodyid\']/div[1]/div/div/h4/a"));
		  return productFeatures.isDisplayed();*/
		    }
		




































