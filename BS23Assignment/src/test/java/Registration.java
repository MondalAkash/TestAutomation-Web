import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration {
    WebDriver driver;
    String baseURL;
    Select dropDown;
    @Test(dataProvider="credentials")
    public void RegistrationTC001(String gender, String dobDay, String dobMon, String dobYear, String email, String companyName, String status, String password) throws InterruptedException
    {
        driver = new ChromeDriver();
        baseURL = "https://demo.nopcommerce.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        if(gender ==  "Male")
        {
            //Thread.sleep(5000);
            driver.findElement(By.id("gender-male")).click();
        }
        else if(gender == "Female")
        {
            //Thread.sleep(5000);
            driver.findElement(By.id("gender-female")).click();
        }
        System.out.println(dobYear);
        driver.findElement(By.id("FirstName")).sendKeys("Blue");
        //Thread.sleep(5000);
        driver.findElement(By.id("LastName")).sendKeys("Knight");
        //Thread.sleep(5000);
        dropDown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dropDown.selectByValue(dobDay);
        //Thread.sleep(5000);
        dropDown = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        //dropDown = new Select(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")));
        dropDown.selectByValue(dobMon);
        //Thread.sleep(5000);
        dropDown = new Select(driver.findElement(By.name("DateOfBirthYear")));
        dropDown.selectByValue(dobYear);
        //Thread.sleep(5000);
        driver.findElement(By.id("Email")).sendKeys(email);
        Thread.sleep(10000);
        driver.findElement(By.id("Company")).sendKeys(companyName);
        if(status == "unchecked")
        {
            Thread.sleep(5000);
            driver.findElement(By.id("Newsletter")).click();
        }
        //Thread.sleep(5000);
        driver.findElement(By.id("Password")).sendKeys(password);
        //Thread.sleep(5000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        //Thread.sleep(5000);
        driver.findElement(By.id("register-button")).click();
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(5000);
        driver.close();
    }
    @DataProvider(name = "credentials")
    public Object[][] dataset1()
    {
        return new Object[][]{
                {"Male", "20", "5","1995" , "x@1.com", "Brainstation-23", "checked", "pass@1234"},
                {"Female", "9", "5","1999", "y@2.com", "Brainstation-23", "unchecked", "pass@1234"},
                {"Female", "3", "5","2000", "z@3.com", "Brainstation-23", "unchecked", "pass@1234"},
                {"Male", "2", "5","2001", "a@4.com", "Brainstation-23", "checked", "pass@1234"},
                {"Female", "10", "5","1990", "b@5.com", "Brainstation-23", "unchecked", "pass@1234"}

        };
    }
}
