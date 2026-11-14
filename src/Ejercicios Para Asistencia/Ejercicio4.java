

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] ventas = new int[4][3];

        int[] totalProductos = new int[4];
        int[] totalSucursales = new int[3];

        // Leer ventas
        for (int i = 0; i < 4; i++) {

            System.out.println("\nProducto " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.print("Sucursal " + (j + 1) + ": ");
                ventas[i][j] = entrada.nextInt();
            }
        }

        // Total por producto
        System.out.println("\nTOTAL POR PRODUCTO:");

        for (int i = 0; i < 4; i++) {

            totalProductos[i] = 0;

            for (int j = 0; j < 3; j++) {
                totalProductos[i] += ventas[i][j];
            }

            System.out.println("Producto " + (i + 1) + ": "
                    + totalProductos[i]);
        }

        // Total por sucursal
        System.out.println("\nTOTAL POR SUCURSAL:");

        for (int j = 0; j < 3; j++) {

            totalSucursales[j] = 0;

            for (int i = 0; i < 4; i++) {
                totalSucursales[j] += ventas[i][j];
            }

            System.out.println("Sucursal " + (j + 1) + ": "
                    + totalSucursales[j]);
        }

        // Buscar producto más vendido
        int productoMayor = 0;

        for (int i = 1; i < 4; i++) {

            if (totalProductos[i] > totalProductos[productoMayor]) {
                productoMayor = i;
            }
        }

        System.out.println("\nProducto mas vendido: "
                + (productoMayor + 1));

        // Buscar sucursal que más vendió
        int sucursalMayor = 0;

        for (int j = 1; j < 3; j++) {

            if (totalSucursales[j] > totalSucursales[sucursalMayor]) {
                sucursalMayor = j;
            }
        }

        System.out.println("Sucursal que mas vendio: "
                + (sucursalMayor + 1));

        entrada.close();
    }
}
