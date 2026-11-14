
public class MatrizDiagonal {
    public static void main(String[] args) {

        int[][] diagonal = new int[5][5];

        // Llenar la matriz
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        // Mostrar matriz
        System.out.println("MATRIZ DIAGONAL:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(diagonal[i][j] + " ");
            }

            System.out.println();
        }
    }
}
