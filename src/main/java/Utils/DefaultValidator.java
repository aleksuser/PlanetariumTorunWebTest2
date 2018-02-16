package Utils;

import Tests.DefaultTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;



public class DefaultValidator
{

    public static boolean isElementPresent(By locatorKey)
    {
        try
        {
            DefaultTest.driver.findElement(locatorKey);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }

    }



}