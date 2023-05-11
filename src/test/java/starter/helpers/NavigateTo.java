package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaShopRegisterPage() {
        return Task.where("{0} opens the AltaShop register page", Open.browserOn().the(AltaShopRegisterPage.class));
    }

    public static Performable theAltaShopPage() {
        return Task.where("{0} opens the AltaShop Page", Open.browserOn().the(AltaShopPage.class));
    }

}
