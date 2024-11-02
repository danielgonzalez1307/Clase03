public class Ejercicio05 {
    public static void main(String[] args) {
        // Ejercicio 05
        var precioOriginal = 660;
        var descuento = 0.1;
        var valorDelDescuento = precioOriginal * descuento;
        var valorConDescuento = precioOriginal - valorDelDescuento;
        System.out.println("El valor a pagar con el 10% de descuento es de " + valorConDescuento + " Euros");

    }
}
