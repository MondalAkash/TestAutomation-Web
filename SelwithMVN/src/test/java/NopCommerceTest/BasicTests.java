package NopCommerceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTests extends base{
    @Test(description = "NopCommerce Logo visibility Check")
    public void TC001() throws InterruptedException {
        boolean image = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
        Thread.sleep(5000);
        System.out.println("Logo Visiblity: " + image);

    }

    @Test(description = "Tab Title Check")
    public void TC002() throws InterruptedException {
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: "+actualTitle);
        String expectedTitle = "nopCommerce demo store";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(description = "Search URL Check")
    public void TC003() throws InterruptedException {
        driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        Thread.sleep(3000);
        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = "https://demo.nopcommerce.com/search?q=Computer";
        Assert.assertEquals(actualURL, expectedURL);
        String actualText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")).getText();
        String expectedTest = "Search";
        Assert.assertEquals(actualText, expectedTest);
    }
    @Test(description = "Hover Action & select items")
    public void TC004()
    {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        action.moveToElement(element).perform();
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        WebElement el = driver.findElement(By.id("product_enteredQuantity_20"));
        el.clear();
        el.sendKeys("2");
        driver.findElement(By.id("add-to-cart-button-20")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }

}
