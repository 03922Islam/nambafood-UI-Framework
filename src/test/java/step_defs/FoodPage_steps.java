package step_defs;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import helper.Helper;
import mainPage.MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.foodPage.FoodPage;
import utilities.Driver;

public class FoodPage_steps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    FoodPage foodPage = new FoodPage();

    @Given("^Я как пользователь должен зайти на сайт https://nambafood\\.kg/$")
    public void я_как_пользователь_должен_зайти_на_сайт_https_nambafood_kg()  {
        driver.navigate().to("https://nambafood.kg/");
    }

    @Given("^Пользователь должен прокрутить страницу вниз$")
    public void пользователь_должен_прокрутить_страницу_вниз()  {
        Helper.scroollDownThePage();
    }

    @Given("^Пользователь должен нажать на картинку еда$")
    public void пользователь_должен_нажать_на_картинку_еда()  {
        Helper.mouseClick(mainPage.food);
    }

    @Given("^Пользователь должен увидеть \"([^\"]*)\"$")
    public void пользователь_должен_увидеть(String expectedPageTitle)  {
        String actualPageTitle = foodPage.bestRestaurantsInTheCity.getText().trim();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }


        @Given("^Пользователь должен увидеть такие кухни как национальная кухня, у национальной кухни должен быть \"([^\"]*)\"$")
    public void пользователь_должен_увидеть_такие_кухни_как_национальная_кухня_у_национальной_кухни_должен_быть(String expectedNationalCuisine)  {
        String nationalCuisine84Cafe = foodPage.nationalCuisine83Cafe.getText();
        Assert.assertEquals(expectedNationalCuisine, nationalCuisine84Cafe);
    }

    @Given("^У европейской кухни должен быть \"([^\"]*)\"$")
    public void у_европейской_кухни_должен_быть(String expectedEuropeanCuisine)  {
        String europeanCuisine147Cafe = foodPage.europeanCuisine145Cafe.getText();
        Assert.assertEquals(expectedEuropeanCuisine,europeanCuisine147Cafe);
    }

    @Given("^У кока кола комбо должен быть \"([^\"]*)\"$")
    public void у_кока_кола_комбо_должен_быть(String expectedCocaColaCombo) {
        String cocaColaCombo13Cafe = foodPage.cocaColaCombo13Cafe.getText();
        Assert.assertEquals(expectedCocaColaCombo,cocaColaCombo13Cafe);
    }

    @Given("^У китайской кухни должен быть \"([^\"]*)\"$")
    public void у_китайской_кухни_должен_быть(String expectedChineseCuisine)  {
        String chineseCuisine35Cafe = foodPage.chineseCuisine35Cafe.getText();
        Assert.assertEquals(expectedChineseCuisine,chineseCuisine35Cafe);
    }

    @Given("^У суши должен быть \"([^\"]*)\"$")
    public void у_суши_должен_быть(String expectedSushi)  {
        String sushi42Cafe = foodPage.sushi42Cafe.getText();
        Assert.assertEquals(expectedSushi,sushi42Cafe);
    }

    @Given("^У fast food должен быть \"([^\"]*)\"$")
    public void у_fast_food_должен_быть(String expectedFastFood)  {
        String fastFood67Cafe = foodPage.fastFood67Cafe.getText();
        Assert.assertEquals(expectedFastFood,fastFood67Cafe);
    }

    @Given("^У продуктовые бренды должен быть \"([^\"]*)\"$")
    public void у_продуктовые_бренды_должен_быть(String expectedProductBrands)  {
        String productBrands13Cafe = foodPage.productBrands13Cafe.getText();
        Assert.assertEquals(expectedProductBrands,productBrands13Cafe);
    }

    @Given("^У пиццы должен быть \"([^\"]*)\"$")
    public void у_пиццы_должен_быть(String expectedPizza)  {
        String pizza65Cafe = foodPage.pizza65Cafe.getText();
        Assert.assertEquals(expectedPizza,pizza65Cafe);
    }

    @Given("^У кухни мира должен быть \"([^\"]*)\"$")
    public void у_кухни_мира_должен_быть(String expectedWorldCuisines)  {
        String worldCuisines63Cafe = foodPage.worldCuisines64Cafe.getText();
        Assert.assertEquals(expectedWorldCuisines,worldCuisines63Cafe);
    }

    @Given("^У кофейни должен быть \"([^\"]*)\"$")
    public void у_кофейни_должен_быть(String expectedCoffeeShops)  {
        String coffeeShops28Cafe = foodPage.coffeeShops28Cafe.getText();
        Assert.assertEquals(expectedCoffeeShops,coffeeShops28Cafe);
    }

    @Given("^У десерты должен быть \"([^\"]*)\"$")
    public void у_десерты_должен_быть(String expectedDesserts)  {
        String desserts52Cafe = foodPage.desserts52Cafe.getText();
        Assert.assertEquals(expectedDesserts,desserts52Cafe);
    }

    @Given("^У корейской кухни должен быть \"([^\"]*)\"$")
    public void у_корейской_кухни_должен_быть(String expectedKoreanFood)  {
        String koreanFood22Cafe = foodPage.koreanFood22Cafe.getText();
        Assert.assertEquals(expectedKoreanFood,koreanFood22Cafe);
    }

    @Given("^У вегетарианской кухни должен быть \"([^\"]*)\"$")
    public void у_вегетарианской_кухни_должен_быть(String expectedVegetarianCuisine)  {
        String vegetarianCuisine20Cafe = foodPage.vegetarianCuisine21Cafe.getText();
        Assert.assertEquals(expectedVegetarianCuisine,vegetarianCuisine20Cafe);
    }

    @Given("^У индийской кухни должен быть \"([^\"]*)\"$")
    public void у_индийской_кухни_должен_быть(String expectedIndianCuisine)  {
        String indianCuisine5Cafe = foodPage.indianCuisine6Cafe.getText();
        Assert.assertEquals(expectedIndianCuisine,indianCuisine5Cafe);
    }

    @Given("^У турецской кухни должен быть \"([^\"]*)\"$")
    public void у_турецской_кухни_должен_быть(String expectedTurkishCuisine)  {
        String turkishCuisine20Cafe = foodPage.turkishCuisine20Cafe.getText();
        Assert.assertEquals(expectedTurkishCuisine,turkishCuisine20Cafe);
    }

    @Given("^У кавказской кухни должен быть \"([^\"]*)\"$")
    public void у_кавказской_кухни_должен_быть(String expectedCaucasianCuisine)  {
        String caucasianCuisine16Cafe = foodPage.caucasianCuisine16Cafe.getText();
        Assert.assertEquals(expectedCaucasianCuisine,caucasianCuisine16Cafe);
    }
}