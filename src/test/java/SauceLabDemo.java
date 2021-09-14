import helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        String USERNAME = "oauth-ermekov.islam.94-edfe6";
        String ACCESS_KEY = "4e37c3c7-512d-4499-9835-86d26857a8f4";

        String url = "https://oauth-ermekov.islam.94-edfe6:4e37c3c7-512d-4499-9835-86d26857a8f4@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.HIGH_SIERRA);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = new RemoteWebDriver(new URL(url),capabilities); // UDAlenyi driver
        driver.get("https://nambafood.kg/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2250)");
        Thread.sleep(3000);
        String element = driver.findElement(By.xpath("/html/body/main/section[8]/div/h3[1]")).getText();
        System.out.println(element);
    }
}
