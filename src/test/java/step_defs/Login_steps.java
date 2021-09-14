package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.He;
import helper.Helper;
import mainPage.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.loginPage.LoginPage;
import pojo.LoginDataContainer;
import utilities.Driver;

import java.util.List;

public class Login_steps {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();



    @Given("^Пользователь должен нажать на кнопку войти$")
    public void пользовательДолженНажатьНаКнопкуВойти() {
        mainPage.signIn(mainPage.signInToSystem);

    }

    @When("^Пользователь входит в систему с этими данными$")
    public void пользователь_входит_в_систему_с_этими_данными(List<LoginDataContainer> loginData)  {
        loginPage.login(loginData.get(0).getUserName(),loginData.get(0).getPassword());
    }


    @Then("^Пользователь должен успешно зайти в систему$")
    public void пользователь_должен_успешно_зайти_в_систему()  {
        mainPage.clickProfileMenu(mainPage.profileMenu);
        String expectedResult = "Здравствуйте, Islam";
        Assert.assertEquals(expectedResult,Helper.getTextValue(mainPage.profileName));
    }


    @Then("^Пользователь должен увидит ошибку \"([^\"]*)\"$")
    public void пользовательДолженУвидитОшибку(String expectedErrorMassage)  {
        String actualErrorMessage = Helper.getTextValue(loginPage.errorMessage);
        Assert.assertEquals(expectedErrorMassage,actualErrorMessage);







    }
}
