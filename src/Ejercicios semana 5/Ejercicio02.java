public class Ejercicio02 {
    public static void main(String[] args) {

        int[] numeros = {-3, 5, 8, -2, 10, -6};
        int sumaPositivos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
            }
        }

        System.out.println("La suma de números positivos es: " + sumaPositivos);
    }
}