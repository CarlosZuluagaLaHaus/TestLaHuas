package utils.applicationproperties;

import static org.apache.logging.log4j.core.util.Loader.getClassLoader;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfiguracionEjecucionAplicacion {

  private static Properties instance = null;

  private static final String PREFIJO_ARCHIVO_PROPERTIES = "laHaus";
  private static final String SUFIJO_ARCHIVO_PROPERTIES = "properties";
  private static final Logger LOGGER = LogManager.getLogger(ConfiguracionEjecucionAplicacion.class);

  public static synchronized Properties getInstance() {
    if (instance == null) {
      instance = CargarPropiedadesArchivo();
    }
    return instance;
  }

  private ConfiguracionEjecucionAplicacion() {}

  private static Properties CargarPropiedadesArchivo() {

    String entorno = Optional.ofNullable(System.getenv("env")).orElse("staging");

    String nombreArchivo =
        String.format("%s-%s.%s", PREFIJO_ARCHIVO_PROPERTIES, entorno, SUFIJO_ARCHIVO_PROPERTIES);

    LOGGER.info("**** Archivo properties a leer {} ****", nombreArchivo);

    Properties prop = new Properties();

    try {
      prop.load(getClassLoader().getResourceAsStream(nombreArchivo));
    } catch (IOException e) {
      e.printStackTrace();
      LOGGER.error("**** No se encuentra el archivo properties {} ****", nombreArchivo);
    }

    return prop;
  }
}
