package pageObjects;

import org.openqa.selenium.By;
import utilities.ElementActions;

public class HomePage {
    public static By customerCurrency = By.id("customerCurrency");
    public static boolean checkCustomerCurrencyVisibility()
    {
        return ElementActions.visibilityCheck(customerCurrency);

    }
    public static void selectUSDFromCustomerCurrency()
    {
        ElementActions.selectFromDropDown(customerCurrency, "US Dollar");
    }
    public static void selectEuroFromCustomerCurrency()
    {
        ElementActions.selectFromDropDown(customerCurrency, "Euro");
    }
    public static By loginButton =By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    public static void clickOnLoginButton()
    {
        ElementActions.clickOnItem(loginButton);
    }

    public static By registrationButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    public static void clickOnRegistrationButton()
    {
        ElementActions.clickOnItem(registrationButton);
    }

    public static By logo = By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img");
    public static boolean checkLogoVisibility()
    {
        return ElementActions.visibilityCheck(logo);
    }



}
