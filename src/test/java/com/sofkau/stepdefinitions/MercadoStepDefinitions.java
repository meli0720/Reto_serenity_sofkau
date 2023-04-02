package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.log4j.Logger;
import static com.sofkau.tasks.Loguearse.loguearse;
import static com.sofkau.tasks.Mercar.mercar;
import static com.sofkau.tasks.NavegarInicioSesion.navegarInicioSesion;
import static com.sofkau.ui.PaginaMercado.BTN_CHULO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class MercadoStepDefinitions extends Configuracion {
    public static org.apache.log4j.Logger LOGGER = Logger.getLogger(String.valueOf(MercadoStepDefinitions.class));
    @Dado("que estoy en la pagina web PideColanta")
    public void queEstoyEnLaPaginaWebPideColanta() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                   new AbrirPaginaWeb(),
                    navegarInicioSesion()
            );
        } catch (Exception e) {
            LOGGER.warn("Ha ocurrido un error" +e);
        }

    }

    @Dado("me he logueado correctamente")
    public void meHeLogueadoCorrectamente() {
        theActorInTheSpotlight().attemptsTo(
                loguearse()
                        .conElEmail("rominamene2023@gmail.com")
                        .yConLaContrasenna("Lupita01")

        );

    }

    @Cuando("agrego un producto a mi carrito y continuo todo el flujo de la compra")
    public void agregoUnProductoAMiCarritoYContinuoTodoElFlujoDeLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                mercar()
                        .ingresoElProductoAbuscar("parmesano")
                        .creoElMensajeDeAnexo("por favor entregar a mi abuela Rosita Acevedo")
                        .ingresoNombre("Romina Melissa")
                        .ingresoApellido("Meneses")
                        .ingresoCedula("1000756214")
                        .ingresoTelefono("3127357860")
                        .ingresoElDestinatario("Romina Meneses Sepulveda")
        );

    }

    @Entonces("deberia ver un mensaje de confirmacion de compra exitosa")
    public void deberiaVerUnMensajeDeConfirmacionDeCompraExitosa() {
        WebElementFacade boton = BTN_CHULO.resolveFor(theActorInTheSpotlight());
        boton.shouldBeVisible();
        quitarDriver();

    }
}
