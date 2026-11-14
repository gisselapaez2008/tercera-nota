
import java.util.Scanner;

public class Kilometros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos conductores tiene la empresa: ");
        int n = entrada.nextInt();
        entrada.nextLine();

        String[] nombre = new String[n];
        int[][] kms = new int[n][7];
        int[] total_kms = new int[n];

        String[] dias = {
            "Lunes", "Martes", "Miercoles",
            "Jueves", "Viernes", "Sabado", "Domingo"
        };

        // Leer nombres y kilómetros
        for (int i = 0; i < n; i++) {

            System.out.print("\nNombre del conductor: ");
            nombre[i] = entrada.nextLine();

            total_kms[i] = 0;

            for (int j = 0; j < 7; j++) {

                System.out.print("Kilometros del dia " + dias[j] + ": ");
                kms[i][j] = entrada.nextInt();

                total_kms[i] = total_kms[i] + kms[i][j];
            }

            entrada.nextLine();
        }

        // Mostrar resultados
        System.out.println("\nREPORTE DE CONDUCTORES");

        for (int i = 0; i < n; i++) {

            System.out.println("\nConductor: " + nombre[i]);

            System.out.println("Kilometros por dia:");

            for (int j = 0; j < 7; j++) {
                System.out.println(dias[j] + ": " + kms[i][j]);
            }

            System.out.println("Total de kilometros: " + total_kms[i]);
        }

        entrada.close();
    }
}

