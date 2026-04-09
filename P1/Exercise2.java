/*
 * EJERCICIO 2: Solución de Ecuación Lineal 2x2 (Regla de Cramer) [cite: 42]
 * * ANÁLISIS Y DISEÑO
 * Problema: Resolver un sistema de ecuaciones lineales 2x2 usando la regla de Cramer[cite: 42].
 * Entrada: Seis valores numéricos: a, b, c, d, e, f[cite: 47].
 * Cálculo: Calcular el denominador ad - bc[cite: 48]. 
 * Si es distinto de 0, calcular x = (ed - bf) / (ad - bc) y y = (af - ec) / (ad - bc)[cite: 44, 45].
 * Salida: Los valores de x e y, o el mensaje "The equation has no solution" si ad - bc = 0[cite: 47, 48].
 *
 * * PSEUDOCÓDIGO
 * INICIO
 * LEER a, b, c, d, e, f
 * denominador = (a * d) - (b * c)
 * SI denominador == 0 ENTONCES
 * IMPRIMIR "The equation has no solution"
 * SINO
 * x = ((e * d) - (b * f)) / denominador
 * y = ((a * f) - (e * c)) / denominador
 * IMPRIMIR "x is ", x, " and y is ", y
 * FIN SI
 * FIN
 */
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double denominator = (a * d) - (b * c);

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = ((e * d) - (b * f)) / denominator;
            double y = ((a * f) - (e * c)) / denominator;
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
