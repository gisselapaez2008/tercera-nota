
import java.util.Scanner;

public class FinalizacionNegativa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int cantidad = 0;
        int numero;

        // Leer números
        while (cantidad < 10) {

            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                break;
            }

            numeros[cantidad] = numero;
            cantidad++;
        }

        // Mostrar los números ingresados
        System.out.println("\nNumeros introducidos:");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
