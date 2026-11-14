
import java.util.Scanner;

public class ClasificacionNivel {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int correctas, total;
        double porcentaje;

        System.out.print("Ingrese la cantidad de preguntas correctas: ");
        correctas = entrada.nextInt();

        System.out.print("Ingrese la cantidad total de preguntas: ");
        total = entrada.nextInt();

        if (total <= 0 || correctas < 0 || correctas > total) {
            System.out.println("Datos incorrectos.");
        } else {

            porcentaje = (correctas * 100.0) / total;

            System.out.println("Porcentaje obtenido: " + porcentaje + "%");

            if (porcentaje >= 90) {
                System.out.println("Nivel maximo.");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio.");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular.");
            } else {
                System.out.println("Fuera de nivel.");
            }
        }

        entrada.close();
    }
}
