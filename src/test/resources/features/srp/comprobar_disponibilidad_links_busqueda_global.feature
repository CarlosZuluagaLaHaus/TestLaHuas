#language: es

  Característica: Comprobar la disponibilidad de los links del menú de búsqueda global
    Yo como analista de calidad
    quiero comprobar que los links del menú de búsqueda global no se encuentran rotos
    para garantizar la disponibilidad en las SRP´s

  Esquema del escenario: Comprobar la disponibilidad de los links del menú de búsqueda global
    Cuando realizo el consumo de la URL '<URL>'
    Entonces observo que el link consultado se encuentra disponible y responde con un Status Code 200

    Ejemplos: URL´s del menú de búsquedas global
    |URL                                            |
    |/apartamentos/medellin                         |
    |/apartamentos/medellin/el-poblado              |
    |/apartamentos/medellin/belen                   |
    |/apartamentos/medellin/la-america              |
    |/apartamentos/envigado                         |
    |/apartamentos/sabaneta                         |
    |/apartamentos/bello                            |
    |/apartamentos/rionegro                         |
    |/proyectos-de-vivienda/medellin                |
    |/proyectos-de-vivienda/medellin/el-poblado     |
    |/proyectos-de-vivienda/medellin/belen          |
    |/proyectos-de-vivienda/medellin/la-america     |
    |/proyectos-de-vivienda/envigado                |
    |/proyectos-de-vivienda/bello                   |
    |/proyectos-de-vivienda/rionegro                |
    |/proyectos-de-vivienda/rionegro                |