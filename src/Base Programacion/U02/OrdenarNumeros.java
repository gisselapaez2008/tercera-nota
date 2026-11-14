

import java.util.Random;
import java.util.Arrays;

public class OrdenarNumeros {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random aleatorio = new Random();

        // Llenar el vector
        for (int i = 0; i < 10; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
        }

        // Mostrar vector original
        System.out.println("Vector original:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Ordenar de menor a mayor
        Arrays.sort(numeros);

        // Mostrar vector ordenado
        System.out.println("\n\nVector ordenado:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
