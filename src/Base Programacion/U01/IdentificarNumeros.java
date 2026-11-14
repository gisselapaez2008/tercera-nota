
import java.util.Scanner;

public class IdentificarNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = entrada.nextInt();

        if (numero >= 1 && numero <= 9) {

            System.out.println("El numero tiene un digito.");

        } else if (numero >= 10 && numero <= 99) {

            System.out.println("El numero tiene dos digitos.");

        } else {

            System.out.println("Error: ingrese un numero entre 1 y 99.");
        }

        entrada.close();
    }
}

