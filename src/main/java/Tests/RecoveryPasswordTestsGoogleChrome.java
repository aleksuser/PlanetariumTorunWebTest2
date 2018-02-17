
package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RecoveryPasswordTestsGoogleChrome extends DefaultTestGoogleChrome  // Location parameter: linkText, partialLinkText;
{
    @Test(priority=1)
    public void openRecoveryPasswordPageTest() {

        driver.findElement(By.linkText("Zapomniałem hasła")).click();

        assertEquals(driver.getTitle(), "Zapomniałem hasła - Planetarium Toruń");

        System.out.println("Wyświetla się formularz Zapomiałem hasła");
    }
}