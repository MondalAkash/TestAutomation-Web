package pageObjects;

import org.openqa.selenium.By;

public class BS_23_Page {
    public static By electronicButton = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");
    public static By cellPhoneButton = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a");
    public static By lumiaPhone = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a");
    public static By quantityBox = By.id("product_enteredQuantity_20");
    public static By addToCartButton = By.id("add-to-cart-button-20");
    public static By shoppingCartButton = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    public static By agreeCheckBox = By.id("termsofservice");
    public static By checkOutButton = By.id("checkout");
    public static By checkOutAsGuestButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
    public static By firstName = By.id("BillingNewAddress_FirstName");
    public static By lastName = By.id("BillingNewAddress_LastName");
    public static By email = By.id("BillingNewAddress_Email");
    public static By company = By.id("BillingNewAddress_Company");
    public static By countryDropDown = By.id("BillingNewAddress_CountryId");
    public static By stateDropDown = By.id("BillingNewAddress_StateProvinceId");
    public static By city = By.id("BillingNewAddress_City");
    public static By address1 = By.id("BillingNewAddress_Address1");
    public static By postalCode = By.id("BillingNewAddress_ZipPostalCode");
    public static By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public static By continueButtonBillingAddress = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
    public static By radioButtonNextDayAir = By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label");
    public static By continueButtonShippingMethod = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    public static By radioButtonCreditCard = By.id("paymentmethod_1");
    public static By continueButtonPaymentMethod = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    public static By cardTypeDropDown = By.id("CreditCardType");
    public static By cardHolderName = By.id("CardholderName");
    public static By cardNumber = By.id("CardNumber");
    public static By cardExpireDateMonthDropDown = By.id("ExpireMonth");
    public static By cardExpireDateYearDropDown = By.id("ExpireYear");
    public static By cardCode = By.id("CardCode");
    public static By continueButtonPaymentInformation = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button");
    public static By confirmButtonPConfirmOrder = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button");
    public static By orderSuccessMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");


}
