public class Ejercicio05 {
    public static void main(String[] args) {

        int[] numeros = {3, 6, 8, 9, 12, 14, 15};
        int contadorMultiplos = 0;

        for (int numero : numeros) {
            if (numero % 3 == 0) {
                contadorMultiplos++;
            }
        }

        System.out.println("Cantidad de múltiplos de 3: " + contadorMultiplos);
    }
}
