package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
    public static WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        // Use the properties from data.properties
        prop = new Properties();

        // Path to properties
        String propPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";

        // Create a file input stream object
        FileInputStream fis = new FileInputStream(propPath);
        prop.load(fis); // Load data from data.properties

        // Develop code for browser selection
        String choiceBrowser = "Chrome";
        if (choiceBrowser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (choiceBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (choiceBrowser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Invalid Browser Selection");
            System.exit(1);
        }

        // Window Maximize
        driver.manage().window().maximize();

        // Delete cookies
        driver.manage().deleteAllCookies();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Google website
        driver.get("https://www.google.com/");

        return driver;
    }

	   //add a functionality to capture screeshot
	
	   public String takeScreenshot(String testname,WebDriver driver) throws IOException {
	    File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //provide the path where we capture Screenshot
	    String screenshotfilepath=System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
	    //copy the files
	    FileUtils.copyFile(srcScreenshot, new File(screenshotfilepath));
	    
	    return screenshotfilepath;
	   }
	    
	  //Switching to window
	    public static void SwitchWinodw() {
	    String parentwindow=driver.getWindowHandle();
	    Set<String> windowhandles=driver.getWindowHandles();
	    windowhandles.size();
	    
	    //iterte through windows
	    for(String childWindow:windowhandles) {
	    if(!childWindow.contentEquals(parentwindow)) {
	    driver.switchTo().window (childWindow);
	   }
	 }
 }
	    
	    
	  //Function to wait for an element to be clickable
	    public static WebElement waitforElementTobeClickable(By locator,int timeoutinseconds) { 
	         WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds (timeoutinseconds)); 
	         return wait.until(ExpectedConditions.elementToBeClickable(locator));
   }
}



	   













//*[@id="nava"]/img













