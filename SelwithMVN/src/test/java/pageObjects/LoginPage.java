package pageObjects;

import utilities.ElementActions;

public class LoginPage {
    public static String expectedTitle = "nopCommerce demo store. Login";

    public static boolean loginTabTitleCheck()
    {
        return ElementActions.tabTitleCheck(expectedTitle);
    }
}
