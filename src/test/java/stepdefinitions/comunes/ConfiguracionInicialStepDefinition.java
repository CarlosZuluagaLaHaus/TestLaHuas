package stepdefinitions.comunes;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.Before;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.util.EnvironmentVariables;
import utils.applicationproperties.ConfiguracionVariablesProperties;

public class ConfiguracionInicialStepDefinition {

  EnvironmentVariables environmentVariable;
  String urlBase = null;

  @Before(order = 0)
  public void configurarUrlBase() {
    final String RUTA_URL = ConfiguracionVariablesProperties.getHost();
    environmentVariable = Injectors.getInjector().getInstance(EnvironmentVariables.class);
    urlBase = EnvironmentSpecificConfiguration.from(environmentVariable).getProperty(RUTA_URL);
  }

  @Before(order = 1)
  public void configurarActor() {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("El Hauser").whoCan(CallAnApi.at(urlBase));
  }
}
