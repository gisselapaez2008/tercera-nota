public class Ejercicio03
 {
    public static void main(String[] args) {

        int[] numeros = {4, 12, 8, 15, 20, 3};
        int contador = 0;

        for (int numero : numeros) {
            if (numero > 10) {
                contador++;
            }
        }

        System.out.println("Cantidad de números mayores a 10: " + contador);
    }
}