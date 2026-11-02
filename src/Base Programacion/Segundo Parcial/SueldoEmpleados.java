
import java.util.Scanner;

public class SueldoEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantEmpleados;
        int cantEntre100Y300 = 0;
        int cantMayor300 = 0;
        double importeTotal = 0;
        int i = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        cantEmpleados = sc.nextInt();

        while (i < cantEmpleados) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            double sueldo = sc.nextDouble();

            if (sueldo >= 100 && sueldo <= 500) {
                importeTotal += sueldo;
                i++;

                if (sueldo <= 300) {
                    cantEntre100Y300++;
                } else {
                    cantMayor300++;
                }
            } else {
                System.out.println("Sueldo inválido. Debe estar entre 100 y 500.");
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de empleados con sueldo entre 100 y 300: " + cantEntre100Y300);
        System.out.println("Cantidad de empleados con sueldo mayor a 300: " + cantMayor300);
        System.out.println("Importe total de sueldos: " + importeTotal);

        sc.close();
    }
}