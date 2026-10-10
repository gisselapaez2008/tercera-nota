
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.println("\n--- Datos personales ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Ciudad: " + ciudad);

        scanner.close();
    }
}


