# CRUD Básico en Spring Boot

Este proyecto es un ejemplo de una aplicación CRUD (Create, Read, Update, Delete) utilizando Spring Boot en su última versión. La aplicación permite gestionar una entidad básica llamada `Book` con los atributos `id`, `title`, `author`, `pages`, y `price`.

## Requisitos

- Java 17 o superior
- Maven 3.6.0 o superior
- Un entorno de desarrollo como IntelliJ IDEA o Eclipse

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

## API Endpoints

La aplicación expone los siguientes endpoints REST para gestionar la entidad `Book`:

- **Crear un nuevo libro**
    ```http
    POST /book
    ```

    **Cuerpo de la solicitud:**
    ```json
    {
      "title": "El título del libro",
      "author": "El autor del libro",
      "pages": 123,
      "price": 19.99
    }
    ```

- **Obtener todos los libros**
    ```http
    GET /book
    ```

- **Obtener un libro por ID**
    ```http
    GET /book/{id}
    ```

- **Actualizar un libro existente**
    ```http
    PUT /book
    ```

    **Cuerpo de la solicitud:**
    ```json
    {
      "id": 0 
      "title": "El título actualizado del libro",
      "author": "El autor actualizado del libro",
      "pages": 123,
      "price": 19.99
    }
    ```

- **Eliminar un libro**
    ```http
    DELETE /book/{id}
    ```



