package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaLoguin.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Loguearse  implements Task {
    private String email;
    private String contrasenna;



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_EMAIL_CONTRA),
                Click.on(CORREO_OPCION),
                Enter.theValue(email).into(CORREO_OPCION),
                WaitUntil.the(CONTRASENNA_OPCION, isEnabled()).forNoMoreThan(7).seconds(),
                Click.on(CONTRASENNA_OPCION),
                Enter.theValue(contrasenna).into(CONTRASENNA_OPCION),
                Click.on(BOTON_ENTRAR)
        );

    }

    public Loguearse conElEmail(String email){
        this.email=email;
        return this;
    }

    public Loguearse yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }


    public static Loguearse loguearse(){
        return new Loguearse();
    }
}
