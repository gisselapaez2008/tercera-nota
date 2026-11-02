
import java.util.Scanner;

public class PesoPaquetes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int contador1a20 = 0;
        int contadorMayores20 = 0;
        double pesoTotal = 0;

        System.out.print("Ingrese la cantidad de paquetes: ");
        n = entrada.nextInt();

        double[] pesos = new double[n];

        // Ingresar los pesos
        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = entrada.nextDouble();

            while (pesos[i] < 1 || pesos[i] > 50) {
                System.out.println("Error. El peso debe estar entre 1 y 50 kg.");
                System.out.print("Ingrese nuevamente el peso: ");
                pesos[i] = entrada.nextDouble();
            }
        }

        // Procesar los pesos
        for (int i = 0; i < n; i++) {

            if (pesos[i] >= 1 && pesos[i] <= 20) {
                contador1a20++;
            }

            if (pesos[i] > 20) {
                contadorMayores20++;
            }

            pesoTotal += pesos[i];
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Paquetes entre 1 y 20 kg: " + contador1a20);
        System.out.println("Paquetes mayores de 20 kg: " + contadorMayores20);
        System.out.println("Peso total transportado: " + pesoTotal + " kg");

        entrada.close();
    }
}
