package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {

        homePage = new HomePage(getDriver());

    }
    @Test(testName = "AUT-5 Follow us social media button",description = "Verify social media buttons take to expected pages")
    public void facebookTest(){

        homePage.click(homePage.facebookBtn);
        Assert.assertTrue(homePage.facebookBtn.isEnabled());
    }

    @Test
    public void twitterTest(){

        homePage.click(homePage.twitterBtn);
        Assert.assertTrue(homePage.twitterBtn.isEnabled());
    }

    @Test
    public void youtubeTest(){

        homePage.click(homePage.youtubeBtn);
        Assert.assertTrue(homePage.youtubeBtn.isEnabled());
    }

    @Test
    public void googleTest(){

        homePage.click(homePage.googleBtn);
        Assert.assertTrue(homePage.googleBtn.isEnabled());

    }
}



