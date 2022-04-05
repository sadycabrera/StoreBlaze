package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.UIRegistro;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.UIRegistro.signUp;

public class Registro implements Task {

    private String user;
    private String pass;

    public Registro(String user, String pass)
    {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(signUp));
        actor.attemptsTo(Enter.keyValues(user).into(UIRegistro.user));
        actor.attemptsTo(Enter.keyValues(pass).into(UIRegistro.pass));
        actor.attemptsTo(Click.on(UIRegistro.btnRegistro));
    }

    public static Performable with(String usuario, String password)
    {
        return instrumented(Registro.class,usuario,password);
    }
}
