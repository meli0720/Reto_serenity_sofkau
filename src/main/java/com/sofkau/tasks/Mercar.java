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
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Mercar implements Task {
    private String mensaje;
    private String producto_avena;
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BARRA_BUSQUEDA),
                Enter.theValue(producto_avena).into(BARRA_BUSQUEDA),
                Hit.the(Keys.ENTER).into(BARRA_BUSQUEDA),
                Click.on(BOTON_ORDENAR),
                Click.on(OPCION_PRECIO_ALTO),
                Scroll.to(AVENA),
                Click.on(CLICK_NOMBRE_AVENA),
                WaitUntil.the(BOTON_MAS, isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(BOTON_MAS),
                Click.on(BOTON_MAS),
                Click.on(BOTON_MAS),
                Click.on(OPCION_CAMBIAR),
                Click.on(OPCION_RETIRO),
                Click.on(OPCION_LUGAR),
                Click.on(OPCION_MEDELLIN),
                WaitUntil.the(OPCION_BUENOS_AIRES, isEnabled()).forNoMoreThan(9).seconds(),
                Click.on(OPCION_BUENOS_AIRES),
                WaitUntil.the(BOTON_PIDELO, WebElementStateMatchers.isVisible()),
                Click.on(BOTON_PIDELO),
                WaitUntil.the(BOTON_CARRITO, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CARRITO),
                WaitUntil.the(BOTON_FINALIZAR_PEDIDO, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(BOTON_FINALIZAR_PEDIDO),
                WaitUntil.the(BOTON_IR_A_PAGAR, isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(BOTON_IR_A_PAGAR),
                WaitUntil.the(CAMPO_NOMBRES, isEnabled()).forNoMoreThan(6).seconds(),
                Click.on(CAMPO_NOMBRES),
                Enter.theValue(nombre).into(CAMPO_NOMBRES),
                Click.on(CAMPO_APELLIDOS),
                Enter.theValue(apellido).into(CAMPO_APELLIDOS),
                Click.on(CAMPO_CEDULA),
                Enter.theValue(cedula).into(CAMPO_CEDULA),
                Click.on(CAMPO_TELEFONO),
                Enter.theValue(telefono).into(CAMPO_TELEFONO),
                Click.on(CAMPO_SUSCRIPCION),
                Click.on(CAMPO_ACEPTAR_TERMINOS),
                Click.on(BOTON_METODO_ENTREGA),
                Scroll.to(BOTON_PAGO_CONTRAENTREGA),
                Click.on(BOTON_PAGO_CONTRAENTREGA),
                Click.on(BOTON_NOTAS_PEDIDO),
                Enter.theValue(mensaje).into(BOTON_NOTAS_PEDIDO),
                Click.on(BOTON_PAGAR)

        );


    }

    public  Mercar ingresoElProductoAbuscar(String producto_avena){
        this.producto_avena= producto_avena;
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
