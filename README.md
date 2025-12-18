# MiniERP (Sistema de Ventas) — Java + MySQL

Proyecto personal en Java desarrollado como parte de mi portfolio (DAW).  
El objetivo es simular un sistema de ventas tipo mini-ERP aplicando arquitectura MVC, persistencia en base de datos y generación de documentos PDF.

## Tecnologías
- Java (JDK 17)
- MySQL (JDBC)
- NetBeans (proyecto Java)
- iText 5 (generación de PDF)
- JCalendar (selección de fechas)

## Arquitectura y estructura del proyecto
- `src/modelo/`: entidades y lógica de datos (Cliente, Producto, Usuario, CabeceraVenta, DetalleVenta, etc.)
- `src/vista/`: interfaz de usuario
- `src/controlador/`: control de flujo y eventos
- `src/conexion/`: configuración y acceso a base de datos

## Funcionalidades (actuales / previstas)
- Gestión de clientes, productos y usuarios
- Registro de ventas con cabecera y detalle
- Cálculo de totales
- Generación de ticket/factura en PDF
- Selección de fechas mediante calendario

## Estado del proyecto
En desarrollo. Proyecto formativo orientado a aprendizaje y portfolio.

## Cómo ejecutar (NetBeans)
1. Abrir el proyecto en NetBeans.
2. Configurar la conexión a MySQL en `src/conexion/` (host, usuario, contraseña y BD).
3. Añadir dependencias externas en el proyecto (ver sección siguiente).
4. Ejecutar con JDK 17.

## Dependencias externas
Este proyecto utiliza librerías externas que deben añadirse al proyecto desde el IDE:
- MySQL Connector/J (JDBC)
- iText 5 (PDF)
- JCalendar

## Nota
Las librerías externas se emplean con fines educativos y de demostración.
