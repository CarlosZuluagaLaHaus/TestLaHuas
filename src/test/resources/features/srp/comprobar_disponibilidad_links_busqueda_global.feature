#language: es

Característica: Comprobar la disponibilidad de los links del menú de búsqueda global
  Yo como analista de calidad
  quiero comprobar que los links del menú de búsqueda global no se encuentran rotos
  para garantizar la disponibilidad en las SRP´s

  Esquema del escenario: Comprobar la disponibilidad de los links del menú de búsqueda global
    Cuando realizo el consumo de la URL '<URL>'
    Entonces observo que el link consultado se encuentra disponible y responde con un Status Code 200

    Ejemplos: URL´s del menú de búsquedas global
      | URL                                            |
      | /apartamentos                                  |
      | /proyectos-de-vivienda                         |
      | /casas                                         |
      | /apartamentos/medellin                         |
      | /apartamentos/medellin/el-poblado              |
      | /apartamentos/medellin/belen                   |
      | /apartamentos/medellin/la-america              |
      | /apartamentos/envigado                         |
      | /apartamentos/sabaneta                         |
      | /apartamentos/bello                            |
      | /apartamentos/rionegro                         |
      | /proyectos-de-vivienda/medellin                |
      | /proyectos-de-vivienda/medellin/el-poblado     |
      | /proyectos-de-vivienda/medellin/belen          |
      | /proyectos-de-vivienda/medellin/la-america     |
      | /proyectos-de-vivienda/envigado                |
      | /proyectos-de-vivienda/sabaneta                |
      | /proyectos-de-vivienda/bello                   |
      | /proyectos-de-vivienda/rionegro                |
      | /casas/medellin                                |
      | /casas/envigado                                |
      | /casas/rionegro                                |
      | /casas/sabaneta                                |
      | /casas/la-estrella                             |
      | /apartamentos/bogota                           |
      | /apartamentos/bogota/chico                     |
      | /apartamentos/bogota/colina-campestre          |
      | /apartamentos/bogota/santa-barbara             |
      | /apartamentos/bogota/cedritos                  |
      | /apartamentos/chia                             |
      | /apartamentos/cajica                           |
      | /proyectos-de-vivienda/bogota                  |
      | /proyectos-de-vivienda/bogota/chico            |
      | /proyectos-de-vivienda/bogota/colina-campestre |
      | /proyectos-de-vivienda/bogota/santa-barbara    |
      | /proyectos-de-vivienda/bogota/cedritos         |
      | /proyectos-de-vivienda/bogota/centro           |
      | /proyectos-de-vivienda/chia                    |
      | /proyectos-de-vivienda/cajica                  |
      | /casas/bogota                                  |
      | /casas/chia                                    |
      | /casas/cajica                                  |
      | /casas/mosquera                                |
      | /casas/cota                                    |