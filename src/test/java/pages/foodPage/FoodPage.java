package pages.foodPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FoodPage {

    public FoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/h1")
    public WebElement bestRestaurantsInTheCity;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[1]/div[3]")
    public WebElement nationalCuisine83Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[2]/div[3]")
    public WebElement europeanCuisine145Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[3]/div[3]")
    public WebElement cocaColaCombo13Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[4]/div[3]")
    public WebElement chineseCuisine35Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[5]/div[3]")
    public WebElement sushi42Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[6]/div[3]")
    public WebElement fastFood67Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[7]/div[3]")
    public WebElement productBrands13Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[8]/div[3]")
    public WebElement pizza65Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[9]/div[3]")
    public WebElement worldCuisines64Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[10]/div[3]")
    public WebElement coffeeShops28Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[11]/div[3]")
    public WebElement desserts52Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[12]/div[3]")
    public WebElement koreanFood22Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[13]/div[3]")
    public WebElement vegetarianCuisine21Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[14]/div[3]")
    public WebElement indianCuisine6Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[15]/div[3]")
    public WebElement turkishCuisine20Cafe;

    @FindBy(xpath = "/html/body/div[2]/main/section[3]/div/a[16]/div[3]")
    public WebElement caucasianCuisine16Cafe;

}
