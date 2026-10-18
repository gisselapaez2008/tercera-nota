
import java.util.Scanner;

public class ProyectoMini {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3, media;

        System.out.print("Ingrese el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        numero3 = scanner.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media de los tres numeros es: " + media);

        scanner.close();
    }
}
