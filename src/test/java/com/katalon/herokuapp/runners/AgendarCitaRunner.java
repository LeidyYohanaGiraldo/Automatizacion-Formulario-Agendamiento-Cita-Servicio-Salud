package com.katalon.herokuapp.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agendarCita.feature",
        glue = "com.katalon.herokuapp.stepDefinitions",
        snippets = CAMELCASE
)

public class AgendarCitaRunner {
}
