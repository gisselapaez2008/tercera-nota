import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su nota final: ");
        double nota = scanner.nextDouble();

        System.out.println(nombre + " tiene " + edad + " años y obtuvo una nota de " + nota + ".");
    }
}
