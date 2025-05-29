package com.katalon.herokuapp.questions;

import com.katalon.herokuapp.userInterface.MensajeAgendamientoCitaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionAgendamientoCita implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeAgendamientoCitaPage.MSJ_AGENDAMIENTO_CITA.resolveFor(actor).isVisible();
    }
    public static Question validarCita  (){
        return new ValidacionAgendamientoCita ();
    }
}
