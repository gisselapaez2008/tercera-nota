
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] edades = {10, 12, 14, 16, 18, 20};
        int buscada = 16;

        int posicion = Arrays.binarySearch(edades, buscada);

        if (posicion >= 0) {
            System.out.println("Edad encontrada: " + buscada);
            System.out.println("Posicion: " + posicion);
        } else {
            System.out.println("Edad no encontrada.");
        }
    }
}


