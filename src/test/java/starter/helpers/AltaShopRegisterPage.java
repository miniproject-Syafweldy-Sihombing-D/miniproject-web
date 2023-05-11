package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://alta-shop.vercel.app/auth/register/")
public class AltaShopRegisterPage extends PageObject {

    public static Target NAMA_LENGKAP_FIELD = Target.the("field nama lengkap")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    public static Target EMAIL_FIELD_IN_REGISTERPG = Target.the("field email in register page")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");

    public static Target PASSWORD_FIELD_IN_REGISTERPG = Target.the("field password di register page")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");

    public static Target REGISTER_BUTTON = Target.the("button register")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[4]/button/span");
}
