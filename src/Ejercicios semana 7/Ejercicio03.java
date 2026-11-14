

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[10];
        int[] edades = new int[10];

        int suma = 0;
        int contador18 = 0;

        // Leer datos
        for (int i = 0; i < 10; i++) {

            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();

            System.out.print("Edad: ");
            edades[i] = entrada.nextInt();
            entrada.nextLine();

            suma = suma + edades[i];

            if (edades[i] == 18) {
                contador18++;
            }
        }

        int mayor = edades[0];
        int menor = edades[0];

        // Buscar mayor y menor edad
        for (int i = 1; i < 10; i++) {

            if (edades[i] > mayor) {
                mayor = edades[i];
            }

            if (edades[i] < menor) {
                menor = edades[i];
            }
        }

        System.out.println("\nPersonas mayores de edad:");

        for (int i = 0; i < 10; i++) {

            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i]);
            }
        }

        System.out.println("\nPersona de mayor edad:");

        for (int i = 0; i < 10; i++) {

            if (edades[i] == mayor) {
                System.out.println(nombres[i] + " - " + mayor);
            }
        }

        System.out.println("\nPersona de menor edad:");

        for (int i = 0; i < 10; i++) {

            if (edades[i] == menor) {
                System.out.println(nombres[i] + " - " + menor);
            }
        }

        System.out.println("Promedio de edades: " + (suma / 10.0));
        System.out.println("Personas con 18 años: " + contador18);

        entrada.close();
    }
}
