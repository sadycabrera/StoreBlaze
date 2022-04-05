package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import page.StoreBlazePage;
import questions.RegistroQuestion;
import taks.Registro;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.Matchers.equalTo;



public class StepdefsRegistro {


    @Before
    public void setUp()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El {string} se encuentra en la pagina de la tienda online")
    public void elSeEncuentraEnLaPaginaDeLaTiendaOnline(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Open.browserOn().the(StoreBlazePage.class));
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().manage().window().maximize();
    }

    @When("Se registra ingresando su {string} y {string}")
    public void seRegistraIngresandoSuY(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.with(user,pass));
    }

    @Then("Deberia registrarse con exito {string}")
    public void deberiaRegistrarseConExito(String messageExpected) throws InterruptedException {
        Thread.sleep(5000);
        String mensaje = BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().switchTo().alert().getText();
        Assert.assertEquals(messageExpected,mensaje);
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getDriver().switchTo().alert().accept();

    }
}
