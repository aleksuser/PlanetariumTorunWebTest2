package Utils;

import Tests.DefaultTestGoogleChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;



public class DefaultValidatorGoogleChrome
{

    public static boolean isElementPresent(By locatorKey)
    {
        try
        {
            DefaultTestGoogleChrome.driver.findElement(locatorKey);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }

    }



}