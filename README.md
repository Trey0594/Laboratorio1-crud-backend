# Laboratorio 1 - CRUD Back-end

API REST con CRUD de **Productos** y **Categorías**, desarrollada con Spring Boot, Spring Data JPA, Spring Security con JWT y MySQL local.

## Requisitos
- Java 21
- MySQL 8 corriendo en `localhost:3306`

## Configuración
1. Crear la base de datos:
```sql
   CREATE DATABASE laboratorio1;
```
2. Ajustar usuario y contraseña de MySQL en `src/main/resources/application.properties`.
3. Correr el proyecto (`DemoApplication`). Las tablas, los roles y los usuarios se crean automáticamente al arrancar.

## Usuarios precargados

| Rol | Email | Password |
|---|---|---|
| SUPER_ADMIN | super.admin@gmail.com | superadmin123 |
| USER | user@gmail.com | user123 |

## Permisos
- **Consultar** productos y categorías: cualquier usuario autenticado.
- **Registrar, actualizar y borrar**: solo `SUPER_ADMIN`.

## Pruebas
Importar en Postman el archivo `Laboratorio1-CRUD-Backend.postman_collection.json` (en la raíz del repositorio) y ejecutar las peticiones en orden, empezando por la carpeta **Auth**.