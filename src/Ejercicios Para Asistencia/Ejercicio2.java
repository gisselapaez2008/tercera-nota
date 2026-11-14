
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[][] minima = new double[7][2];
        double[][] maxima = new double[7][2];

        double[] media = new double[7];

        double menor = Double.MAX_VALUE;
        double mayor = Double.MIN_VALUE;

        int diaMayor = 0;
        int diaMenor = 0;
        int contador = 0;

        // Leer temperaturas
        for (int i = 0; i < 7; i++) {

            System.out.println("\nDia " + (i + 1));

            for (int j = 0; j < 2; j++) {

                System.out.print("Temperatura minima registro " + (j + 1) + ": ");
                minima[i][j] = entrada.nextDouble();

                System.out.print("Temperatura maxima registro " + (j + 1) + ": ");
                maxima[i][j] = entrada.nextDouble();
            }
        }

        // Calcular medias y buscar temperaturas extremas
        for (int i = 0; i < 7; i++) {

            double suma = 0;

            for (int j = 0; j < 2; j++) {

                suma += minima[i][j] + maxima[i][j];

                if (minima[i][j] < menor) {
                    menor = minima[i][j];
                    diaMenor = i + 1;
                }

                if (maxima[i][j] > mayor) {
                    mayor = maxima[i][j];
                    diaMayor = i + 1;
                }

                if (maxima[i][j] > 30) {
                    contador++;
                }
            }

            media[i] = suma / 4;
        }

        // Mostrar temperaturas medias
        System.out.println("\nTEMPERATURA MEDIA:");

        for (int i = 0; i < 7; i++) {

            System.out.println("Dia " + (i + 1) + ": " + media[i]);
        }

        System.out.println("\nTemperatura maxima mas alta: " + mayor);
        System.out.println("Dia: " + diaMayor);

        System.out.println("\nTemperatura minima mas baja: " + menor);
        System.out.println("Dia: " + diaMenor);

        System.out.println("\nRegistros con maxima superior a 30 grados: "
                + contador);

        entrada.close();
    }
}
