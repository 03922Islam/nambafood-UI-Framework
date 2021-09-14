package step_defs;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import helper.Helper;
import mainPage.MainPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.pharmacyPage.PharmacyPage;


public class PharmacyPage_steps {


    MainPage mainPage = new MainPage();
    PharmacyPage pharmacyPage = new PharmacyPage();


    @Given("^Пользователь должен нажать на картинку аптека$")
    public void пользователь_должен_нажать_на_картинку_аптека()  {
        Helper.mouseClick(mainPage.pharmacy);
    }

    @Given("^Пользователь должен увидеть раздел При простуде$")
    public void пользователь_должен_увидеть_раздел_При_простуде()  {
        String expectedWithACold = "При\nпростуде";
        String actual = pharmacyPage.withACold.getText();
        Assert.assertTrue(actual.contains(expectedWithACold));
    }

    @Given("^Пользователь должен увидеть раздел Для самых маленьких$")
    public void пользователь_должен_увидеть_раздел_Для_самых_маленьких()  {
        String expectedForTheLittleOnes = "Для\nсамых маленьких";
        String actual = pharmacyPage.forTheLittleOnes.getText();
        Assert.assertTrue(actual.contains(expectedForTheLittleOnes));
    }

    @Given("^Пользователь должен увидеть раздел Витамины$")
    public void пользователь_должен_увидеть_раздел_Витамины()  {
        String expectedVitamins = "Витамины";
        String actual = pharmacyPage.vitamins.getText();
        Assert.assertTrue(actual.contains(expectedVitamins));
    }

    @Given("^Пользователь должен увидеть раздел Боли и ушибы$")
    public void пользователь_должен_увидеть_раздел_Боли_и_ушибы()  {
        String expectedPainAndBruises = "Боли\nи ушибы";
        String actual = pharmacyPage.painAndBruises.getText();
        Assert.assertTrue(actual.contains(expectedPainAndBruises));
    }

    @Given("^Пользователь должен увидеть раздел Расстройства желудка$")
    public void пользователь_должен_увидеть_раздел_Расстройства_желудка()  {
        String expectedUpsetStomach = "Расстройства\nжелудка";
        String actual = pharmacyPage.upsetStomach.getText();
        Assert.assertTrue(actual.contains(expectedUpsetStomach));
    }

    @Given("^Пользователь должен увидеть раздел Диабет и астма$")
    public void пользователь_должен_увидеть_раздел_Диабет_и_астма()  {
        String expectedDiabetesAndAsthma = "Диабет\nи астма";
        String actual = pharmacyPage.diabetesAndAsthma.getText();
        Assert.assertTrue(actual.contains(expectedDiabetesAndAsthma));
    }

    @Given("^Пользователь должен увидеть раздел Смотреть весь каталог$")
    public void пользователь_должен_увидеть_раздел_Смотреть_весь_каталог()  {
        String expectedViewEntireCatalog = "Смотреть\nвесь каталог";
        String actual = pharmacyPage.viewEntireCatalog.getText();
        Assert.assertTrue(actual.contains(expectedViewEntireCatalog));

    }

}


