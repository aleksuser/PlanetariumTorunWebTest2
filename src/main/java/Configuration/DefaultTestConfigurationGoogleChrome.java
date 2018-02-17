package Configuration;

import Tests.DefaultTestGoogleChrome;
import Utils.DefaultValidatorGoogleChrome;
import org.openqa.selenium.By;

public class DefaultTestConfigurationGoogleChrome extends DefaultTestGoogleChrome
{
    public static void logOut()
    {
        if (DefaultValidatorGoogleChrome.isElementPresent(By.cssSelector("#menu > a:nth-child(3)")))
        {
            driver.findElement(By.cssSelector("#menu > a:nth-child(3)")).click();

        }
    }
}