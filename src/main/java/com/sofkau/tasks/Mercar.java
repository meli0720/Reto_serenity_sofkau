package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaFacturacion.*;
import static com.sofkau.ui.PaginaLoguin.BOTON_MI_PERFIL;
import static com.sofkau.ui.PaginaLoguin.CONTRASENNA_OPCION;
import static com.sofkau.ui.PaginaMercado.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Mercar implements Task {
    private String mensaje;
    private String producto_queso;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String destinatario;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BARRA_BUSQUEDA),
                Enter.theValue(producto_queso).into(BARRA_BUSQUEDA),
                Hit.the(Keys.ENTER).into(BARRA_BUSQUEDA),
                Click.on(BOTON_ORDENAR),
                Click.on(OPCION_PRECIO_ALTO),
                Scroll.to(QUESO),
                WaitUntil.the(CLICK_NOMBRE_QUESO, isVisible()),
                Click.on(CLICK_NOMBRE_QUESO),
                WaitUntil.the(OPCION_CAMBIAR, isVisible()),
                Click.on(OPCION_CAMBIAR),
                Click.on(OPCION_RETIRO),
                Click.on(OPCION_LUGAR),
                Click.on(OPCION_SABANETA),
                WaitUntil.the(OPCION_AVES_MARIA, isEnabled()).forNoMoreThan(9).seconds(),
                Click.on(OPCION_AVES_MARIA),
                WaitUntil.the(BOTON_PIDELO, isVisible()),
                Click.on(BOTON_PIDELO),
                WaitUntil.the(BOTON_CARRITO, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CARRITO),
                WaitUntil.the(BOTON_FINALIZAR_PEDIDO, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BOTON_FINALIZAR_PEDIDO),
                Click.on(BTN_MAS_MI_PEDIDO),
                WaitUntil.the(BOTON_IR_A_PAGAR, isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(BOTON_IR_A_PAGAR),
                WaitUntil.the(CAMPO_CAMBIO_DESPACHO, isVisible()),
                Click.on(CAMPO_CAMBIO_DESPACHO),
                Scroll.to(BOTON_PAGO_CONTRAENTREGA),
                Click.on(BOTON_PAGO_CONTRAENTREGA),
                Click.on(BOTON_NOTAS_PEDIDO),
                Enter.theValue(mensaje).into(BOTON_NOTAS_PEDIDO),
                Click.on(BOTON_PAGAR),
                WaitUntil.the(BTN_COMPRA_EXITOSA, isVisible()),
                Scroll.to(BTN_COMPRA_EXITOSA)

        );


    }

    public  Mercar ingresoElProductoAbuscar(String producto_queso){
        this.producto_queso= producto_queso;
        return this;
    }
    public  Mercar ingresoElDestinatario(String destinatario){
        this.destinatario= destinatario;
        return this;
    }
    public  Mercar creoElMensajeDeAnexo(String mensaje){
        this.mensaje= mensaje;
        return this;
    }
    public  Mercar ingresoNombre(String nombre){
        this.nombre= nombre;
        return this;
    }
    public  Mercar ingresoApellido(String apellido){
        this.apellido= apellido;
        return this;
    }
    public  Mercar ingresoCedula(String cedula){
        this.cedula= cedula;
        return this;
    }
    public  Mercar ingresoTelefono(String telefono){
        this.telefono= telefono;
        return this;
    }
    public static Mercar mercar(){
        return new Mercar();
    }

}
