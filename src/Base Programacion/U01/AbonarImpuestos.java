
import java.util.Scanner;

public class AbonarImpuestos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sueldo;

        System.out.print("Ingrese su sueldo en dolares: ");
        sueldo = entrada.nextDouble();

        if (sueldo > 3000) {

            System.out.println("Debe abonar impuestos.");

        }

        entrada.close();
    }
}
