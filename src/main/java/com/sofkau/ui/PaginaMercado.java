package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaMercado extends PageObject {
    public static final Target OPCION_CAMBIAR = Target.the("retirar en tienda ")
            .located(By.id("handlerUbications"));
    public static final Target OPCION_RETIRO = Target.the("retirar en tienda ")
            .located(By.xpath("//button[normalize-space()='Retiro en tienda']"));
    public static final Target OPCION_LUGAR = Target.the("opcion elegir ciudad")
            .located(By.id("userProvince"));
    public static final Target OPCION_MEDELLIN = Target.the("opcion medellin")
            .located(By.xpath("//option[@value='Sabaneta']"));
    public static final Target OPCION_BUENOS_AIRES = Target.the("opcion buenos aires")
            .located(By.xpath("(//div[@class='colanta-full-components-0-x-colanta-stores-store'])[1]"));
    /////////////////////////////////////////////////
    public static final Target BARRA_BUSQUEDA = Target.the("barra de busqueda")
            .located(By.xpath("//input[@id='downshift-0-input']"));
    public static final Target BOTON_ORDENAR = Target.the("Boton ordenar por ")
            .located(By.xpath("//button[contains(@class,'vtex-search-result-3-x-orderByButton ph3 pv5 mv0 pointer flex items-center justify-end bg-base c-on-base t-action--small bt br bl bb-0 br2 br--top bw1 w-100 outline-0 b--transparent pl1')]"));
    public static final Target OPCION_PRECIO_ALTO = Target.the("opcion precio mas alto")
            .located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[5]"));
    public static final Target AVENA= Target.the("producto avena mas cara")
            .located(By.xpath("//div[@id='gallery-layout-container']//div[1]//section[1]//a[1]//article[1]"));
    public static final Target BOTON_MAS= Target.the("Boton mas cantidad")
            .located(By.xpath("//button[@aria-label='+']"));
    public static final Target BOTON_PIDELO = Target.the("Boton pedir" )
            .located(By.xpath("//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box ']"));
    public static final Target BOTON_CARRITO = Target.the("Boton ir a ver carrito")
            .located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/aside[1]/div[1]/div[1]/button[1]"));
    public static final Target BOTON_FINALIZAR_PEDIDO = Target.the("Boton ir a finalizar el pedido")
            .located(By.id("proceed-to-checkout"));
    public static final Target BOTON_IR_A_PAGAR = Target.the("Boton ir a pagar")
            .located(By.xpath("(//a[normalize-space()='Ir a pagar'])[1]"));
    public static final Target BOTON_PAGO_CONTRAENTREGA= Target.the("Boton pago contraentrega")
            .located(By.xpath("//span[normalize-space()='Pago contra entrega en Efectivo.']"));
    public static final Target BOTON_NOTAS_PEDIDO = Target.the("opcion notas sobre el pedido")
            .located(By.xpath("//textarea[@id='cart-note']"));
    public static final Target BOTON_PAGAR = Target.the("Boton pagar")
            .located(By.xpath("//div[@class='payment-confirmation-wrap']//button[1]"));
    public static final Target CLICK_NOMBRE_AVENA = Target.the("nombre avena")
            .located(By.xpath("//span[contains(text(),'Avena UHT Sabor a Canela Colanta Caja X 200 ml X 6')]"));
    public static final Target CERRAR_ANUNCIO_CARRITO = Target.the("nombre avena")
            .located(By.xpath("//div[@class='fixed z-max overflow-hidden']"));
}
