import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de su mascota: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.println(nombre + " tiene " + edad + " años y pesa " + peso + " kg.");
    }
}
    
