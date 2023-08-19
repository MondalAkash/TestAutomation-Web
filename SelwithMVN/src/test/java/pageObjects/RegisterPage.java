package pageObjects;
import org.openqa.selenium.By;
import utilities.ElementActions;
public class RegisterPage {
    public static String expectedTitle = "nopCommerce demo store. Register";

    public static boolean registerTabTitleCheck()
    {
        return ElementActions.tabTitleCheck(expectedTitle);
    }

}
