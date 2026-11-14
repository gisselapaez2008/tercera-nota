
import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;
        double mayor, menor;

        // Leer las notas
        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota incorrecta. Debe estar entre 0 y 10.");
                System.out.print("Ingrese nuevamente: ");
                notas[i] = entrada.nextDouble();
            }

            suma = suma + notas[i];
        }

        mayor = notas[0];
        menor = notas[0];

        // Buscar nota mayor y menor
        for (int i = 0; i < 5; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double promedio = suma / 5;

        // Mostrar resultados
        System.out.println("\nTodas las notas:");

        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);

        entrada.close();
    }
}
