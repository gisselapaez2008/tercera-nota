
import java.util.Scanner;

public class ContarNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;
        int mayores = 0;
        int menores = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese la nota del alumno " + i + ": ");
            nota = entrada.nextDouble();

            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("Notas mayores o iguales a 7: " + mayores);
        System.out.println("Notas menores a 7: " + menores);

        entrada.close();
    }
}
