package ui;

import net.serenitybdd.screenplay.targets.Target;

public class UILogin {
    public static String logIn = "#login2";
    public static String user = "#loginusername";
    public static String pass = "#loginpassword";
    public static String btnLogin = "#logInModal > div > div > div.modal-footer > button.btn.btn-primary";
    public static Target nameofuser = Target.the("login").locatedBy("#nameofuser");
}
