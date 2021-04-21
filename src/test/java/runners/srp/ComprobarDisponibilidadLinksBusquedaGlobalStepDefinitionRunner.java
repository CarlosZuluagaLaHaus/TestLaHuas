package runners.srp;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/srp/comprobar_disponibilidad_links_busqueda_global.feature",
    glue = {"stepdefinitions"})
public class ComprobarDisponibilidadLinksBusquedaGlobalStepDefinitionRunner {}
