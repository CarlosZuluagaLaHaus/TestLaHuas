package tasks.srp;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

@AllArgsConstructor
public class ConsultarURL implements Task {

  private final String url;

  public static ConsultarURL delSRP(String url) {
    return Tasks.instrumented(ConsultarURL.class, url);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Get.resource(url));
  }
}
