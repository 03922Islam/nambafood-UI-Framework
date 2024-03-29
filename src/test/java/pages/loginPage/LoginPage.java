package pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/span")
    public WebElement errorMessage;

    public void login (String userNameInput, String passWordInput){
        passWord.sendKeys(passWordInput);
        userName.sendKeys(userNameInput);
        loginButton.click();
    }
}
