

import java.util.Scanner;

public class VentasTienda {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador50a500 = 0;
        int contadorMayores500 = 0;
        double totalVendido = 0;

        System.out.print("Ingrese la cantidad de vendedores: ");
        n = entrada.nextInt();

        double[] ventas = new double[n];

        // Ingresar las ventas
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese la venta del vendedor " + (i + 1) + ": ");
            ventas[i] = entrada.nextDouble();

            while (ventas[i] < 50 || ventas[i] > 1000) {
                System.out.println("Error. La venta debe estar entre $50 y $1000.");
                System.out.print("Ingrese nuevamente la venta: ");
                ventas[i] = entrada.nextDouble();
            }
        }

        // Procesar las ventas
        for (int i = 0; i < n; i++) {

            if (ventas[i] >= 50 && ventas[i] <= 500) {
                contador50a500++;
            }

            if (ventas[i] > 500) {
                contadorMayores500++;
            }

            totalVendido += ventas[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS DE LA TIENDA ---");
        System.out.println("Ventas entre $50 y $500: " + contador50a500);
        System.out.println("Ventas mayores a $500: " + contadorMayores500);
        System.out.println("Total vendido por la tienda: $" + totalVendido);

        entrada.close();
    }
}
