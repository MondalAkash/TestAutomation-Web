import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestUserOrder {
    WebDriver driver;
    ChromeOptions options;
    String baseURL;
    Select dropdown;
    public GuestUserOrder()
    {
        options = new ChromeOptions();
        options.addArguments("disable-geolocation");
        options.addArguments("disable-notifications");
        options.addArguments("--disable-autofill-keyboard-accessory-view[8.0]");
        options.addArguments("--disable-save-address-bubble[8.0]");
        driver = new ChromeDriver(options);
        baseURL = "https://demo.nopcommerce.com/";
    }
    @Test
    public void TC001() throws InterruptedException
    {
        driver.get(baseURL);
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a")).click();
        WebElement qty = driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_20\"]"));
        qty.sendKeys(Keys.BACK_SPACE);
        qty.sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Blue");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Knight");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("blue.knight@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("BS-23");
        dropdown = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        dropdown.selectByVisibleText("Bangladesh");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Dhaka");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Dhaka");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Dhaka");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("1219");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01700000000");
        driver.findElement(By.name("save")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label")).click(); //save address popup
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("CardholderName")).sendKeys("BLUE KNIGHT");
        driver.findElement(By.name("CardNumber")).sendKeys("4556743665401647");
        dropdown = new Select(driver.findElement(By.id("ExpireMonth")));
        dropdown.selectByVisibleText("03");
        dropdown = new Select(driver.findElement(By.id("ExpireYear")));
        dropdown.selectByVisibleText("2029");
        driver.findElement(By.name("CardCode")).sendKeys("000");
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
        String expectedText = "Your order has been successfully processed!";
        System.out.println(actualText);
        Assert.assertEquals(actualText,expectedText);
        driver.close();


    }
}
