package testcases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobject.HomePage; // Import the correct HomePage class


public class HomePagetest extends BaseClass {
	 HomePage homepage;

    
    @Test
    public void verifyTitleOnHomepage() {
        homepage = new HomePage(driver);
        Assert.assertEquals(homepage.validateHomePageTitle(), "STORE");
    }

    @Test
    public void verifyLogoOnHomepage() {
        homepage = new HomePage(driver);
        Assert.assertTrue(homepage.isLogoDisplayed());
    }

    @Test
    public void verifyAllMenuItemsOnHomepage() {
        homepage = new HomePage(driver);
        List<String> menuList = Arrays.asList("Home", "Contact", "About us", "Cart", "Log in", "Sign up");
        List<WebElement> menuItems = homepage.getMenuItems();

        for (String menuItem : menuList) {
            boolean found = false;
            for (WebElement element : menuItems) {
                if (menuItem.equals(element.getText())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Menu item '" + menuItem + "' is not available");
            }
        }
    }
}
   /* @Test
    public void verifyProductFeaturesPresence() {
        homepage = new HomePage(driver);
        Assert.assertTrue(homepage.is_FeaturesProductAvailable(SamsunggalaxyS6));
    }
}*/