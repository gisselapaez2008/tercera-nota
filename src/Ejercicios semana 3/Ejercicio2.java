
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = scanner.nextInt();

        System.out.println("Producto: " + producto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);

        scanner.close();
    }
}
