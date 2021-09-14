package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Helper {

    public static void mouseClick(WebElement element) {
        waitElementToBeDisplayed(element);
        waitForElementToBeClickable(element);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();
    }

    public static void waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void scroollDownThePage() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0,450)");
    }

    public static boolean retryingFindClick(By by) {  // Sobstvenyi metod esli odin raz ne najimaetsya to on
        boolean result = false;                                             // budet najimat' 2 RAZA
        int attempts = 0;
        while (attempts < 2) {
            try {
                Driver.getDriver().findElement(by).click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }
        return result;
    }

    public static String getTextValue(WebElement element) {  // Nujen dlya togo chtoby perevesti v TEXT
        waitElementToBeDisplayed(element);
        String text = element.getText();
        return text;
    }


}
