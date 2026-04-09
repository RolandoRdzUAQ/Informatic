/*
 * EJERCICIO 5: Geometría de dos rectángulos [cite: 52]
 * * ANÁLISIS Y DISEÑO
 * Problema: Determinar si un segundo rectángulo está contenido dentro del primero o se superpone[cite: 52].
 * Entrada: Coordenadas del centro (x, y), ancho y alto de dos rectángulos[cite: 52].
 * Cálculo: Se calcula la distancia horizontal (dx) y vertical (dy) entre los centros.
 * - Está dentro si: dx + (w2/2) <= (w1/2) y dy + (h2/2) <= (h1/2).
 * - Se superpone si: dx <= (w1/2 + w2/2) y dy <= (h1/2 + h2/2).
 * Salida: Mensaje indicando el estado relacional (inside, overlaps, o does not overlap).
 *
 * * PSEUDOCÓDIGO
 * INICIO
 * LEER r1_x, r1_y, r1_w, r1_h
 * LEER r2_x, r2_y, r2_w, r2_h
 * * dx = VALOR_ABSOLUTO(r1_x - r2_x)
 * dy = VALOR_ABSOLUTO(r1_y - r2_y)
 * * SI (dx + r2_w/2 <= r1_w/2) Y (dy + r2_h/2 <= r1_h/2) ENTONCES
 * IMPRIMIR "r2 is inside r1"
 * SINO SI (dx <= (r1_w + r2_w)/2) Y (dy <= (r1_h + r2_h)/2) ENTONCES
 * IMPRIMIR "r2 overlaps r1"
 * SINO
 * IMPRIMIR "r2 does not overlap r1"
 * FIN SI
 * FIN
 */
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);

        if (dx + (w2 / 2) <= (w1 / 2) && dy + (h2 / 2) <= (h1 / 2)) {
            System.out.println("r2 is inside r1");
        } else if (dx <= (w1 + w2) / 2 && dy <= (h1 + h2) / 2) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
