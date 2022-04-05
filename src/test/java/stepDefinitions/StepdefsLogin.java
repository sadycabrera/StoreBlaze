package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.apache.xpath.axes.OneStepIterator;
import questions.LoginQuestion;
import taks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class StepdefsLogin {



    @When("Se Loguea ingresando su {string} y {string}")
    public void seLogueaIngresandoSuY(String user, String pass) {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(user,pass));
    }

    @Then("Deberia ingresar con exito {string}")
    public void deberiaIngresarConExito(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(LoginQuestion.is(),equalTo(texto)));
    }
}
