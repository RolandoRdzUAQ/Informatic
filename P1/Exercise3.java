/*
 * EJERCICIO 3: Juego de Aprendizaje de Suma [cite: 49]
 * * ANÁLISIS Y DISEÑO
 * Problema: Generar dos enteros menores a 100 y evaluar si el usuario ingresa la suma correcta[cite: 49].
 * Entrada: Respuesta del usuario (entero)[cite: 49].
 * Cálculo: Comparar la suma de los dos números generados aleatoriamente con la entrada del usuario.
 * Salida: true si es correcto, false de lo contrario[cite: 50].
 *
 * * PSEUDOCÓDIGO
 * INICIO
 * n1 = GENERAR_ENTERO_ALEATORIO(0, 99)
 * n2 = GENERAR_ENTERO_ALEATORIO(0, 99)
 * IMPRIMIR "What is " + n1 + " + " + n2 + "?"
 * LEER respuesta
 * IMPRIMIR respuesta == (n1 + n2)
 * FIN
 */
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
