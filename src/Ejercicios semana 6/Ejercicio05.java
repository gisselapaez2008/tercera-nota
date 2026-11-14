

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[8];

        // Llenar vector
        for (int i = 0; i < 8; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }

        // Ordenar de menor a mayor
        Arrays.sort(numeros);

        System.out.println("\nMenor a mayor:");

        for (int i = 0; i < 8; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar de mayor a menor
        System.out.println("\n\nMayor a menor:");

        for (int i = 7; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}
