package starter.helpers;

import com.google.gson.annotations.Until;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DoAnAction {

    public static Performable fillNamaLengkapWithValue(String NamaLengkap) {
        return Task.where("{0} fill nama lengkap with " + NamaLengkap, Enter.theValue(NamaLengkap)
                .into(AltaShopRegisterPage.NAMA_LENGKAP_FIELD));
//                .then(WaitUntil.the(AltaShopPage.NAMA_LENGKAP_FIELD, isCurrentlyVisible())
//                        .forNoMoreThan(Duration.ofSeconds(50))));
    }

    public static Performable fillEmailInRegisterPGWithValue(String EmailRG)  {
        return Task.where("{0} fill email in register page with " + EmailRG, Enter.theValue(EmailRG)
                .into(AltaShopRegisterPage.EMAIL_FIELD_IN_REGISTERPG));
//                .then(WaitUntil.the(AltaShopPage.EMAIL_FIELD, isCurrentlyVisible())
//                        .forNoMoreThan(Duration.ofSeconds(50))));
    }

    public static Performable fillPasswordInRegisterPGWithValue(String PasswordRG) {
        return Task.where("{0} fill password with " + PasswordRG, Enter.theValue(PasswordRG)
                .into(AltaShopRegisterPage.PASSWORD_FIELD_IN_REGISTERPG));
//                .then(WaitUntil.the(AltaShopPage.PASSWORD_FIELD, isCurrentlyVisible())
//                        .forNoMoreThan(Duration.ofSeconds(50))));
    }
    public static Performable clickRegisterInButton() {
        return Task.where("{0} click register in button",
                Click.on(AltaShopRegisterPage.REGISTER_BUTTON));
//                        .then(WaitUntil.the(AltaShopPage.REGISTER_BUTTON, isCurrentlyVisible())
//                                .forNoMoreThan(Duration.ofSeconds(15))));
    }
    public static Performable clickAccountInButton() {
        return Task.where("{0} click account in button",
                Click.on(AltaShopPage.ACCOUNT_BUTTON));
    }
    public static Performable fillEmailWithValue(String Email) {
        return Task.where("{0} fill email with " + Email, Enter.theValue(Email)
                .into(AltaShopPage.EMAIL_FIELD));
    }

    public static Performable fillIncorrectEmailWithValue(String IncorrectEmail) {
        return Task.where("{0} fill incorrect email with " + IncorrectEmail, Enter.theValue(IncorrectEmail)
                .into(AltaShopPage.EMAIL_FIELD));
    }
    public static Performable fillPasswordWithValue(String Password) {
        return Task.where("{0} fill password with " + Password, Enter.theValue(Password)
                .into(AltaShopPage.PASSWORD_FIELD));
    }
    public static Performable clickLoginInButton() {
        return Task.where("{0} click login in button",
                Click.on(AltaShopPage.LOGIN_BUTTON));
    }
    public static Performable clickLogoutInButton() {
        return Task.where("{0} click logout in button",
                Click.on(AltaShopPage.LOGOUT_BUTTON));
    }
    public static Performable clickDetailProductSuryaInButton() {
        return Task.where("{0} click detail product surya in button",
                Click.on(AltaShopPage.DETAIL_PRODUCT_SURYA_BUTTON));
    }
    public static Performable clickBeliProductSuryaInButton() {
        return Task.where("{0} click beli product surya in button",
                Click.on(AltaShopPage.BELI_PRODUCT_SURYA_BUTTON));
    }
    public static Performable clickCartProductInButton() {
        return Task.where("{0} click cart product in button",
                Click.on(AltaShopPage.CART_BUTTON));
    }
    public static Performable clickBayarInButton () {
        return Task.where("{0} click bayar product in button",
                Click.on(AltaShopPage.BAYAR_BUTTON));
    }
    public static Performable clickTransaksiInButton () {
        return Task.where("{0} click transaksi in button",
                Click.on(AltaShopPage.TRANSAKSI_BUTTON));
    }

    public static Performable clickAddStarRatingProductInButton() {
        return Task.where("{0} click add star rating product Surya",
                Click.on(AltaShopPage.ADD_STAR_RATING_PRODUCT));
    }
}
