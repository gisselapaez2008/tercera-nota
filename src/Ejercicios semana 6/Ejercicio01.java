
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int suma = 0;

        // Llenar el vector
        for (int i = 0; i < 10; i++) {
            numeros[i] = aleatorio.nextInt(50) + 1;
        }

        // Mostrar y calcular
        System.out.println("Numeros del vector:");

        for (int i = 0; i < 10; i++) {

            System.out.print(numeros[i] + " ");

            suma = suma + numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nCantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Suma total: " + suma);
    }
}
