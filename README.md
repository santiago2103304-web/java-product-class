Proyecto: Clase Product en Java
 Descripción

Este proyecto implementa una clase Product que representa un producto del mundo real.
Incluye atributos, constructor por defecto, constructor parametrizado, métodos getter y setter,
y la sobrescritura del método toString().

Además, contiene una clase Main para demostrar su funcionamiento.
 Estructura del proyecto
src/
 └─ main/
     └─ java/
         └─ com/
             └─ example/
                 ├─ Product.java
                 └─ Main.java
 Cómo compilar y ejecutar

 IMPORTANTE: ejecutar desde la raíz del proyecto

1️ Compilar
javac -d out src/main/java/com/example/*.java

Esto generará los .class dentro de la carpeta out.

2️ Ejecutar
java -cp out com.example.Main
 Ejemplo de salida esperada
Product 1 Name: Keyboard
Product 2 Price: 1200.0

Full Object Representation:
Product [ID: P001, Name: Keyboard, Price: 45.99, Stock: 10]
Product [ID: P002, Name: Laptop, Price: 1200.0, Stock: 5]
 Historial de Commits
 Feb 25, 2026

Resuelto conflicto en Main.java

Correccion

Feb 18, 2026

Add README file with project description and execution instructions

Implement default and parameterized constructors in Product

Add Product class with attributes

Override toString method

Add getters and setters with validation

Implement Product class with attributes and constructors

Create project structure with required folders

Update Product class with new changes

Initial commit: Create project structure and Product class

Initial commit: Create Product class with attributes and constructors