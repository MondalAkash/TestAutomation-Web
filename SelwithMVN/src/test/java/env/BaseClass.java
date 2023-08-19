package env;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
    public static WebDriver driver;

    @BeforeMethod
    public void initializeDrive()
    {
        String URL = "https://demo.nopcommerce.com/";
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--disable-notifications");
        driver = new ChromeDriver(op);
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }


}
