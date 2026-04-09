/*
 * EJERCICIO 4: Juego de Aprendizaje de Suma (Tres números) [cite: 51]
 * * ANÁLISIS Y DISEÑO
 * Problema: Generar tres enteros de un solo dígito y evaluar la suma ingresada por el usuario[cite: 51].
 * Entrada: Respuesta del usuario (entero)[cite: 51].
 * Cálculo: Sumar los tres números generados (0-9) y comparar con la entrada.
 * Salida: Validación de la respuesta (Correcto/Incorrecto indicando el resultado real).
 *
 * * PSEUDOCÓDIGO
 * INICIO
 * n1 = GENERAR_ENTERO_ALEATORIO(0, 9)
 * n2 = GENERAR_ENTERO_ALEATORIO(0, 9)
 * n3 = GENERAR_ENTERO_ALEATORIO(0, 9)
 * IMPRIMIR "What is " + n1 + " + " + n2 + " + " + n3 + "?"
 * LEER respuesta
 * SI respuesta == (n1 + n2 + n3) ENTONCES
 * IMPRIMIR "True. The answer is correct."
 * SINO
 * IMPRIMIR "False. The correct answer is ", (n1 + n2 + n3)
 * FIN SI
 * FIN
 */
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        int n3 = (int)(Math.random() * 10);

        System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + "? ");
        int answer = input.nextInt();
        int sum = n1 + n2 + n3;

        if (answer == sum) {
            System.out.println("True. The answer is correct.");
        } else {
            System.out.println("False. The correct answer is " + sum);
        }
    }
}
