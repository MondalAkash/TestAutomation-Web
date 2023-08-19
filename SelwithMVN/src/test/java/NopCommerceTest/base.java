package NopCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
    public static WebDriver driver;
    @BeforeMethod
    public void GoToURL() throws InterruptedException {
        String baseURL = "https://demo.nopcommerce.com/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
