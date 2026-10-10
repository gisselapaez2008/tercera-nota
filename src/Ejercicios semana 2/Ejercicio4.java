
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11};
        int buscado = 6;

        int posicion = Arrays.binarySearch(numeros, buscado);

        if (posicion >= 0) {
            System.out.println("Numero encontrado en la posicion: " + posicion);
        } else {
            System.out.println("El numero " + buscado + " no fue encontrado.");
        }
    }
}

