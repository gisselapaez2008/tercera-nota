
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el cargo del empleado: ");
        String cargo = scanner.nextLine();

        System.out.print("Ingrese el salario mensual: ");
        double salario = scanner.nextDouble();

        System.out.println("Empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario mensual: $" + salario);

        scanner.close();
    }
}
