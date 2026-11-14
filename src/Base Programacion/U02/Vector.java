

import java.util.Random;

public class Vector {
    public static void main(String[] args) {

        int[] vector_numeros = new int[10];
        Random aleatorio = new Random();

        // Llenar el vector
        for (int i = 0; i < 10; i++) {
            vector_numeros[i] = aleatorio.nextInt(10) + 1;
        }

        // Mostrar número, cuadrado y cubo
        for (int i = 0; i < 10; i++) {

            int numero = vector_numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;

            System.out.println("Numero: " + numero);
            System.out.println("Cuadrado: " + cuadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("----------------");
        }
    }
}
