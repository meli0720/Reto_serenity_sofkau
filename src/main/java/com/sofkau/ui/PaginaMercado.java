package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaMercado extends PageObject {
    public static final Target OPCION_CAMBIAR = Target.the("campo opcion cambiar desapcho-direccion ")
            .located(By.id("handlerUbications"));
    public static final Target OPCION_RETIRO = Target.the("opcion retirar en tienda ")
            .located(By.xpath("//button[normalize-space()='Retiro en tienda']"));
    public static final Target OPCION_LUGAR = Target.the("campo elegir ciudad")
            .located(By.id("userProvince"));
    public static final Target OPCION_SABANETA= Target.the("opcion elegir sabaneta")
            .located(By.xpath("//option[@value='Sabaneta']"));
    public static final Target OPCION_AVES_MARIA = Target.the("opcion aves maria")
            .located(By.xpath("(//div[@class='colanta-full-components-0-x-colanta-stores-store'])[1]"));
    public static final Target BARRA_BUSQUEDA = Target.the("barra de busqueda")
            .located(By.xpath("//input[@id='downshift-0-input']"));
    public static final Target BOTON_ORDENAR = Target.the("Boton ordenar por ")
            .located(By.xpath("//button[contains(@class,'vtex-search-result-3-x-orderByButton ph3 pv5 mv0 pointer flex items-center justify-end bg-base c-on-base t-action--small bt br bl bb-0 br2 br--top bw1 w-100 outline-0 b--transparent pl1')]"));
    public static final Target OPCION_PRECIO_ALTO = Target.the("opcion ordenar por precio mas alto")
            .located(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[5]"));
    public static final Target QUESO= Target.the("producto queso mas caro")
            .located(By.xpath("(//article)[2]"));
    public static final Target BOTON_MAS= Target.the("Boton mas cantidad")
            .located(By.xpath("(//button[@aria-label='+'])[1]"));
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
            .located(By.xpath("(//button[@id='payment-data-submit'])[2]"));
    public static final Target CLICK_NOMBRE_QUESO = Target.the("opcion dar click en el nombre queso")
            .located(By.xpath("//span[normalize-space()='Queso Tipo Parmesano Colanta Rallado X 250 g']"));
    public static final Target CERRAR_ANUNCIO_CARRITO = Target.the("opcion cerrar anuncio")
            .located(By.xpath("//div[@class='fixed z-max overflow-hidden']"));
    public static final Target BTN_MAS_MI_PEDIDO = Target.the("opcion boton mas en el apartado Mi Pedido")
            .located(By.xpath("(//i[@class='icon icon-plus-sign'])[1]"));
    public static final Target BTN_DIV_FLECHA = Target.the("opcion div flecha")
            .located(By.xpath("(//select[@class='o-0 absolute top-0 left-0 h-100 w-100 bottom-0 t-body pointer'])[2]"));
    public static final Target BTN_MAS_CUATRO = Target.the("boton opcion cantidad 4 ")
            .located(By.xpath("(//option[@value='4'][normalize-space()='4'])[2]"));
    public static final Target BTN_CHULO = Target.the("boton opcion cantidad 4 ")
            .located(By.xpath("(//*[name()='svg'][@data-testid='sucessIcon'])[1]"));


}
