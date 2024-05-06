# API REST con Microservicios

Este proyecto es una API REST que utiliza microservicios y se conecta a dos bases de datos diferentes: H2 y MySQL. Las bases de datos se comunican entre sí para proporcionar una solución integrada.

## Requisitos

- Java
- Spring-boot
- Maven
- H2 Database
- MySQL
- Postman

## Instalación

1. Clona este repositorio.
2. Configura las bases de datos H2 y MySQL según tus necesidades.
3. Actualiza la configuración de la aplicación con los detalles de conexión a las bases de datos.
4. Construye el proyecto utilizando Maven: `mvn clean install`.

## Configuración

Asegúrate de que las bases de datos H2 y MySQL estén configuradas y en funcionamiento. Actualiza los archivos de configuración de la aplicación (`application.properties` o similar) con los detalles de conexión adecuados para cada base de datos.

## Uso

1. Inicia la aplicación principal.
2. La API REST estará disponible en `http://localhost:8080` (o el puerto configurado).
3. Consulta la documentación de los endpoints para interactuar con la API.

## Estructura del Proyecto

El proyecto sigue una estructura de microservicios, donde cada microservicio es responsable de una funcionalidad específica y se comunica con las bases de datos necesarias. La estructura de directorios y archivos puede variar según la implementación específica.


## Contribución

Si deseas contribuir a este proyecto, por favor, crea un issue o envía una solicitud de extracción. Asegúrate de seguir las mejores prácticas de desarrollo y de proporcionar pruebas unitarias para cualquier nueva funcionalidad.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
