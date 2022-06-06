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

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li")
    public WebElement InformationSection;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[1]")
    public WebElement specialsLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[2]")
    public WebElement NewProductLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[3]")
    public WebElement bestSellersLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[4]")
    public WebElement ourStoresLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[5]")
    public WebElement ContactUsLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[6]")
    public WebElement termsAndConditionsLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[7]")
    public WebElement aboutUsLink;

    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']//ul//li[8]")
    public WebElement sitemapLink;


}


