package com.katalon.herokuapp.userInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeAgendamientoCitaPage {

    public static final Target MSJ_AGENDAMIENTO_CITA =
            Target.the("Mensaje Confirmacion de agendamiento de cita").located(By.xpath("//*[@id='summary']/div/div/div[1]/h2"));
}
