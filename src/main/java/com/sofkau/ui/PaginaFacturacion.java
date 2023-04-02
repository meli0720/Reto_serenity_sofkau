package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFacturacion extends PageObject {
    public static final Target CAMPO_NOMBRES = Target.the("campo nombre formulario")
            .located(By.id("client-first-name"));
    public static final Target CAMPO_APELLIDOS = Target.the("campo apellido formulario ")
            .located(By.id("client-last-name"));
    public static final Target CAMPO_CEDULA = Target.the("campo cedula formulario")
            .located(By.id("client-document"));
    public static final Target CAMPO_TELEFONO = Target.the("campo telefono formulario")
            .located(By.id("client-phone"));
    public static final Target CAMPO_SUSCRIPCION = Target.the("campo suscripcion formulario")
            .located(By.id("opt-in-newsletter"));
    public static final Target CAMPO_ACEPTAR_TERMINOS = Target.the("campo terminos y condicones formulario")
            .located(By.id("opt-in-terms-and-condition"));
    public static final Target BOTON_METODO_ENTREGA = Target.the("boton elegir el metodo de entrega")
            .located(By.xpath("//button[@id='go-to-shipping']"));
    public static final Target CAMPO_DESTINATARIO= Target.the("campo destinatario formulario")
            .located(By.xpath("//input[@id='ship-receiverName']"));
    public static final Target CAMPO_AYUDA= Target.the("campo ayuda formulario")
            .located(By.xpath("//span[@data-i18n='paymentData.payment']"));
    public static final Target CAMPO_CAMBIO_DESPACHO= Target.the("campo cambiar de despacho")
            .located(By.xpath("//button[@class='vtex-front-messages-close-all close']//*[name()='svg']"));
    public static final Target BTN_SELECCION_METODO_PAGO= Target.the("boton seleccionar metodo de pago")
            .located(By.xpath("//button[@id='btn-go-to-payment']"));
    public static final Target BTN_COMPRA_EXITOSA= Target.the("boton validar compra")
            .located(By.xpath("(//div[@class='vtex-flex-layout-0-x-flexColChild pb0'])[6]"));




}
