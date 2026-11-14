
import java.util.Scanner;

public class Sueldo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double sueldo;
        int antiguedad;

        System.out.print("Ingrese el sueldo del operario: ");
        sueldo = entrada.nextDouble();

        System.out.print("Ingrese los años de antiguedad: ");
        antiguedad = entrada.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {

            System.out.println("Cumple la condicion A.");

        } else if (sueldo < 500 && antiguedad < 10) {

            System.out.println("Cumple la condicion B.");

        } else if (sueldo >= 500) {

            System.out.println("Sueldo sin cambios: " + sueldo);
        }

        entrada.close();
    }
}
