/*
 * EJERCICIO 1: Solución de Ecuación Cuadrática [cite: 30]
 * * ANÁLISIS Y DISEÑO
 * Problema: Encontrar las raíces de la ecuación cuadrática ax^2 + bx + c = 0[cite: 30].
 * Entrada: Tres valores numéricos correspondientes a los coeficientes a, b y c[cite: 35].
 * Cálculo: Calcular el discriminante (b^2 - 4ac)[cite: 33]. 
 * Si es positivo, calcular dos raíces[cite: 39]. Si es cero, calcular una raíz[cite: 40].
 * Salida: Las raíces reales, o el mensaje "The equation has no real roots" si el discriminante es negativo[cite: 34, 40].
 *
 * * PSEUDOCÓDIGO
 * INICIO
 * LEER a, b, c
 * discriminante = (b * b) - (4 * a * c)
 * SI discriminante > 0 ENTONCES
 * r1 = (-b + pow(discriminante, 0.5)) / (2 * a)
 * r2 = (-b - pow(discriminante, 0.5)) / (2 * a)
 * IMPRIMIR "The equation has two roots: ", r1, " and ", r2
 * SINO SI discriminante == 0 ENTONCES
 * r1 = -b / (2 * a)
 * IMPRIMIR "The equation has one root: ", r1
 * SINO
 * IMPRIMIR "The equation has no real roots"
 * FIN SI
 * FIN
 */
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root: " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
