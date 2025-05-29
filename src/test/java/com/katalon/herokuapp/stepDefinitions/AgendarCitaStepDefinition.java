package com.katalon.herokuapp.stepDefinitions;


import com.katalon.herokuapp.exceptions.ResultadoNoEsperado;
import com.katalon.herokuapp.questions.ValidacionAgendamientoCita;
import com.katalon.herokuapp.tasks.AgendarCita;
import com.katalon.herokuapp.userInterface.AgendarCitaPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgendarCitaStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor pepito = Actor.named("pepito");

    private AgendarCitaPage agendarCitaPage = new AgendarCitaPage();

    @Before
    public void configuracion() {
        pepito.can(
                BrowseTheWeb.with(navegador));
    }

    @Dado("^que el usuario se encuentra en la pagina web de agendamiento de citas$")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeAgendamientoDeCitas() {

        pepito.wasAbleTo(
                Open.browserOn(agendarCitaPage)
        );
    }


    @Cuando("^Cuando complete los campos del formulario de agendamiento de citas, realice clic en el boton de reserva de cita$")
    public void cuandoCompleteLosCamposDelFormularioDeAgendamientoDeCitasRealiceClicEnElBotonDeReservaDeCita() {
        pepito.attemptsTo(
                AgendarCita.informacion());
    }

    @Entonces("^debera visualizar un mensaje de confirmacion de la cita$")
    public void deberaVisualizarUnMensajeDeConfirmacionDeLaCita() {
        pepito.should(seeThat("El suario puede ver un mensaje de comprobacion",
                ValidacionAgendamientoCita.validarCita(), Matchers.equalTo(true)).orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.NO_HAY_CITA));
    }


}
