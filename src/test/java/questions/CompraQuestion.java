package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import static ui.UICompra.precio;
import static ui.UICompra.productoCarrito;

public class CompraQuestion {


    public static Question<String> productNameIs()
    {
       return actor -> productoCarrito.resolveFor(OnStage.theActorInTheSpotlight()).waitUntilVisible().getText();
    }

    public static Question<String> priceIs()
    {
        return actor -> precio.resolveFor(OnStage.theActorInTheSpotlight()).waitUntilVisible().getText();
    }

}
