import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var num01 = scanner.nextFloat();

        System.out.print("Ingrese el segundo numero: ");
        var num02 = scanner.nextFloat();

        System.out.print("Ingrese el tercer numero: ");
        var num03 = scanner.nextFloat();

        var media = (num01 + num02 + num03) / 3;

        System.out.println("La media aritmetica de esos tres numeros es: " + media);

        scanner.close();
    }
}
