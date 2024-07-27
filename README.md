# CRUD Básico en Spring Boot

Este proyecto es un ejemplo de una aplicación CRUD (Create, Read, Update, Delete) utilizando Spring Boot en su última versión. La aplicación permite gestionar una entidad básica llamada `Book` con los atributos `id`, `title`, `author`, `pages`, `price` e `image`. La imagen que vamos a seleccionar será almacenada en Cloudinary

## Requisitos

- Java 17 o superior
- Maven 3.6.0 o superior
- Un entorno de desarrollo como IntelliJ IDEA o Eclipse
- Una cuenta de Cloudinary con sus respectivas credenciales

## Configuración del Proyecto

1. Clona el repositorio:
    ```bash
    git clone https://github.com/SaulM12/crud-example-backend.git
    cd crud-example-backend
    ```

2. Construye el proyecto usando Maven:
    ```bash
    mvn clean install
    ```

3. Configura la base de datos en el archivo `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Inicia la aplicación:
    ```bash
    mvn spring-boot:run
    ```





