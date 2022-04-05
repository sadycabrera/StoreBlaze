package taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import ui.UICompra;

import java.text.BreakIterator;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregaProducto implements Task {

    private String nombreProducto;

    public AgregaProducto(String nombreProducto)
    {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UICompra.producto.replaceAll("nombreProducto",nombreProducto)));
        actor.attemptsTo(Click.on(UICompra.btnAdd));
        BrowseTheWeb.as(actor).getAlert().accept();
        actor.attemptsTo(Click.on(UICompra.card));
    }

    public static Performable withName(String nombreProducto)
    {
        return instrumented(AgregaProducto.class,nombreProducto);
    }
}
