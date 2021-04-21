package stepdefinitions.srp;

import static exceptions.CodigoRespuestaServicioError.CODIGO_RESPUESTA_SERVICIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import exceptions.CodigoRespuestaServicioError;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.http.HttpStatus;
import questions.CodigoRespuestaServicio;
import tasks.srp.ConsultarURL;

public class ComprobarDisponibilidadLinksBusquedaGlobalStepDefinition {

  @Cuando("realizo el consumo de la URL {string}")
  public void realizo_el_consumo_de_la_URI(String url) {
    theActorInTheSpotlight().attemptsTo(ConsultarURL.delSRP(url));
  }

  @Entonces(
      "observo que el link consultado se encuentra disponible y responde con un Status Code 200")
  public void observo_que_el_status_code_obtenido_es_staus_code_esperado() {
    theActorInTheSpotlight()
        .should(
            seeThat(CodigoRespuestaServicio.obtenido(), equalTo(HttpStatus.SC_OK))
                .orComplainWith(CodigoRespuestaServicioError.class, CODIGO_RESPUESTA_SERVICIO));
  }
}
