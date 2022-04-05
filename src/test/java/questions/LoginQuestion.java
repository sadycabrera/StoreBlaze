package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;

import static ui.UILogin.nameofuser;

public class LoginQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return nameofuser.resolveFor(actor).waitUntilVisible().getText();
    }

    public static Question<String> is()
    {
        return new LoginQuestion();
    }
}
