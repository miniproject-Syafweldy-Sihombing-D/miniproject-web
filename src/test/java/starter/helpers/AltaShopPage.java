package starter.helpers;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://alta-shop.vercel.app/")
public class AltaShopPage extends PageObject {

    public static Target ACCOUNT_BUTTON = Target.the("button account")
            .locatedBy("/html/body/div/div/header/div/button[2]/span/i");
    public static Target EMAIL_FIELD = Target.the("field email")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");

    public static Target PASSWORD_FIELD = Target.the("field password")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");

    public static Target LOGIN_BUTTON = Target.the("button login")
            .locatedBy("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span");

    public static Target LOGOUT_BUTTON = Target.the("button logout")
            .locatedBy("/html/body/div/div[2]/div/div[2]/div[2]");

    public static Target DETAIL_PRODUCT_SURYA_BUTTON = Target.the("button detail product")
            .locatedBy("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]/span");

    public static Target BELI_PRODUCT_SURYA_BUTTON = Target.the("button beli product")
            .locatedBy("/html/body/div/div/main/div/div/div[2]/div/div[17]/div/div[3]/div[2]/button[2]/span");

    public static Target CART_BUTTON = Target.the("button cart")
            .locatedBy("/html/body/div/div/header/div/button[1]/span/span/i");

    public static Target BAYAR_BUTTON = Target.the("button bayar")
            .locatedBy("/html/body/div/div/main/div/div/div[2]/button/span");

    public static Target TRANSAKSI_BUTTON = Target.the("button transaksi")
            .locatedBy("/html/body/div/div[2]/div/div[1]/div[2]");

    public static Target ADD_STAR_RATING_PRODUCT = Target.the("button add 5 star product")
            .locatedBy("/html/body/div/div/main/div/div/div/div/div/div/div/button[5]");

}
