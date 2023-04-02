package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.sofkau.ui.PaginaFacturacion.BTN_COMPRA_EXITOSA;

public class MensajeOrder implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BTN_COMPRA_EXITOSA.resolveFor(actor).getText();
    }
    public static MensajeOrder mensajeOrder(){
        return new MensajeOrder();
    }
}
