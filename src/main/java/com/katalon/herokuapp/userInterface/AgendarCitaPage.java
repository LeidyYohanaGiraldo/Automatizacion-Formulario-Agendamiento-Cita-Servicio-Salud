package com.katalon.herokuapp.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://katalon-demo-cura.herokuapp.com/profile.php#login")

public class AgendarCitaPage extends PageObject {

    public static final Target TXT_USERNAME = Target.the("Ingresar nombre usuario").located(By.id("txt-username"));
    public static final Target TXT_PASSWORD = Target.the("Ingresar Password").located(By.id("txt-password"));
    public static final Target BTN_LOGIN = Target.the("Clic boton Login").located(By.id("btn-login"));
    public static final Target LST_INSTALACION = Target.the("seleccion instalacion donde sera atendido").located(By.id("combo_facility"));
    public static final Target BTN_REINGRESO_HOSPITALARIO = Target.the("Clic boton solicitud reingreso hospitalario").located(By.id("chk_hospotal_readmission"));
    public static final Target BTN_SEGURO_ENFERMEDAD = Target.the("Clic boton seguro de enfermedad").located(By.id("radio_program_medicaid"));
    public static final Target TXT_DIA = Target.the("Ingresar para seleccionar la fecha de visita ").located(By.id("txt_visit_date"));
    public static final Target RDO_SELECCION_FECHA = Target.the("Seleccion fecha de visita ").located(By.xpath("//td[@class='day' and text()='18']"));
    public static final Target TXT_COMENTARIO = Target.the("Escribir un comentario ").located(By.id("txt_comment"));
    public static final Target BTN_RESERVAR_CITA = Target.the("Clic boton seleccionar cita ").located(By.id("btn-book-appointment"));

}
