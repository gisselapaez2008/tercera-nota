

import java.util.Scanner;

public class VentasEmpresa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] precios = new double[5];

        // Filas: artículos
        // Columnas: sucursales
        int[][] cantidades = new int[5][4];

        double[] recaudacion = new double[4];

        // Leer precios
        System.out.println("INGRESO DE PRECIOS");

        for (int i = 0; i < 5; i++) {

            System.out.print("Precio del articulo " + (i + 1) + ": ");
            precios[i] = entrada.nextDouble();
        }

        // Leer cantidades vendidas
        System.out.println("\nCANTIDADES VENDIDAS");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nArticulo " + (i + 1));

            for (int j = 0; j < 4; j++) {

                System.out.print("Cantidad vendida en sucursal " + (j + 1) + ": ");
                cantidades[i][j] = entrada.nextInt();
            }
        }

        // Calcular cantidades totales de cada artículo
        System.out.println("\nCANTIDAD TOTAL POR ARTICULO");

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 4; j++) {
                total = total + cantidades[i][j];
            }

            System.out.println("Articulo " + (i + 1) + ": " + total);
        }

        // Cantidad del artículo 3 en sucursal 2
        System.out.println("\nArticulo 3 en sucursal 2: "
                + cantidades[2][1]);

        // Cantidad del artículo 3 en sucursal 1
        System.out.println("Articulo 3 en sucursal 1: "
                + cantidades[2][0]);

        // Calcular recaudación por sucursal
        double totalEmpresa = 0;

        for (int j = 0; j < 4; j++) {

            recaudacion[j] = 0;

            for (int i = 0; i < 5; i++) {

                recaudacion[j] = recaudacion[j]
                        + (precios[i] * cantidades[i][j]);
            }

            totalEmpresa = totalEmpresa + recaudacion[j];

            System.out.println("\nRecaudacion sucursal "
                    + (j + 1) + ": $" + recaudacion[j]);
        }

        // Mostrar recaudación de la empresa
        System.out.println("\nRecaudacion total de la empresa: $"
                + totalEmpresa);

        // Buscar sucursal con mayor recaudación
        int mayor = 0;

        for (int j = 1; j < 4; j++) {

            if (recaudacion[j] > recaudacion[mayor]) {
                mayor = j;
            }
        }

        System.out.println("Sucursal de mayor recaudacion: "
                + (mayor + 1));

        System.out.println("Valor recaudado: $"
                + recaudacion[mayor]);

        entrada.close();
    }
}
