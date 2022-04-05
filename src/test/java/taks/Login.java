package taks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.UILogin;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private String user;
    private String pass;

    public Login(String user, String pass)
    {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UILogin.logIn));
        actor.attemptsTo(Enter.keyValues(user).into(UILogin.user));
        actor.attemptsTo(Enter.keyValues(pass).into(UILogin.pass));
        actor.attemptsTo(Click.on(UILogin.btnLogin));
    }

    public static Performable with(String usuario, String password)
    {
        return instrumented(Login.class,usuario,password);
    }
}
