
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad actual: ");
        int edad = scanner.nextInt();

        int edadFutura = edad + 1;

        System.out.println(nombre + ", el proximo año tendras "
                + edadFutura + " años.");

        scanner.close();
    }
}

