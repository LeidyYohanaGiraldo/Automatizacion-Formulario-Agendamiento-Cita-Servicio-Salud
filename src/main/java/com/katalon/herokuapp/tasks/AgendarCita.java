package com.katalon.herokuapp.tasks;

import com.katalon.herokuapp.utils.DatosExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.io.IOException;

import static com.katalon.herokuapp.userInterface.AgendarCitaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgendarCita implements Task {
    DatosExcel datosExcel = new DatosExcel();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(

                    Enter.theValue(datosExcel.leerDatosExcel("DataFormularioCitas.xlsx", "DatosLogin",1,0)).into(TXT_USERNAME),
                    Enter.theValue(datosExcel.leerDatosExcel("DataFormularioCitas.xlsx", "DatosLogin",1,1)).into(TXT_PASSWORD),
                    Click.on(BTN_LOGIN),
                    SelectFromOptions.byVisibleText(datosExcel.leerDatosExcel("DataFormularioCitas.xlsx", "CentroMedico", 1, 0)).from(LST_INSTALACION),
                    Click.on(BTN_REINGRESO_HOSPITALARIO),
                    Click.on(BTN_SEGURO_ENFERMEDAD),
                    Click.on(TXT_DIA),
                    Click.on(RDO_SELECCION_FECHA),
                    Enter.theValue(datosExcel.leerDatosExcel("DataFormularioCitas.xlsx", "CentroMedico",1,1)).into(TXT_COMENTARIO),
                    Click.on(BTN_RESERVAR_CITA)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static AgendarCita informacion(){
        return instrumented(AgendarCita.class);
    }


}
