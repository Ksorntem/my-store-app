package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {

        homePage = new HomePage(getDriver());
    }

    @Test
    public void test1() {
    }

    @Test(testName = "AUT-3 Footer-Information Section", description = " Information section should have the following buttons")
    public void test02(){
    SeleniumUtils.scrollIntoView(getDriver(), homePage.InformationSection);
    Assert.assertTrue(homePage.specialsLink.isEnabled());
    Assert.assertTrue(homePage.NewProductLink.isEnabled());
    Assert.assertTrue(homePage.bestSellersLink.isEnabled());
    Assert.assertTrue(homePage.ourStoresLink.isEnabled());
    Assert.assertTrue(homePage.ContactUsLink.isEnabled());
    Assert.assertTrue(homePage.termsAndConditionsLink.isEnabled());
    Assert.assertTrue(homePage.aboutUsLink.isEnabled());
    Assert.assertTrue(homePage.sitemapLink.isEnabled());
    }

    @Test(testName = "AUT-4 Footer-My Account Section", description = "My account should have the following options")
    public void test03(){
        SeleniumUtils.scrollIntoView(getDriver(), homePage.InformationSection);

        //Check all buttons are enabled
        Assert.assertTrue(homePage.myOrdersLink.isEnabled());
        Assert.assertTrue(homePage.myCreditSlipsLink.isEnabled());
        Assert.assertTrue(homePage.myAddressesLink.isEnabled());
        Assert.assertTrue(homePage.myPersonalInfoLink.isEnabled());

        //Make sure all 4 links take user to Authentication page if user has not signed in yet
        homePage.click(homePage.myOrdersBtn);
        SeleniumUtils.switchToWindowAndVerifyTitle(getDriver(),extentManager);
        //Stuck on this code

    }
}

