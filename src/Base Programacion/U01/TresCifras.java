
import java.util.Scanner;

public class TresCifras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = entrada.nextInt();

        if (numero >= 1 && numero <= 9) {

            System.out.println("El numero tiene una cifra.");

        } else if (numero >= 10 && numero <= 99) {

            System.out.println("El numero tiene dos cifras.");

        } else if (numero >= 100 && numero <= 999) {

            System.out.println("El numero tiene tres cifras.");

        } else {

            System.out.println("Error: el numero debe ser positivo y tener maximo tres cifras.");
        }

        entrada.close();
    }
}
