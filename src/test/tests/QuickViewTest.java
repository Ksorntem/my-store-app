package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.QuickViewPage;

public class QuickViewTest extends BaseTest {
    HomePage homePage;
    QuickViewPage quickViewPage;

    @BeforeMethod
    public void localSetup() {
        quickViewPage = new QuickViewPage(getDriver());
        homePage = new HomePage(getDriver());

    }

    @Test(testName = "AUT-6 Recently viewed items", description = "should see dresses displayed in Viewed Products section")
    public void testQuickView() {

        homePage.moveIntoView (homePage.Shirt);

        homePage.quickViewBtn.click();

        homePage.closeBtn.click();

        homePage.TshirtBtn.click();

        Assert.assertTrue(QuickViewPage.viewedShirtItem.getAttribute("title").contains(homePage.expectedShirtItemText));


    }
        }





