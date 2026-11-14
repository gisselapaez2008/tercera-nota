

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int total = 0;

        // Llenar matriz
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Numero [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMATRIZ:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        // Sumar filas
        System.out.println("\nSuma de filas:");

        for (int i = 0; i < 4; i++) {

            int suma = 0;

            for (int j = 0; j < 4; j++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + suma);
            total = total + suma;
        }

        // Sumar columnas
        System.out.println("\nSuma de columnas:");

        for (int j = 0; j < 4; j++) {

            int suma = 0;

            for (int i = 0; i < 4; i++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + suma);
        }

        System.out.println("\nSuma total: " + total);

        entrada.close();
    }
}
