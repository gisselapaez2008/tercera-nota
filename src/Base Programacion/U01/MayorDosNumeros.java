
import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        if (num1 > num2) {

            System.out.println("El numero mayor es: " + num1);

        } else if (num2 > num1) {

            System.out.println("El numero mayor es: " + num2);

        } else {

            System.out.println("Los numeros son iguales.");
        }

        entrada.close();
    }
}
