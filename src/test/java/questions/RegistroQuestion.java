package questions;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import org.yecht.Data;

public class RegistroQuestion implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {

        return BrowseTheWeb.as(OnStage.theActorInTheSpotlight()).getAlert().getText();
    }

    public static Question<String> messageRegistro()
    {
        return new RegistroQuestion();
    }


}
