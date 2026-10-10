
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        double total = precio * cantidad;

        System.out.println("\n--- Resumen de la compra ---");
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: $" + total);

        scanner.close();
    }
}
