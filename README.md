Este proyecto se centra en el desarrollo de una aplicación basada en Spring Boot que permite analizar secuencias de ADN para determinar si pertenecen a seres mutantes.
La aplicación ofrece una API REST que valida y procesa las secuencias de ADN, proporcionando respuestas en vase a las cadenas de ADN

Para correrlo uso: ParcialmagnetoApplication

 Swagger localmente:
 http://localhost:8080/swagger-ui/index.html
 Consola de H2 localmente:
 http://localhost:8080/h2-console

Datos de Estructura:

Controladores: Manejan las solicitudes HTTP y definen los endpoints de la API.
DTO: Definen la estructura de los datos intercambiados entre el cliente y el servidor.
Entidades: Representan los modelos de datos que se almacenan en la base de datos.
Repositorios: Manejan las interacciones con la base de datos utilizando Spring Data JPA.
Servicios: Contienen la lógica de negocio para el procesamiento de las secuencias de ADN.
