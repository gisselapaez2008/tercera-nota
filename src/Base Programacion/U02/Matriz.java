
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Llenar la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese un numero [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Mostrar matriz
        System.out.println("\nMATRIZ:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Sumar filas
        System.out.println("\nSuma de cada fila:");

        for (int i = 0; i < 5; i++) {

            int suma = 0;

            for (int j = 0; j < 5; j++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        // Sumar columnas
        System.out.println("\nSuma de cada columna:");

        for (int j = 0; j < 5; j++) {

            int suma = 0;

            for (int i = 0; i < 5; i++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Columna " + (j + 1) + ": " + suma);
        }

        entrada.close();
    }
}

