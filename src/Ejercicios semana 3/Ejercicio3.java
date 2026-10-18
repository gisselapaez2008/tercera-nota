
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de su mascota: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la especie de su mascota: ");
        String especie = scanner.nextLine();

        System.out.print("Ingrese la edad de su mascota: ");
        int edad = scanner.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");

        scanner.close();
    }
}
