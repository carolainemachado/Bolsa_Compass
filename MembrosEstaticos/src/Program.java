import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    /*
    FINAL = para informar que o valor e constante e nao
    pode mudar
    PI = nome para constanti e em letras maiusculas
     */
    public static final double PI = 3.14159;

    /*
    pq tem static no main e nos metodos, pq no main tem static
    entao voce nao pode querer chamar um metodo que e estatico
    dentro de um que e static
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);
        sc.close();
    }
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}