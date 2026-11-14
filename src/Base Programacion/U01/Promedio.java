

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado");
        }

        entrada.close();
    }
}
