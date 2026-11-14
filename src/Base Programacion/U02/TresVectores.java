
import java.util.Scanner;

public class TresVectores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Llenar el primer vector
        System.out.println("Ingrese los numeros del vector 1:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero: ");
            vector1[i] = entrada.nextInt();
        }

        // Llenar el segundo vector
        System.out.println("\nIngrese los numeros del vector 2:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero: ");
            vector2[i] = entrada.nextInt();
        }

        // Sumar los vectores
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar resultado
        System.out.println("\nVector 3 (suma):");

        for (int i = 0; i < 5; i++) {
            System.out.println(vector3[i]);
        }

        entrada.close();
    }
}

