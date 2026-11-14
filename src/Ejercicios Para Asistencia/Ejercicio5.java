

public class Ejercicio5 {
    public static void main(String[] args) {

        int[][] marco = new int[6][10];

        // Llenar matriz
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == 0 || i == 5 || j == 0 || j == 9) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar matriz
        System.out.println("MATRIZ CON MARCO:");

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(marco[i][j]);
            }

            System.out.println();
        }
    }
}
