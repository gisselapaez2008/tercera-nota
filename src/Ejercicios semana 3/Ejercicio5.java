
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el kilometraje recorrido: ");
        double kilometraje = scanner.nextDouble();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometraje: " + kilometraje + " km");

        scanner.close();
    }
}
