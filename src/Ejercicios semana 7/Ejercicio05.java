

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[10];

        double suma = 0;
        double mayor, menor;

        int aprobados = 0;
        int reprobados = 0;

        // Leer notas
        for (int i = 0; i < 10; i++) {

            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            while (notas[i] < 0 || notas[i] > 5) {
                System.out.print("Nota incorrecta. Ingrese entre 0 y 5: ");
                notas[i] = entrada.nextDouble();
            }

            suma = suma + notas[i];

            if (notas[i] >= 3) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        mayor = notas[0];
        menor = notas[0];

        // Buscar mayor y menor
        for (int i = 0; i < 10; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double promedio = suma / 10;

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);

        entrada.close();
    }
}
