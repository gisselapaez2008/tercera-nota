

import java.util.Scanner;

public class DosNumeros{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        if (num1 > num2) {

            System.out.println("La suma es: " + (num1 + num2));
            System.out.println("La diferencia es: " + (num1 - num2));

        } else {

            System.out.println("El producto es: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("La division es: " + (num1 / num2));
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }

        entrada.close();
    }
}
