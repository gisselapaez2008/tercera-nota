
import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();

        if (numero > 0) {

            System.out.println("El numero es positivo.");

        } else if (numero < 0) {

            System.out.println("El numero es negativo.");

        } else {

            System.out.println("El numero es nulo (cero).");
        }

        entrada.close();
    }
}

