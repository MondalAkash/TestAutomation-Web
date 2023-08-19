package testCases;

import env.BaseClass;
import net.bytebuddy.jar.asm.ClassTooLargeException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;

public class HomePageTest extends BaseClass {
    @Test(description = "Customer Currency Check")
    public void TC001() throws InterruptedException
    {
        Assert.assertTrue(HomePage.checkCustomerCurrencyVisibility());
        HomePage.selectEuroFromCustomerCurrency();
        Thread.sleep(5000);
        HomePage.selectUSDFromCustomerCurrency();
    }

    @Test(description = "Register Button Check")
    public void TC002() throws InterruptedException
    {
        HomePage.clickOnRegistrationButton();
        Thread.sleep(3000);
        Assert.assertTrue(RegisterPage.registerTabTitleCheck());
    }

    @Test(description = "Login Button Check")
    public void TC003() throws InterruptedException
    {
        HomePage.clickOnLoginButton();
        Thread.sleep(3000);
        Assert.assertTrue(LoginPage.loginTabTitleCheck());
    }
    //Wishlist Button Check
    //Shopping Cart Check
    @Test(description = "Logo Visibility Check")
    public void TC004() throws InterruptedException
    {
        Assert.assertTrue(HomePage.checkLogoVisibility());
    }



}
