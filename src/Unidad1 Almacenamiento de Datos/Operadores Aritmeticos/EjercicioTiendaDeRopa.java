
public class EjercicioTiendaDeRopa {
    public static void main(String[] args) {

        double camiseta = 25;
        double pantalon = 30;

        double descuento = 0.15;
        double descuentoAdicional = 0.05;

        double precioCamiseta = camiseta - (camiseta * descuento);
        double precioPantalon = pantalon - (pantalon * descuento);

        double segundaCamiseta = precioCamiseta
                - (precioCamiseta * descuentoAdicional);

        double total = precioCamiseta + precioPantalon;

        System.out.println("Precio de la camiseta: $"
                + precioCamiseta);

        System.out.println("Precio del pantalon: $"
                + precioPantalon);

        System.out.println("Total de ambas prendas: $"
                + total);

        System.out.println("Precio de la segunda camiseta: $"
                + segundaCamiseta);

        System.out.println("Total con las tres prendas: $"
                + (total + segundaCamiseta));
    }
}
