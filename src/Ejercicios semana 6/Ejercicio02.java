
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double suma = 0;
        double mayor, menor;

        // Leer temperaturas
        for (int i = 0; i < 7; i++) {

            System.out.print("Temperatura del dia " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();

            suma = suma + temperaturas[i];
        }

        mayor = temperaturas[0];
        menor = temperaturas[0];

        // Buscar mayor y menor
        for (int i = 0; i < 7; i++) {

            if (temperaturas[i] > mayor) {
                mayor = temperaturas[i];
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        double promedio = suma / 7;

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Temperatura mayor: " + mayor);
        System.out.println("Temperatura menor: " + menor);

        // Días superiores al promedio
        System.out.println("\nDias superiores al promedio:");

        for (int i = 0; i < 7; i++) {

            if (temperaturas[i] > promedio) {
                System.out.println("Dia " + (i + 1));
            }
        }

        entrada.close();
    }
}

