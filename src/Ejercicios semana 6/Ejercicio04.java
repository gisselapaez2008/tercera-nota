

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = 0;

        // Llenar vector
        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese un numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.print("\nNumero que desea buscar: ");
        int buscar = entrada.nextInt();

        // Buscar número
        for (int i = 0; i < 10; i++) {

            if (numeros[i] == buscar) {

                System.out.println("Encontrado en posicion: " + i);
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El numero aparece " + contador + " veces.");
        } else {
            System.out.println("El numero no existe en el vector.");
        }

        entrada.close();
    }
}
