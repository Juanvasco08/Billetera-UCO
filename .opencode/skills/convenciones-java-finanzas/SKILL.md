---
name: convenciones-java-finanzas
description: Buenas prácticas de programación para modelos bancarios en Java
---
# Skill: Convenciones Java Finanzas

## Estándares de Estructura
- Clase abstracta base `Cuenta.java` para compartir lógica de depósitos y retiros.
- Encapsulamiento con métodos `getSaldo()`, `depositar(double monto)` y `retirar(double monto)`.
- Uso del modificador `protected` para atributos heredados en subclases de cuentas.
- Nombres de clases en `PascalCase` y variables en `camelCase`.