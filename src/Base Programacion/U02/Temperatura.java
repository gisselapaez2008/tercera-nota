
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] minima = new double[5];
        double[] maxima = new double[5];
        double[] media = new double[5];

        // Leer temperaturas
        for (int i = 0; i < 5; i++) {

            System.out.println("\nDia " + (i + 1));

            System.out.print("Temperatura minima: ");
            minima[i] = entrada.nextDouble();

            System.out.print("Temperatura maxima: ");
            maxima[i] = entrada.nextDouble();

            // Calcular temperatura media
            media[i] = (minima[i] + maxima[i]) / 2;
        }

        // Mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada dia:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Dia " + (i + 1) + ": " + media[i]);
        }

        // Buscar la temperatura mínima más baja
        double menor = minima[0];

        for (int i = 1; i < 5; i++) {

            if (minima[i] < menor) {
                menor = minima[i];
            }
        }

        // Mostrar los días con menor temperatura
        System.out.println("\nDias con menos temperatura:");

        for (int i = 0; i < 5; i++) {

            if (minima[i] == menor) {
                System.out.println("Dia " + (i + 1));
            }
        }

        // Buscar una temperatura máxima
        System.out.print("\nIngrese una temperatura: ");
        double temperatura = entrada.nextDouble();

        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {

            if (maxima[i] == temperatura) {

                System.out.println("Coincide con el dia " + (i + 1));
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No existe ninguna coincidencia.");
        }

        entrada.close();
    }
}

