---
tags:
  - universidad
  - programacion/java
  - algoritmos
  - actividad
fecha: 2026-04-08
---

# Actividad 1.5: Guess a Number Problem

> [!info] Enunciado del problema
> El programa genera aleatoriamente un número entero mayor o igual a 0 y menor que 100. Luego pide al usuario que adivine el número. Si lo adivina correctamente, el programa muestra un mensaje de éxito. De lo contrario, verifica si el número ingresado es menor o mayor al generado. Si es menor, imprime *"Your guess is lower than the number"*; si es mayor, imprime *"Your guess is higher than the number"*. El programa debe seguir pidiendo números al usuario hasta que ingrese el número correcto, utilizando el método `random` de la clase `Math`.

## 1. Análisis y Diseño

### Entradas
- Un número entero ingresado por el usuario en cada intento (`guess`).

### Salidas
- Mensaje para solicitar el número al usuario.
- Pistas para orientar al usuario: *"Your guess is lower than the number"* o *"Your guess is higher than the number"*.
- Mensaje de éxito cuando el usuario adivina el número.

### Variables a emplear
- `randomNumber` (Tipo `int`): Almacenará el número aleatorio generado por el programa (entre 0 y 99).
- `guess` (Tipo `int`): Almacenará el número introducido por el usuario desde el teclado.

### Análisis del problema
> [!abstract] Consideraciones Lógicas
> - Para generar un número entre $0$ y $99$ usando la clase `Math`, se debe utilizar `Math.random()`, el cual devuelve un valor decimal entre $0.0$ y $0.9999$. Al multiplicarlo por $100$ y forzar su conversión a entero `(int)`, obtendremos un rango de $0$ a $99$.
> - Dado que no sabemos cuántos intentos le tomará al usuario adivinar el número, necesitamos usar un ciclo o bucle. La estructura ideal es un ciclo `while` (mientras) que se repita siempre y cuando el número ingresado (`guess`) sea diferente al número generado (`randomNumber`).
> - Dentro del ciclo, usaremos una estructura de selección `if-else` para comparar los números y dar la pista correcta.

---

## 2. Pseudocódigo

```text
INICIO
  // 1. Generar el número aleatorio
  randomNumber = ENTERO(Math.random() * 100)
  
  // 2. Inicializar la variable del usuario con un valor fuera del rango para forzar la entrada al ciclo
  guess = -1 
  
  // 3. Iniciar el ciclo de adivinanza
  MIENTRAS (guess != randomNumber) HACER
    
    IMPRIMIR "Guess a magic number between 0 and 99: "
    LEER guess
    
    // 4. Evaluar el intento del usuario
    SI (guess == randomNumber) ENTONCES
      IMPRIMIR "Yes, the number is " + randomNumber
    SINO SI (guess < randomNumber) ENTONCES
      IMPRIMIR "Your guess is lower than the number"
    SINO
      IMPRIMIR "Your guess is higher than the number"
    FIN SI
    
  FIN MIENTRAS
FIN