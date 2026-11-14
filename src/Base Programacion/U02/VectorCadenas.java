
import java.util.Scanner;

public class VectorCadenas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] vector1 = new String[5];
        String[] vector2 = new String[5];

        // Leer las palabras
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra: ");
            vector1[i] = entrada.nextLine();
        }

        // Copiar en orden inverso
        for (int i = 0; i < 5; i++) {
            vector2[i] = vector1[4 - i];
        }

        // Mostrar el segundo vector
        System.out.println("\nVector en orden inverso:");

        for (int i = 0; i < 5; i++) {
            System.out.println(vector2[i]);
        }

        entrada.close();
    }
}

