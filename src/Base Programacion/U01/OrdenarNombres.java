
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad;

        System.out.print("Ingrese la cantidad de personas: ");
        cantidad = entrada.nextInt();

        entrada.nextLine();

        String[] nombres = new String[cantidad];

        // Ingresar los nombres
        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();

        }

        // Ordenar los nombres alfabeticamente
        for (int i = 0; i < cantidad - 1; i++) {

            for (int j = i + 1; j < cantidad; j++) {

                if (nombres[i].compareToIgnoreCase(nombres[j]) > 0) {

                    String auxiliar = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxiliar;

                }

            }

        }

        // Mostrar los nombres ordenados
        System.out.println("\nNombres ordenados alfabeticamente:");

        for (int i = 0; i < cantidad; i++) {

            System.out.println(nombres[i]);

        }

        entrada.close();
    }
}

