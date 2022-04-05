package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.CompraQuestion;
import taks.AgregaProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
public class StepdefsCompra {
    @When("Agrega el producto {string}")
    public void agregaElProducto(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregaProducto.withName(producto));
    }

    @Then("Deberia agregarse el {string} y el {string}")
    public void deberiaAgregarseElYEl(String producto, String precio) {
        OnStage.theActorInTheSpotlight().should(seeThat(CompraQuestion.productNameIs(),equalTo(producto)));
        OnStage.theActorInTheSpotlight().should(seeThat(CompraQuestion.priceIs(),equalTo(precio)));
    }
}
