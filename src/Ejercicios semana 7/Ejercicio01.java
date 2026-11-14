

public class Ejercicio01 {
    public static void main(String[] args) {

        int[][] diagonal = new int[6][6];

        // Llenar matriz
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar matriz
        System.out.println("MATRIZ DIAGONAL:");

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                System.out.print(diagonal[i][j] + " ");
            }

            System.out.println();
        }
    }
}
