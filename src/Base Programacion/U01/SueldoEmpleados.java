
import java.util.Scanner;

public class SueldoEmpleados {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador1 = 0;
        int contador2 = 0;

        double sueldo;
        double total = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldo = entrada.nextDouble();

            total = total + sueldo;

            if (sueldo >= 100 && sueldo <= 300) {
                contador1++;
            } else if (sueldo > 300) {
                contador2++;
            }
        }

        System.out.println("\nRESULTADOS");
        System.out.println("Empleados que cobran entre $100 y $300: " + contador1);
        System.out.println("Empleados que cobran mas de $300: " + contador2);
        System.out.println("Total gastado en sueldos: $" + total);

        entrada.close();
    }
}
