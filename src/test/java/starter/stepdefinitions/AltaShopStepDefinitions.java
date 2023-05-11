package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class AltaShopStepDefinitions {
//    Dotenv dotenv = Dotenv.load();
    @Given("{actor} is on AltaShop register Page")
    public void userIsOnAltaShopRegisterPage (Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopRegisterPage());
    }

    @When("{actor} input correct Nama Lengkap {string}")
    public void userInputCorrectNamaLengkap(Actor actor, String NamaLengkap) {
        actor.attemptsTo(DoAnAction.fillNamaLengkapWithValue(NamaLengkap));
    }

    @And("{actor} input correct Email {string}")
    public void userInputCorrectEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.fillEmailInRegisterPGWithValue(Email));
    }

    @And("{actor} input correct Password {string}")
    public void userInputCorrectPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.fillPasswordInRegisterPGWithValue(Password));
    }

    @Then("{actor} click register button")
    public void userClickRegister(Actor actor) {
        actor.attemptsTo(DoAnAction.clickRegisterInButton());
    }

    @Given("{actor} is on home page")
    public void userIsOnHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopPage());
    }

    @When("{actor} click button account")
    public void userClickButtonAccount(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAccountInButton());
    }

    @And("{actor} input a correct Email {string}")
    public void userInputACorrectEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.fillEmailWithValue(Email));
    }

    @And("{actor} input a correct Password {string}")
    public void userInputACorrectPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.fillPasswordWithValue(Password));
    }

    @And("{actor} click button login")
    public void userClickButtonLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLoginInButton());
    }

    @And("{actor} input a incorrect Email {string}")
    public void userInputAIncorrectEmail(Actor actor, String IncorrectEmail) {
        actor.attemptsTo(DoAnAction.fillIncorrectEmailWithValue(IncorrectEmail));
    }

    @Then("{actor} click button logout")
    public void userClickButtonLogout(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLogoutInButton());
    }

    @And("{actor} click button detail product Surya")
    public void userClickButtonDetailProductSurya(Actor actor) {
        actor.attemptsTo(DoAnAction.clickDetailProductSuryaInButton());
    }

    @And("{actor} click button Beli on a product")
    public void userClickButtonBeliOnAProduct(Actor actor) {
        actor.attemptsTo(DoAnAction.clickBeliProductSuryaInButton());
    }

    @And("{actor} click button cart")
    public void userClickCartButtonCart(Actor actor) {
        actor.attemptsTo(DoAnAction.clickCartProductInButton());
    }

    @Then("{actor} click button Bayar")
    public void userClickButtonBayar(Actor actor) {
        actor.attemptsTo(DoAnAction.clickBayarInButton());
    }

    @Then("{actor} click button Transaksi")
    public void userClickButtonTransaksi(Actor actor) {
        actor.attemptsTo(DoAnAction.clickTransaksiInButton());
    }

    @Then("{actor} add star rating product")
    public void userAddStarRatingProduct(Actor actor) {
        actor.attemptsTo(DoAnAction.clickAddStarRatingProductInButton());
    }

    @Then("{actor} directed to home page")
    public void userDirectedToHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopPage());
    }


//    @Then("{actor} directed to login page")
//    public void userDirectedToLoginPage(Actor actor) {
//        Target LoginTitle = Target.the("Login title").located(By.xpath("//*[@id=\"app\"]/div/main/div"));
//        actor.attemptsTo(WaitUntil.the(LoginTitle, isCurrentlyVisible()).forNoMoreThan(Duration.ofSeconds(30)));
//    }

//    @And("{actor} click register button in login page")
//    public void userClickRegisterButtonInLoginPage(Actor actor) {
//        actor.attemptsTo(DoAnAction.clickRegisterButtonInLoginPage());
//    }
}
