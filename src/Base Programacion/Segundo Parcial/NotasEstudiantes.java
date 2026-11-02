

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador3a4 = 0;
        int contadorMayores4 = 0;
        double sumaNotas = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = entrada.nextInt();

        double[] notas = new double[n];

        // Ingresar las notas
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();

            while (notas[i] < 0 || notas[i] > 5) {
                System.out.println("Error. La nota debe estar entre 0 y 5.");
                System.out.print("Ingrese nuevamente la nota: ");
                notas[i] = entrada.nextDouble();
            }
        }

        // Procesar las notas
        for (int i = 0; i < n; i++) {

            if (notas[i] >= 3.0 && notas[i] <= 4.0) {
                contador3a4++;
            }

            if (notas[i] > 4.0) {
                contadorMayores4++;
            }

            sumaNotas += notas[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Estudiantes entre 3.0 y 4.0: " + contador3a4);
        System.out.println("Estudiantes con nota mayor a 4.0: " + contadorMayores4);
        System.out.println("Suma total de las notas: " + sumaNotas);

        entrada.close();
    }
}
