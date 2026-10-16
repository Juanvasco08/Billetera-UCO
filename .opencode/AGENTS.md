# Entorno de Asistentes - Billetera UCO

Configuración de herramientas y agentes para la auditoría de código financiero y versionamiento del proyecto Billetera UCO.

## Reglas del Proyecto
- **Validación Financiera**: Ninguna transacción puede dejar cuentas en valores negativos no autorizados.
- **Calidad de Código**: Encapsulamiento estricto en el modelo de cuentas y clientes.
- **Ramas Git**: Desarrollo continuo en `development` y liberaciones estables en `main`.

## Agentes del Sistema
- **auditor-transacciones**: Valida montos, topes de retiro y cálculo de rendimientos.
- **mentor-git**: Revisa mensajes de commits y flujo de integración.