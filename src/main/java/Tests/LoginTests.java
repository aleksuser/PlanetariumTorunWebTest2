package Tests;

import Configuration.DefaultTestConfiguration;
import Configuration.DefaultTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class LoginTests extends DefaultTest // Location parameter: id, name, className, relative xpath;
{
    private WebElement emailField, passwordField, loginButton;
    DefaultTestData defaultTestData = new DefaultTestData();

    @BeforeMethod
    public void setUp() {

        // emailField = driver.findElement(By.id("email"));

        emailField = driver.findElement(By.id("form_login_login"));
        passwordField = driver.findElement(By.id("form_login_haslo"));
        loginButton = driver.findElement(By.id("form_login_submit"));

    }

    @AfterMethod
    public void tearDown() {
        DefaultTestConfiguration.logOut();
    }

    @Test(priority = 3)
    public void successLoginWithDataTest() {
        emailField.sendKeys(defaultTestData.userLogin);
        passwordField.sendKeys(defaultTestData.userPassword);

        loginButton.click();

        assertEquals(driver.getTitle(), defaultTestData.defaultTitle);

        System.out.println("Dane wpisane poprawnie, udane logowanie");
    }

    @Test(priority = 2)
    public void failedLoginWithoutDataTest() {


        loginButton.click();

        assertEquals(driver.findElement(By.className("divError")).getText(), "Adres e-mail jest wymagany!");

        System.out.println("Nie wpisano danych, próba nieudana");
    }

    @Test(priority = 1)

    public void shouldTryLoginWithFakePassword() {


        emailField.sendKeys(defaultTestData.userLogin);
        passwordField.sendKeys("fakeSum123");

        loginButton.click();

        assertEquals(driver.findElement(By.id("messageWarning")).getText(), "Błędny login lub hasło użytkownika");


        System.out.println("Błędne hasło, próba nieudana");


    }

}
