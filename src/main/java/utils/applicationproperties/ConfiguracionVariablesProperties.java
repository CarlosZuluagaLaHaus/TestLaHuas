package utils.applicationproperties;

import java.util.Optional;

public class ConfiguracionVariablesProperties {

  public static String getHost() {
    return Optional.ofNullable(System.getenv("host"))
        .orElse((String) ConfiguracionEjecucionAplicacion.getInstance().get("host"));
  }
}
