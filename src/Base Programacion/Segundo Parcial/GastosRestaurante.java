
import java.util.Scanner;

public class GastosRestaurante {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador20a100 = 0;
        int contadorMayores100 = 0;
        double totalRecibido = 0;

        System.out.print("Ingrese la cantidad de clientes: ");
        n = entrada.nextInt();

        double[] gastos = new double[n];

        // Ingresar los gastos
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el gasto del cliente " + (i + 1) + ": $");
            gastos[i] = entrada.nextDouble();

            while (gastos[i] < 20000 || gastos[i] > 200000) {
                System.out.println("Error. El gasto debe estar entre $20.000 y $200.000.");
                System.out.print("Ingrese nuevamente el gasto: $");
                gastos[i] = entrada.nextDouble();
            }
        }

        // Procesar los gastos
        for (int i = 0; i < n; i++) {

            if (gastos[i] >= 20000 && gastos[i] <= 100000) {
                contador20a100++;
            }

            if (gastos[i] > 100000) {
                contadorMayores100++;
            }

            totalRecibido += gastos[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Clientes entre $20.000 y $100.000: " + contador20a100);
        System.out.println("Clientes con gastos mayores a $100.000: " + contadorMayores100);
        System.out.println("Total recibido por el restaurante: $" + totalRecibido);

        entrada.close();
    }
}

