
import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {15, 3, 12, 6, 9, 1};
        int buscado = 12;

        Arrays.sort(numeros);

        System.out.println("Numeros ordenados: " + Arrays.toString(numeros));

        int posicion = Arrays.binarySearch(numeros, buscado);

        if (posicion >= 0) {
            System.out.println("Numero encontrado: " + buscado);
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Numero no encontrado.");
        }
    }
}


