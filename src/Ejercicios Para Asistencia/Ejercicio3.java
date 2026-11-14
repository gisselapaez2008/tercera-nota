

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] notas = new double[5][3];

        double[] promedioEstudiante = new double[5];

        double[] promedioAsignatura = new double[3];

        // Leer notas
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEstudiante " + (i + 1));

            for (int j = 0; j < 3; j++) {

                System.out.print("Nota asignatura " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();

                while (notas[i][j] < 0 || notas[i][j] > 5) {
                    System.out.print("Nota incorrecta. Ingrese entre 0 y 5: ");
                    notas[i][j] = entrada.nextDouble();
                }
            }
        }

        // Promedio de cada estudiante
        System.out.println("\nPROMEDIO DE ESTUDIANTES:");

        for (int i = 0; i < 5; i++) {

            double suma = 0;

            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }

            promedioEstudiante[i] = suma / 3;

            System.out.println("Estudiante " + (i + 1) + ": "
                    + promedioEstudiante[i]);
        }

        // Promedio de cada asignatura
        System.out.println("\nPROMEDIO DE ASIGNATURAS:");

        for (int j = 0; j < 3; j++) {

            double suma = 0;

            for (int i = 0; i < 5; i++) {
                suma += notas[i][j];
            }

            promedioAsignatura[j] = suma / 5;

            System.out.println("Asignatura " + (j + 1) + ": "
                    + promedioAsignatura[j]);
        }

        // Buscar estudiante con promedio más alto
        int mejor = 0;

        for (int i = 1; i < 5; i++) {

            if (promedioEstudiante[i] > promedioEstudiante[mejor]) {
                mejor = i;
            }
        }

        System.out.println("\nEstudiante con promedio mas alto: "
                + (mejor + 1));

        // Contar estudiantes que aprobaron todas
        int aprobados = 0;

        for (int i = 0; i < 5; i++) {

            boolean todasAprobadas = true;

            for (int j = 0; j < 3; j++) {

                if (notas[i][j] < 3) {
                    todasAprobadas = false;
                }
            }

            if (todasAprobadas) {
                aprobados++;
            }
        }

        System.out.println("Estudiantes que aprobaron todas: "
                + aprobados);

        entrada.close();
    }
}
