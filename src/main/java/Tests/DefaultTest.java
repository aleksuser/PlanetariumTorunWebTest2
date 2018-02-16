package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public abstract class DefaultTest
{
    public static WebDriver driver;

    @BeforeTest()
    public void BeforeTest()
    {
        System.setProperty("webdriver.gecko.driver", "/Users/aleksandra/IdeaProjects/PlanetariumTorunWebTest/geckodriver");

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://bilety.planetarium.torun.pl/uzytkownik/login.html");

    }

    @AfterTest()
    public void afterSuite()
    {
        //driver.close();
        driver.quit();

    }
}