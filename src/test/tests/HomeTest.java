package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;
import utils.SeleniumUtils;

import java.util.List;

public class HomeTest extends BaseTest {
    HomePage homePage;
    OrderPage orderPage;

    @BeforeMethod
    public void localSetUp() {

        homePage = new HomePage(getDriver());
        orderPage = new OrderPage(getDriver());

    }
    @Test(testName = "AUT-5 Follow us social media button",description = "Verify social media buttons take to expected pages")
    public void facebookTest(){

        homePage.click(homePage.facebookBtn);
        Assert.assertTrue(homePage.facebookBtn.isEnabled());
    }
}



