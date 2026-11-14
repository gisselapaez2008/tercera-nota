

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[6];
        String[] inverso = new String[6];

        // Leer nombres
        for (int i = 0; i < 6; i++) {

            System.out.print("Ingrese un nombre: ");
            nombres[i] = entrada.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < 6; i++) {
            inverso[i] = nombres[5 - i];
        }

        // Mostrar original
        System.out.println("\nVector original:");

        for (int i = 0; i < 6; i++) {
            System.out.println(nombres[i]);
        }

        // Mostrar inverso
        System.out.println("\nVector inverso:");

        for (int i = 0; i < 6; i++) {
            System.out.println(inverso[i]);
        }

        entrada.close();
    }
}
