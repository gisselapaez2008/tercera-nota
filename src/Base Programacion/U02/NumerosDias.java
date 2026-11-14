
import java.util.Scanner;

public class NumerosDias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] dias = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Ingrese el numero del mes (1-12): ");
        int numero = entrada.nextInt();

        if (numero >= 1 && numero <= 12) {

            System.out.println("Mes: " + meses[numero - 1]);
            System.out.println("Dias: " + dias[numero - 1]);

        } else {
            System.out.println("Numero de mes incorrecto.");
        }

        entrada.close();
    }
}
