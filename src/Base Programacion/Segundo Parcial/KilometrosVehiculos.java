

import java.util.Scanner;

public class KilometrosVehiculos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador10a300 = 0;
        int contadorMayores300 = 0;
        double totalKilometros = 0;

        System.out.print("Ingrese la cantidad de vehiculos: ");
        n = entrada.nextInt();

        double[] kilometros = new double[n];

        // Ingresar los kilómetros
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese los kilometros del vehiculo " + (i + 1) + ": ");
            kilometros[i] = entrada.nextDouble();

            while (kilometros[i] < 10 || kilometros[i] > 500) {
                System.out.println("Error. Los kilometros deben estar entre 10 y 500.");
                System.out.print("Ingrese nuevamente los kilometros: ");
                kilometros[i] = entrada.nextDouble();
            }
        }

        // Procesar los kilómetros
        for (int i = 0; i < n; i++) {

            if (kilometros[i] >= 10 && kilometros[i] <= 300) {
                contador10a300++;
            }

            if (kilometros[i] > 300) {
                contadorMayores300++;
            }

            totalKilometros += kilometros[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Vehiculos entre 10 y 300 km: " + contador10a300);
        System.out.println("Vehiculos con mas de 300 km: " + contadorMayores300);
        System.out.println("Total de kilometros recorridos: " + totalKilometros + " km");

        entrada.close();
    }
}
