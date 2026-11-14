

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] salarios = new double[4][5];

        double[] totalDepartamento = new double[4];

        double[] promedioDepartamento = new double[4];

        // Leer salarios
        for (int i = 0; i < 4; i++) {

            System.out.println("\nDepartamento " + (i + 1));

            for (int j = 0; j < 5; j++) {

                System.out.print("Salario del empleado "
                        + (j + 1) + ": ");

                salarios[i][j] = entrada.nextDouble();
            }
        }

        // Mostrar salarios
        System.out.println("\nSALARIOS DE LOS EMPLEADOS:");

        for (int i = 0; i < 4; i++) {

            System.out.println("\nDepartamento " + (i + 1));

            for (int j = 0; j < 5; j++) {

                System.out.println("Empleado " + (j + 1)
                        + ": $" + salarios[i][j]);
            }
        }

        // Calcular total y promedio por departamento
        double totalEmpresa = 0;

        for (int i = 0; i < 4; i++) {

            totalDepartamento[i] = 0;

            for (int j = 0; j < 5; j++) {

                totalDepartamento[i] += salarios[i][j];
            }

            promedioDepartamento[i] = totalDepartamento[i] / 5;

            totalEmpresa += totalDepartamento[i];

            System.out.println("\nDepartamento " + (i + 1));
            System.out.println("Total salarios: $"
                    + totalDepartamento[i]);

            System.out.println("Promedio salarial: $"
                    + promedioDepartamento[i]);
        }

        // Buscar salario más alto
        double salarioMayor = salarios[0][0];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {

                if (salarios[i][j] > salarioMayor) {
                    salarioMayor = salarios[i][j];
                }
            }
        }

        // Buscar departamento que más paga
        int departamentoMayor = 0;

        for (int i = 1; i < 4; i++) {

            if (totalDepartamento[i] >
                    totalDepartamento[departamentoMayor]) {

                departamentoMayor = i;
            }
        }

        // Mostrar resultados
        System.out.println("\nTOTAL PAGADO POR LA EMPRESA: $"
                + totalEmpresa);

        System.out.println("Salario mas alto: $" + salarioMayor);

        System.out.println("Departamento que mas paga: "
                + (departamentoMayor + 1));

        System.out.println("Total pagado por ese departamento: $"
                + totalDepartamento[departamentoMayor]);

        entrada.close();
    }
}
