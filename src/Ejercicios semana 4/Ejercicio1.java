import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = Scanner.next();

        System.out.println("Hola, " + nombre + "!");
    }
}