# Proyecto CRUD con PostgreSQL y Java

Este proyecto es una demostración de cómo conectar una aplicación Java a una base de datos PostgreSQL y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sin el uso de frameworks.

## Tabla de Contenidos
- [Descripción](#descripción)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Uso](#uso)
- [Contribución](#contribución)
- [Licencia](#licencia)

## Descripción
El proyecto comenzó con la creación de una base de datos PostgreSQL, y ha evolucionado para incluir operaciones CRUD completas para la gestión de una tabla de usuarios. Este ejemplo utiliza Java puro sin frameworks, proporcionando una base sólida para entender las conexiones y operaciones básicas en una base de datos relacional.

## Requisitos
- Java Development Kit (JDK) 20 o superior
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
