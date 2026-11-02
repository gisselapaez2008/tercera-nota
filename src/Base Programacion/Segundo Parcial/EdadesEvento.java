

import java.util.Scanner;

public class EdadesEvento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador18a30 = 0;
        int contadorMayores30 = 0;
        int sumaEdades = 0;

        System.out.print("Ingrese la cantidad de personas: ");
        n = entrada.nextInt();

        int[] edades = new int[n];

        // Ingresar las edades
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = entrada.nextInt();
        }

        // Procesar las edades
        for (int i = 0; i < n; i++) {

            if (edades[i] >= 18 && edades[i] <= 30) {
                contador18a30++;
            }

            if (edades[i] > 30) {
                contadorMayores30++;
            }

            sumaEdades += edades[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Personas entre 18 y 30 años: " + contador18a30);
        System.out.println("Personas mayores de 30 años: " + contadorMayores30);
        System.out.println("Suma total de las edades: " + sumaEdades);

        entrada.close();
    }
}
