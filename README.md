# Laboratorio 1 - CRUD Back-end

API REST con CRUD de **Productos** y **Categorías**, registro e inicio de sesión de usuarios y listado de usuarios. Desarrollada con Spring Boot, Spring Data JPA, Spring Security con JWT y PostgreSQL local. Es el back-end que consume el front-end del Laboratorio 2.

## Requisitos
- Java 21
- PostgreSQL corriendo en `localhost:5432`

## Configuración
1. Crear la base de datos:
```sql
   CREATE DATABASE laboratorio2;
```
2. Ajustar usuario y contraseña de PostgreSQL en `src/main/resources/application.properties` (por defecto: usuario `postgres`).
3. Correr el proyecto (`DemoApplication`). Las tablas, los roles y los usuarios se crean automáticamente al arrancar.

## Usuarios precargados

| Rol | Email | Password |
|---|---|---|
| SUPER-ADMIN-ROLE | super.admin@gmail.com | superadmin123 |
| USER | user@gmail.com | user123 |

## Endpoints

| Método | Ruta | Acceso |
|---|---|---|
| POST | `/auth/login` | Público |
| POST | `/auth/signup` | Público (registra con rol `USER`) |
| GET | `/categories`, `/categories/{id}` | Cualquier usuario autenticado |
| POST, PUT, DELETE | `/categories`, `/categories/{id}` | Solo `SUPER-ADMIN-ROLE` |
| GET | `/products`, `/products/{id}` | Cualquier usuario autenticado |
| POST, PUT, DELETE | `/products`, `/products/{id}` | Solo `SUPER-ADMIN-ROLE` |
| GET | `/users` | Solo `SUPER-ADMIN-ROLE` |

## Respuestas de seguridad
- **401 Unauthorized**: la petición no trae token o el token no es válido.
- **403 Forbidden**: el usuario está autenticado, pero su rol no tiene permiso.

## CORS
Se permite el origen `http://localhost:4200` (front-end en Angular).

## Pruebas
Importar en Postman el archivo `Laboratorio1-CRUD-Backend.postman_collection.json` (en la raíz del repositorio) y ejecutar las peticiones en orden, empezando por la carpeta **Auth**.