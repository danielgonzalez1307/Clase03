import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        // Ejerccio 07
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var numeroUno = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        var numeroDos = scanner.nextInt();

        var suma = numeroUno + numeroDos;
        var resta = numeroUno - numeroDos;
        var multiplicacion = numeroUno * numeroDos;
        var division = numeroUno / numeroDos;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);

        scanner.close();
    }
}
