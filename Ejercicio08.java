import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        // Ejercicio 8
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo: ");
        var base = scanner.nextInt();

        System.out.print("Ingrese la altura del triangulo: ");
        var altura = scanner.nextInt();

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del triangulo es: " + perimetro);

        scanner.close();

    }
}
