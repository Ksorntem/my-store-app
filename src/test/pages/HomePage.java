package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    public WebElement shortSleeveImg;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addCartBtn;

    @FindBy(xpath = "//i[@class='icon-chevron-left left']")
    public WebElement continueBtn;

    @FindBy(xpath = "(//img[@title='Blouse'])[1]")
    public WebElement blouseImg;

    @FindBy(xpath = "//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//span[contains(text(),'Add to cart')]")
    public WebElement addCartBtn2;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement viewCart;

    @FindBy(css = "div[class='product-name'] a[title='Faded Short Sleeve T-shirts'")
    public WebElement fededShirts;

    @FindBy(css = "div[class='product-name'] a[title='Blouse']")
    public WebElement blouse;

    @FindBy(xpath = "//a[@id='button_order_cart']")
    public WebElement checkoutBtn;



}
