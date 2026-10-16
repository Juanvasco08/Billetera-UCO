# 💳 Billetera Digital UCO - Sistema de Gestión Bancaria

Proyecto académico desarrollado en Java aplicando los principios fundamentales de la Programación Orientada a Objetos (POO), integrando un entorno de asistencia y calidad configurado con **OpenCode**.

## 🛠️ Arquitectura POO
- **`Cuenta`**: Clase base abstracta que define el contrato de depósitos y retiros.
- **`CuentaAhorros`**: Subclase con cálculo de rendimientos e intereses.
- **`CuentaCorriente`**: Subclase con soporte para cupos de sobregiro.
- **`Cliente`**: Modelo de dominio que encapsula la información del usuario y su cuenta asignada.
- **`Main`**: Punto de entrada interactivo para pruebas de operaciones bancarias.

## 🤖 Entorno OpenCode
El proyecto cuenta con una carpeta de configuración `.opencode` dividida en:
- **`agents/`**: Agentes para auditoría financiera y mentoría en Git.
- **`commands/`**: Comandos para la verificación de estado y revisión de commits.
- **`skills/`**: Habilidades con las convenciones de Java finanzas y flujo de ramas UCO.

## 🚀 Flujo de Trabajo
Este repositorio sigue la regla de trabajo en dos ramas:
- `development`: Rama activa de desarrollo y pruebas.
- `main`: Rama de entregas estables.