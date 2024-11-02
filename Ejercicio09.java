import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Celsius: ");
        var Celsius = scanner.nextFloat();

        var Fahrenheit = Celsius * 9 / 5 + 32;
        var Kelvin = Celsius + 273.15;

        System.out.println(Celsius + " Celsius son " + Fahrenheit + " Fahrenheit");
        System.out.println(Celsius + " Celsius son " + Kelvin + " Kelvin");

        scanner.close();

    }
}
