
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12};
        int buscado = 8;

        int posicion = Arrays.binarySearch(numeros, buscado);

        if (posicion >= 0) {
            System.out.println("Numero encontrado en la posicion: " + posicion);
        } else {
            System.out.println("Numero no encontrado.");
        }
    }
}


