# Proyecto CRUD con PostgreSQL y Java

Este proyecto es una demostración de cómo conectar una aplicación Java a una base de datos PostgreSQL y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sin el uso de frameworks.

## Tabla de Contenidos
- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Uso](#uso)

## Descripción
El proyecto comenzó con la creación de una base de datos PostgreSQL, y ha evolucionado para incluir operaciones CRUD completas para la gestión de una tabla de usuarios. Este ejemplo utiliza Java puro sin frameworks, proporcionando una base sólida para entender las conexiones y operaciones básicas en una base de datos relacional.

## Requisitos
- Java Development Kit (JDK) 8 o superior
- PostgreSQL 13 o superior
- Maven 3.6 o superior
- Un entorno de desarrollo (IDE) como IntelliJ IDEA o Eclipse

## Instalación

### Paso 1: Configuración de PostgreSQL
1. Instala PostgreSQL desde [postgresql.org](https://www.postgresql.org/download/).
2. Crea una base de datos y una tabla llamada `users` con el siguiente SQL:

```sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
); 
```

### Paso 2: Clonar el Repositorio

```bash
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
```

### Paso 3: Configurar Variables de Entorno
1. Configura las siguientes variables de entorno en tu sistema:
```
- DB_USER: tu nombre de usuario de PostgreSQL
- DB_PASSWORD: tu contraseña de PostgreSQL
```

### Paso 4: Configurar Maven
Asegúrate de que el archivo pom.xml incluye la dependencia de PostgreSQL:
```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.5.0</version>
</dependency>
```
### Paso 5: Compilar el Proyecto
```
mvn clean install
```
## Estructura del Proyecto
```
src/
│
├── main/
│   ├── java/
│   │   ├── DatabaseConnection.java
│   │   ├── CreateUser.java
│   │   ├── ReadUsers.java
│   │   ├── UpdateUser.java
│   │   ├── DeleteUser.java
│   │   └── Main.java
│   └── resources/
│       └── application.properties
├── test/
│   └── java/
│       └── AppTest.java
└── pom.xml
```
## Uso
- Ejecutar el Proyecto
- Navega al directorio del proyecto.
- Ejecuta el siguiente comando para correr la aplicación:
```
java -cp target/tu_proyecto-1.0-SNAPSHOT.jar Main
```
## Descripción de las Clases
- DatabaseConnection: Establece la conexión con la base de datos PostgreSQL.
- Create: Inserta un nuevo usuario en la tabla users.
- Read: Lee y muestra todos los usuarios de la tabla users.
- Update: Actualiza la información de un usuario en la tabla users.
- Delete: Elimina un usuario de la tabla users.
- Main: Clase principal que ejecuta las operaciones CRUD secuencialmente
