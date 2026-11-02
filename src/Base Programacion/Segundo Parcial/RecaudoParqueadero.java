
import java.util.Scanner;

public class RecaudoParqueadero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador2000a20000 = 0;
        int contadorMayores20000 = 0;
        double totalRecaudado = 0;

        System.out.print("Ingrese la cantidad de vehiculos: ");
        n = entrada.nextInt();

        double[] pagos = new double[n];

        // Ingresar los pagos
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el pago del vehiculo " + (i + 1) + ": $");
            pagos[i] = entrada.nextDouble();

            while (pagos[i] < 2000 || pagos[i] > 50000) {
                System.out.println("Error. El pago debe estar entre $2.000 y $50.000.");
                System.out.print("Ingrese nuevamente el pago: $");
                pagos[i] = entrada.nextDouble();
            }
        }

        // Procesar los pagos
        for (int i = 0; i < n; i++) {

            if (pagos[i] >= 2000 && pagos[i] <= 20000) {
                contador2000a20000++;
            }

            if (pagos[i] > 20000) {
                contadorMayores20000++;
            }

            totalRecaudado += pagos[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Vehiculos que pagaron entre $2.000 y $20.000: " + contador2000a20000);
        System.out.println("Vehiculos que pagaron mas de $20.000: " + contadorMayores20000);
        System.out.println("Total recaudado por el parqueadero: $" + totalRecaudado);

        entrada.close();
    }
}
