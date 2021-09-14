package mainPage;

import helper.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage extends Helper {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


// PATRN Page object model ----> YA kajdyi veb element prevrawayu v Java ob'ekt!!!! Chtoby kajdyi raz ne pisat' XPATH
    @FindBy(xpath = "//a[@class='home--cat-item food']")
    public WebElement food;

    @FindBy(xpath = "//a[@href='/pharmacy']//div[@class='home--cat-prev']")
    public WebElement pharmacy;

    @FindBy(xpath = "//a[@href='/market/shop']//img[@class='prev']")
    public WebElement stores;

    @FindBy(xpath = "//a[@href='/market/gift']")
    public WebElement flowersGift;

    @FindBy(id = "login--button")
    public WebElement signInToSystem;

    @FindBy(xpath = "/html/body/header/section[1]/div[4]/div[3]/a[1]")
    public WebElement userWelcome;

    @FindBy(id = "menu--profile-btn")
    public WebElement profileMenu;

    @FindBy(xpath = "/html/body/header/section[1]/div[4]/div[3]/a[1]")
    public WebElement profileName;

    public void clickProfileMenu(WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        profileMenu.click();
    }

    public void signIn (WebElement element){
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        signInToSystem.click();
    }
}
