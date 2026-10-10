
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] notas = {2, 3, 4, 5, 6, 7};
        int buscada = 5;

        int posicion = Arrays.binarySearch(notas, buscada);

        if (posicion >= 0) {
            System.out.println("Nota encontrada: " + buscada);
            System.out.println("Se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("La nota no existe.");
        }
    }
}


