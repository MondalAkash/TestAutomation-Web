package utilities;

import env.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions extends BaseClass {

    public static WebElement findAndWaitForTheElement(By locator)
    {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element = driver.findElement(locator);
        }
        catch (Exception e)
        {
            System.out.println("Element not Found");
        }
        return  element;

    }
    public static void clickOnItem(By locator)
    {
        findAndWaitForTheElement(locator).click();
    }
    public static void sendText(By locator, String text)
    {
        findAndWaitForTheElement(locator).sendKeys("a@b.com");
    }
    public static boolean visibilityCheck(By locator)
    {
        return findAndWaitForTheElement(locator).isDisplayed();
    }
    public static void selectFromDropDown(By locator, String text)
    {
        Select dropdown = new Select(findAndWaitForTheElement(locator));
        dropdown.selectByVisibleText(text);
    }
//    public static String getTabTitle()
//    {
//        return driver.getTitle();
//    }
    public static boolean tabTitleCheck(String expectedTitle)
    {
        String actualTitle = driver.getTitle();
        return actualTitle.equalsIgnoreCase(expectedTitle);
    }
}
