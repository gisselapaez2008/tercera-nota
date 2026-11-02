

import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador10a100 = 0;
        int contadorMayores100 = 0;
        int produccionTotal = 0;

        System.out.print("Ingrese la cantidad de operarios: ");
        n = entrada.nextInt();

        int[] produccion = new int[n];

        // Ingresar la producción
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese la producción del operario " + (i + 1) + ": ");
            produccion[i] = entrada.nextInt();

            while (produccion[i] < 10 || produccion[i] > 200) {
                System.out.println("Error. La producción debe estar entre 10 y 200.");
                System.out.print("Ingrese nuevamente la producción: ");
                produccion[i] = entrada.nextInt();
            }
        }

        // Procesar la producción
        for (int i = 0; i < n; i++) {

            if (produccion[i] >= 10 && produccion[i] <= 100) {
                contador10a100++;
            }

            if (produccion[i] > 100) {
                contadorMayores100++;
            }

            produccionTotal += produccion[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Operarios entre 10 y 100 unidades: " + contador10a100);
        System.out.println("Operarios con más de 100 unidades: " + contadorMayores100);
        System.out.println("Producción total de la fábrica: " + produccionTotal);

        entrada.close();
    }
}
