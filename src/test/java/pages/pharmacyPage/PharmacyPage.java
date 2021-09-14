package pages.pharmacyPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PharmacyPage {

    public PharmacyPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "/html/body/main/section[3]/div[1]/a[1]/div")
    public WebElement withACold;

    @FindBy(xpath = "/html/body/main/section[3]/div[2]/a[1]/div")
    public WebElement forTheLittleOnes;

    @FindBy(xpath = "/html/body/main/section[3]/div[3]/a[1]/div")
    public WebElement vitamins;

    @FindBy(xpath = "/html/body/main/section[3]/div[1]/a[2]/div")
    public WebElement painAndBruises;

    @FindBy(xpath = "/html/body/main/section[3]/div[1]/a[3]/div")
    public WebElement upsetStomach;

    @FindBy(xpath = "/html/body/main/section[3]/div[2]/a[2]/div")
    public WebElement diabetesAndAsthma;

    @FindBy(xpath = "/html/body/main/section[3]/div[3]/a[2]/div")
    public WebElement viewEntireCatalog;
}
