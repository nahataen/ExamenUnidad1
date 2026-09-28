# 📝 Examen Unidad 1 de Java — ITT

> Cinco programas del examen de la Unidad 1 (arreglos, pila, mayor/menor, ordenamiento y palíndromo numérico).

## Qué contiene

| Proyecto | Archivo | Qué hace (según el código) |
|---|---|---|
| `1.-ExamenSalasFgueroaJesusNahataen` | `src/Ejercicio1.java` | Pide el tamaño de un vector y `n` valores `double`; imprime el elemento mayor y el menor. |
| `2.-ExamenSalasFigueroaJesusNahataen` | `src/Ejercicio2.java` | Pide apellido paterno, materno y nombre; los mete en un `java.util.Stack` y los imprime en orden inverso (LIFO). |
| `4.-ExamenSalasFigueroaJesusNahataen` | `src/Ejercicio4.java` | Pide tres números A, B, C e imprime el mayor (solo casos estrictamente mayores). |
| `7.-ExamenSalasFigueroaJesusNahataen` | `src/Ejercicio7.java` | Genera 100 enteros aleatorios entre 5 y 19, los imprime, los ordena de forma descendente (doble bucle) y los reimprime. |
| `8.-ExamenSalasFigueroaJesusNahataen` | `src/Ejercicio8.java` | Lee un número `long`, invierte sus dígitos y dice si es palíndromo; repite con menú `1.-SI / 2.- Salir`. |

## Estructura

```text
itt-java-u1-exam/
├── README.md
├── 1.-ExamenSalasFgueroaJesusNahataen/src/Ejercicio1.java
├── 2.-ExamenSalasFigueroaJesusNahataen/src/Ejercicio2.java
├── 4.-ExamenSalasFigueroaJesusNahataen/src/Ejercicio4.java
├── 7.-ExamenSalasFigueroaJesusNahataen/src/Ejercicio7.java
└── 8.-ExamenSalasFigueroaJesusNahataen/src/Ejercicio8.java
```

Cada carpeta es un proyecto Eclipse independiente (`.classpath`, `.project`, `.settings/`). Clases en paquete por defecto, sin Maven/Gradle.

## Requisitos

- JDK 8 o superior (`javac` / `java`).

## Cómo correr

Cada ejercicio se compila y ejecuta desde su propia carpeta `src`:

```bash
cd "1.-ExamenSalasFgueroaJesusNahataen/src"
javac Ejercicio1.java
java Ejercicio1

cd "../../2.-ExamenSalasFigueroaJesusNahataen/src"
javac Ejercicio2.java
java Ejercicio2

cd "../../4.-ExamenSalasFigueroaJesusNahataen/src"
javac Ejercicio4.java
java Ejercicio4

cd "../../7.-ExamenSalasFigueroaJesusNahataen/src"
javac Ejercicio7.java
java Ejercicio7

cd "../../8.-ExamenSalasFigueroaJesusNahataen/src"
javac Ejercicio8.java
java Ejercicio8
```

## Notas

- Repo escolar/histórico del ITT, conservado como archivo. Solo contiene los ejercicios 1, 2, 4, 7 y 8 (faltan 3, 5 y 6). Sin tests ni dependencias.
