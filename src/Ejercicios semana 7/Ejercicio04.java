

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] ventas = new double[7];

        double suma = 0;
        double mayor;

        // Leer ventas
        for (int i = 0; i < 7; i++) {

            System.out.print("Ventas del dia " + (i + 1) + ": ");
            ventas[i] = entrada.nextDouble();

            suma = suma + ventas[i];
        }

        double promedio = suma / 7;

        mayor = ventas[0];

        // Buscar mayores ventas
        for (int i = 1; i < 7; i++) {

            if (ventas[i] > mayor) {
                mayor = ventas[i];
            }
        }

        System.out.println("\nTotal vendido: " + suma);
        System.out.println("Promedio de ventas: " + promedio);

        System.out.println("\nDia con mayores ventas:");

        for (int i = 0; i < 7; i++) {

            if (ventas[i] == mayor) {
                System.out.println("Dia " + (i + 1));
            }
        }

        System.out.println("\nDias con ventas inferiores al promedio:");

        for (int i = 0; i < 7; i++) {

            if (ventas[i] < promedio) {
                System.out.println("Dia " + (i + 1));
            }
        }

        entrada.close();
    }
}
