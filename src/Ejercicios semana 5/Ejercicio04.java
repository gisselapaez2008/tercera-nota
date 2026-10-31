public class Ejercicio04 {
    public static void main(String[] args) {

        int[] numeros = {15, 8, 25, 4, 30, 12};
        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
