package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFacturacion extends PageObject {
    public static final Target CAMPO_NOMBRES = Target.the("barra de busqueda")
            .located(By.id("client-first-name"));
    public static final Target CAMPO_APELLIDOS = Target.the("barra de busqueda")
            .located(By.id("client-last-name"));
    public static final Target CAMPO_CEDULA = Target.the("barra de busqueda")
            .located(By.id("client-document"));
    public static final Target CAMPO_TELEFONO = Target.the("barra de busqueda")
            .located(By.id("client-phone"));
    public static final Target CAMPO_SUSCRIPCION = Target.the("barra de busqueda")
            .located(By.id("opt-in-newsletter"));
    public static final Target CAMPO_ACEPTAR_TERMINOS = Target.the("barra de busqueda")
            .located(By.id("opt-in-terms-and-condition"));
    public static final Target BOTON_METODO_ENTREGA = Target.the("barra de busqueda")
            .located(By.id("go-to-shipping"));
    public static final Target CAMPO_RECOGER_EN_TIENDA= Target.the("barra de busqueda")
            .located(By.id("shipping-option-pickup-in-point"));
    public static final Target CAMPO_DIRECCION= Target.the("barra de busqueda")
            .located(By.id("ship-addressQuery"));



}
