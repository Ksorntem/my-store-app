package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {
    protected WebDriver driver;

    public OrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='Faded Short Sleeve T-shirts']")
    public WebElement item1;

    @FindBy(xpath = "//p[@class='product-name']/*[text()='Blouse']")
    public WebElement item2;

    @FindBy(xpath = "//table/tfoot/tr[last()]/td//span[@id]")
    public WebElement total;

}
