
public class Ejercicio01 {
    public static void main(String[] args) {

        int[] numeros = {2, 5, 7, 8, 10, 13};
        int contadorImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}