package tests;

import base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OrderPage;

public class OrderTest extends BaseTest {
    HomePage homePage;
    OrderPage orderPage;

    @BeforeMethod
    public void localSetUp() {

        homePage = new HomePage(getDriver());
        orderPage = new OrderPage(getDriver());

    }

    @Test(testName = "AUT-1 Cart View",description = "Verify small cart view and full cart view have same items")
    public void itemsTest(){
        homePage.moveIntoView(homePage.shortSleeveImg);
        Actions action = new Actions(getDriver());
        action.moveToElement(homePage.shortSleeveImg).perform();
        homePage.addCartBtn.click();
        homePage.continueBtn.click();

        action.moveToElement(homePage.blouseImg).perform();
        homePage.addCartBtn2.click();
        homePage.continueBtn.click();

        action.moveToElement(homePage.viewCart).perform();

        String feddedTooltip = homePage.fededShirts.getAttribute("title");
        System.out.println(feddedTooltip);
        String blouseTooltip = homePage.blouse.getAttribute("title");
        System.out.println(blouseTooltip);

        homePage.checkoutBtn.click();

        Assert.assertEquals(feddedTooltip, orderPage.item1.getText());
        Assert.assertEquals(blouseTooltip, orderPage.item2.getText());
    }

    @Test(description = "Verify total price on small cart view is same as full cart view")
    public void totalPriceTest(){

        homePage.moveIntoView(homePage.shortSleeveImg);
        Actions action = new Actions(getDriver());
        action.moveToElement(homePage.shortSleeveImg).perform();
        homePage.addCartBtn.click();
        homePage.continueBtn.click();

        action.moveToElement(homePage.blouseImg).perform();
        homePage.addCartBtn2.click();
        homePage.continueBtn.click();

        action.moveToElement(homePage.viewCart).perform();

        String totalPrice = homePage.getText(homePage.totalPrice);
        System.out.println(totalPrice);

        homePage.checkoutBtn.click();

        String total = orderPage.total.getText();
        System.out.println(total);

        Assert.assertEquals(totalPrice, total);
    }
}
