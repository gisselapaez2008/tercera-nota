
import java.util.Scanner;

public class EjercicioPromedioArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            suma = suma + numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}

