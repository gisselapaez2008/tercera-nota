
import java.util.Scanner;

public class EdadesAlumno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nombres = new String[100];
        int[] edades = new int[100];

        int cantidad = 0;

        // Leer nombres y edades
        while (cantidad < 100) {

            System.out.print("Ingrese el nombre (* para terminar): ");
            String nombre = entrada.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            nombres[cantidad] = nombre;

            System.out.print("Ingrese la edad: ");
            edades[cantidad] = entrada.nextInt();
            entrada.nextLine();

            cantidad++;
        }

        // Mostrar mayores de edad
        System.out.println("\nAlumnos mayores de edad:");

        for (int i = 0; i < cantidad; i++) {

            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " - " + edades[i] + " años");
            }
        }

        // Buscar la edad mayor
        if (cantidad > 0) {

            int mayor = edades[0];

            for (int i = 1; i < cantidad; i++) {
                if (edades[i] > mayor) {
                    mayor = edades[i];
                }
            }

            // Mostrar los alumnos de mayor edad
            System.out.println("\nAlumnos de mayor edad:");

            for (int i = 0; i < cantidad; i++) {

                if (edades[i] == mayor) {
                    System.out.println(nombres[i] + " - " + edades[i] + " años");
                }
            }

        } else {
            System.out.println("No se ingresaron alumnos.");
        }

        entrada.close();
    }
}
