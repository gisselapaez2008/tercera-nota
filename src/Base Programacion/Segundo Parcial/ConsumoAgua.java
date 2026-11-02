
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador1a50 = 0;
        int contadorMayores50 = 0;
        int consumoTotal = 0;

        System.out.print("Ingrese la cantidad de apartamentos: ");
        n = entrada.nextInt();

        int[] consumos = new int[n];

        // Ingresar los consumos
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el consumo del apartamento " + (i + 1) + ": ");
            consumos[i] = entrada.nextInt();

            while (consumos[i] < 1 || consumos[i] > 100) {
                System.out.println("Error. El consumo debe estar entre 1 y 100.");
                System.out.print("Ingrese nuevamente el consumo: ");
                consumos[i] = entrada.nextInt();
            }
        }

        // Procesar los consumos
        for (int i = 0; i < n; i++) {

            if (consumos[i] >= 1 && consumos[i] <= 50) {
                contador1a50++;
            }

            if (consumos[i] > 50) {
                contadorMayores50++;
            }

            consumoTotal += consumos[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Apartamentos entre 1 y 50 m3: " + contador1a50);
        System.out.println("Apartamentos con consumo mayor a 50 m3: " + contadorMayores50);
        System.out.println("Consumo total de agua: " + consumoTotal + " metros cubicos");

        entrada.close();
    }
}
