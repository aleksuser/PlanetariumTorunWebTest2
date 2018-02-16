package Configuration;

import Tests.DefaultTest;
import Utils.DefaultValidator;
import org.openqa.selenium.By;

public class DefaultTestConfiguration extends DefaultTest
{
    public static void logOut()
    {
        if (DefaultValidator.isElementPresent(By.cssSelector("#menu > a:nth-child(3)")))
        {
            driver.findElement(By.cssSelector("#menu > a:nth-child(3)")).click();

        }
    }
}