package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {


    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromedriver().setup(); // zaiti v Chrome

        ChromeOptions options = new ChromeOptions();   // opsii
        options.addArguments("--start-maximized");       // otkryt' na polnoe okno
        options.addArguments("--disable-extensions");   // chtoby ubrat' nenujnye rawireniya
        options.addArguments("--window-size-1920,1080"); //razmer otkrytiya okna

        if (Boolean.parseBoolean(ConfigReader.getProperty("headless"))){
            options.addArguments("--headless");
        }



        WebDriver driver = new ChromeDriver(options);  // sozdaem sam draiver
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); // esli sait dolgo gruzitsya on doljen podojdat' minimun 10sek
        driver.manage().window().maximize();

        return driver;

    }
}
