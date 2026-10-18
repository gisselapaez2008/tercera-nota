
public class DistanciasCiudades {
    public static void main(String[] args) {

        // Crear una matriz con las distancias entre ciudades
        int[][] distancias = {
            {0, 100, 250},
            {100, 0, 150},
            {250, 150, 0}
        };

        // Mostrar la distancia entre Ciudad 1 y Ciudad 3
        System.out.println(
            "La distancia entre Ciudad 1 y Ciudad 3 es: "
            + distancias[0][2] + " km"
        );
    }
}
