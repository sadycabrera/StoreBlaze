package ui;

import net.serenitybdd.screenplay.targets.Target;

public class UICompra {
    public static String producto = "//*[text()='nombreProducto']";
    public static Target productoCarrito = Target.the("nombre").locatedBy("#tbodyid > tr > td:nth-child(2)");
    public static Target precio = Target.the("precio").locatedBy("#tbodyid > tr > td:nth-child(3)");
    public static String btnAdd = "#tbodyid > div.row > div > a";
    public static String card = "#cartur";


}
