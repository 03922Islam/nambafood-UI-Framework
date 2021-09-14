package utilities;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {} //construktor --> pattern Singleton ODIN EDINSTVENYI "OODNO ELEMENTNYI WABLON"
    // chto etot Driver byl edinstvenym, chtob drujie klassy ne mogli sozdovat' cherez moi klass.
    // Dlya etogo ya zdelal moi konstruktor private


    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {

                case "firefox":
                    driver = FirefoxWebDriver.loadFirefoxWebDriver();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
                case "saucelabs":
                    driver = loadsSauceLabs();
                    break;
                    default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }

            return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static WebDriver loadsSauceLabs(){  // kross brauzernoe testirovaniya
        String url = "https://oauth-ermekov.islam.94-edfe6:4e37c3c7-512d-4499-9835-86d26857a8f4@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.CHROME);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(url),capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }
}
