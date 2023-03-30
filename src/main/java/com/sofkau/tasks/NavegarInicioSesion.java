package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaLoguin.BOTON_MI_PERFIL;
import static com.sofkau.ui.PaginaLoguin.QUITAR_OPCION;

public class NavegarInicioSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(QUITAR_OPCION),
                Click.on(BOTON_MI_PERFIL)
        );
    }
    public static NavegarInicioSesion navegarInicioSesion(){
        return new NavegarInicioSesion();
    }
}
